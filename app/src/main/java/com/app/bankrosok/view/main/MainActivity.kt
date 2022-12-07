package com.app.bankrosok.view.main

import android.Manifest
import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Color
import android.location.Geocoder
import android.location.Location
import android.os.Build
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.app.ActivityCompat
import com.app.bankrosok.view.profile.ProfileActivity
import com.app.bankrosok.R
import com.app.bankrosok.databinding.ActivityMainBinding
import com.app.bankrosok.model.UserLocation
import com.app.bankrosok.sharedpref.UserLocationPreferences
import com.app.bankrosok.view.history.RiwayatActivity
import com.app.bankrosok.view.input.InputDataActivity
import com.app.bankrosok.view.jenis.JenisSampahActivity
import com.app.bankrosok.view.login.LoginActivity
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import im.delight.android.location.SimpleLocation
//import kotlinx.android.synthetic.main.activity_main.*
//import kotlinx.android.synthetic.main.content_main.*
import java.io.IOException
import java.util.*

class MainActivity : AppCompatActivity() {

    var REQ_PERMISSION = 100
    var strCurrentLatitude = 0.0
    var strCurrentLongitude = 0.0
    lateinit var strCurrentLocation: String
    lateinit var simpleLocation: SimpleLocation

    private lateinit var binding: ActivityMainBinding

    private lateinit var userLocationPreferences: UserLocationPreferences
    private lateinit var userLocation: UserLocation
    private lateinit var fusedLocationClient: FusedLocationProviderClient

    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        userLocationPreferences = UserLocationPreferences(this)
        fusedLocationClient = LocationServices.getFusedLocationProviderClient(this)

        firebaseAuth = Firebase.auth
        val firebaseUser = firebaseAuth.currentUser

        if (firebaseUser == null) {
            startActivity(Intent(this@MainActivity, LoginActivity::class.java))
            finish()
            return
        }

        binding.username.text = firebaseUser.displayName
        binding.imageProfile.setOnClickListener {
            startActivity(Intent(this@MainActivity, ProfileActivity::class.java))
        }

        setPermission()
        setStatusBar()
        setLocation()
        setInitLayout()

        binding.locationLayout.setOnClickListener {
            setLocation()

            Toast.makeText(this, "Memperbaharui lokasi...", Toast.LENGTH_SHORT).show()
        }
    }

    @SuppressLint("MissingPermission")
    private fun setLocation() {
        fusedLocationClient.lastLocation.addOnSuccessListener { location: Location? ->
            if (location != null) {
                strCurrentLatitude = location.latitude
                strCurrentLongitude = location.longitude
                strCurrentLocation = "${strCurrentLatitude},${strCurrentLongitude}"

                val geocoder = Geocoder(this, Locale.getDefault())

                try {
                    binding.tvCurrentLocation.text = getString(R.string.getting_location)
                    val addressList = geocoder.getFromLocation(strCurrentLatitude, strCurrentLongitude, 1)

                    if (addressList != null && addressList.size > 0) {
                        val strCurrentLocation = addressList[0].locality
                        val completeAddress = addressList[0].getAddressLine(0)

                        userLocationPreferences.setUserLocation(completeAddress)

                        binding.tvCurrentLocation.text = strCurrentLocation
                        binding.tvCurrentLocation.isSelected = true
                    }
                } catch (e: IOException) {
                    e.printStackTrace()
                }

            } else {
                Toast.makeText(
                    this,
                    "Tidak dapat menentukan lokasi. Pastikan GPS/Lokasi Anda sudah aktif!",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }

    private fun setInitLayout() {
        findViewById<CardView>(R.id.cvInput).setOnClickListener {
            val intent = Intent(this@MainActivity, InputDataActivity::class.java)
            startActivity(intent)
        }

        findViewById<CardView>(R.id.cvKategori).setOnClickListener { v: View? ->
            val intent = Intent(this@MainActivity, JenisSampahActivity::class.java)
            startActivity(intent)
        }

        findViewById<CardView>(R.id.cvHistory).setOnClickListener { v: View? ->
            val intent = Intent(this@MainActivity, RiwayatActivity::class.java)
            startActivity(intent)
        }
    }

    private fun setPermission() {
        if (ActivityCompat.checkSelfPermission(
                this,
                Manifest.permission.ACCESS_FINE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED
            && ActivityCompat.checkSelfPermission(
                this,
                Manifest.permission.ACCESS_COARSE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            ActivityCompat.requestPermissions(
                this,
                arrayOf(Manifest.permission.ACCESS_FINE_LOCATION),
                REQ_PERMISSION
            )
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        for (grantResult in grantResults) {
            if (grantResult == PackageManager.PERMISSION_GRANTED) {
                val intent = intent
                finish()
                startActivity(intent)
            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == REQ_PERMISSION && resultCode == RESULT_OK) {
        }
    }

    private fun setStatusBar() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            window.decorView.systemUiVisibility =
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
        }
        if (Build.VERSION.SDK_INT >= 21) {
            setWindowFlag(this, WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, false)
            window.statusBarColor = Color.TRANSPARENT
        }
    }

    companion object {
        fun setWindowFlag(activity: Activity, bits: Int, on: Boolean) {
            val window = activity.window
            val layoutParams = window.attributes
            if (on) {
                layoutParams.flags = layoutParams.flags or bits
            } else {
                layoutParams.flags = layoutParams.flags and bits.inv()
            }
            window.attributes = layoutParams
        }
    }

}