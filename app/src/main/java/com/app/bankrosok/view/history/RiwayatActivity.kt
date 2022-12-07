package com.app.bankrosok.view.history

import android.app.Activity
import android.content.DialogInterface
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.view.WindowManager
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.app.bankrosok.R
import com.app.bankrosok.databinding.ActivityLoginBinding
import com.app.bankrosok.databinding.ActivityRiwayatBinding
import com.app.bankrosok.model.ModelDatabase
import com.app.bankrosok.utils.FunctionHelper
import com.app.bankrosok.view.history.RiwayatAdapter.RiwayatAdapterCallback
import com.app.bankrosok.viewmodel.RiwayatViewModel
import java.util.*

class RiwayatActivity : AppCompatActivity(), RiwayatAdapterCallback {

    private lateinit var binding: ActivityRiwayatBinding

    var modelDatabaseList: MutableList<ModelDatabase> = ArrayList()
    lateinit var riwayatAdapter: RiwayatAdapter
    lateinit var riwayatViewModel: RiwayatViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityRiwayatBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setStatusBar()
        setToolbar()
        setInitLayout()
        setViewModel()
    }

    private fun setToolbar() {
        setSupportActionBar(binding.toolbar)
        if (supportActionBar != null) {
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
            supportActionBar?.setDisplayShowTitleEnabled(false)
        }
    }

    private fun setInitLayout() {
        binding.tvNotFound.setVisibility(View.GONE)
        riwayatAdapter = RiwayatAdapter(this, modelDatabaseList, this)
        binding.rvHistory.setHasFixedSize(true)
        binding.rvHistory.setLayoutManager(LinearLayoutManager(this))
        binding.rvHistory.setAdapter(riwayatAdapter)
    }

    private fun setViewModel() {
        riwayatViewModel = ViewModelProviders.of(this).get(RiwayatViewModel::class.java)

        riwayatViewModel.totalSaldo.observe(this) { integer ->
            if (integer == null) {
                val jumlahSaldo = 0
                val initSaldo = FunctionHelper.rupiahFormat(jumlahSaldo)
                binding.tvSaldo.text = initSaldo
            } else {
                val initSaldo = FunctionHelper.rupiahFormat(integer)
                binding.tvSaldo.text = initSaldo
            }
        }

        riwayatViewModel.dataBank.observe(this) { modelDatabases: List<ModelDatabase> ->
            if (modelDatabases.isEmpty()) {
                binding.tvNotFound.visibility = View.VISIBLE
                binding.rvHistory.visibility = View.GONE
            } else {
                binding.tvNotFound.visibility = View.GONE
                binding.rvHistory.visibility = View.VISIBLE
            }
            riwayatAdapter.setDataAdapter(modelDatabases)
        }
    }

    private fun setStatusBar() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            window.decorView.systemUiVisibility =
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN or View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
        }
        if (Build.VERSION.SDK_INT >= 21) {
            setWindowFlag(this, WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, false)
            window.statusBarColor = Color.TRANSPARENT
        }
    }

    override fun onDelete(modelDatabase: ModelDatabase?) {
        val alertDialogBuilder = AlertDialog.Builder(this)
        alertDialogBuilder.setMessage("Hapus riwayat ini?")
        alertDialogBuilder.setPositiveButton("Ya, Hapus") { dialogInterface: DialogInterface?, i: Int ->
            val uid = modelDatabase!!.uid
            riwayatViewModel.deleteDataById(uid)
            Toast.makeText(this@RiwayatActivity, "Data yang dipilih sudah dihapus", Toast.LENGTH_SHORT).show()
        }

        alertDialogBuilder.setNegativeButton("Batal") { dialogInterface: DialogInterface, i: Int -> dialogInterface.cancel() }
        val alertDialog = alertDialogBuilder.create()
        alertDialog.show()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            finish()
            return true
        }
        return super.onOptionsItemSelected(item)
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