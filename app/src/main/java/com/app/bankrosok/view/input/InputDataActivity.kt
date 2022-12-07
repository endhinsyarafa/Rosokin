package com.app.bankrosok.view.input

import android.app.Activity
import android.app.DatePickerDialog
import android.app.DatePickerDialog.OnDateSetListener
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.MenuItem
import android.view.View
import android.view.WindowManager
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.DatePicker
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.app.bankrosok.R
import com.app.bankrosok.databinding.ActivityInputDataBinding
import com.app.bankrosok.sharedpref.UserLocationPreferences
import com.app.bankrosok.utils.FunctionHelper.rupiahFormat
import com.app.bankrosok.viewmodel.InputDataViewModel
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
//import kotlinx.android.synthetic.main.activity_input_data.*
import java.text.SimpleDateFormat
import java.util.*

class InputDataActivity : AppCompatActivity() {

    private lateinit var userLocationPreferences: UserLocationPreferences
    private lateinit var binding: ActivityInputDataBinding

    lateinit var inputDataViewModel: InputDataViewModel
    lateinit var strNama: String
    lateinit var strTanggal: String
    lateinit var strAlamat: String
    lateinit var strCatatan: String
    lateinit var strKategoriSelected: String
    lateinit var strHargaSelected: String
    lateinit var strKategori: Array<String>
    lateinit var strHarga: Array<String>
    var countTotal = 0
    var countBerat = 0
    var countHarga = 0

    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityInputDataBinding.inflate(layoutInflater)
        setContentView(binding.root)

        userLocationPreferences = UserLocationPreferences(this)

        setStatusBar()
        setToolbar()
        setInitLayout()
        setInputData()
    }

    private fun setToolbar() {
        setSupportActionBar(binding.toolbar)
        if (supportActionBar != null) {
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
            supportActionBar?.setDisplayShowTitleEnabled(false)
        }
    }

    private fun setInitLayout() {
        firebaseAuth = Firebase.auth
        val firebaseUser = firebaseAuth.currentUser

        strKategori = resources.getStringArray(R.array.kategori_sampah)
        strHarga = resources.getStringArray(R.array.harga_perkilo)

        inputDataViewModel = ViewModelProvider(this, ViewModelProvider.AndroidViewModelFactory.getInstance(this.application)).get(InputDataViewModel::class.java)

        binding.inputAlamat.setText(userLocationPreferences.getUserLocation().location)
        binding.inputNama.setText(firebaseUser?.displayName)

        val arrayBahasa = ArrayAdapter(this@InputDataActivity, android.R.layout.simple_list_item_1, strKategori)
        arrayBahasa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.spKategori.setAdapter(arrayBahasa)

        binding.spKategori.setOnItemSelectedListener(object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>,
                view: View,
                position: Int,
                id: Long
            ) {
                strKategoriSelected = parent.getItemAtPosition(position).toString()
                strHargaSelected = strHarga[position]
                binding.spKategori.setEnabled(true)
                countHarga = strHargaSelected.toInt()
                if (binding.inputBerat.getText().toString() != "") {
                    countBerat = binding.inputBerat.getText().toString().toInt()
                    setTotalPrice(countBerat)
                } else {
                    binding.inputHarga.setText(rupiahFormat(countHarga))
                }
            }

            override fun onNothingSelected(adapterView: AdapterView<*>?) {}
        })

        binding.inputBerat.addTextChangedListener(object : TextWatcher {
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {}
            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}
            override fun afterTextChanged(editable: Editable) {
                binding.inputBerat.removeTextChangedListener(this)
                if (editable.length > 0) {
                    countBerat = editable.toString().toInt()
                    setTotalPrice(countBerat)
                } else {
                    binding.inputHarga.setText(rupiahFormat(countHarga))
                }
                binding.inputBerat.addTextChangedListener(this)
            }
        })

        binding.inputTanggal.setOnClickListener { view: View? ->
            val tanggalJemput = Calendar.getInstance()
            val date =
                OnDateSetListener { view1: DatePicker?, year: Int, monthOfYear: Int, dayOfMonth: Int ->
                    tanggalJemput[Calendar.YEAR] = year
                    tanggalJemput[Calendar.MONTH] = monthOfYear
                    tanggalJemput[Calendar.DAY_OF_MONTH] = dayOfMonth
                    val strFormatDefault = "d MMMM yyyy"
                    val simpleDateFormat = SimpleDateFormat(strFormatDefault, Locale.getDefault())
                    binding.inputTanggal.setText(simpleDateFormat.format(tanggalJemput.time))
                }
            DatePickerDialog(
                this@InputDataActivity, date,
                tanggalJemput[Calendar.YEAR],
                tanggalJemput[Calendar.MONTH],
                tanggalJemput[Calendar.DAY_OF_MONTH]
            ).show()
        }
    }

    private fun setTotalPrice(berat: Int) {
        countTotal = countHarga * berat
        binding.inputHarga.setText(rupiahFormat(countTotal))
    }

    private fun setInputData() {

        binding.btnCheckout.setOnClickListener { v: View? ->
            strNama = binding.inputNama.text.toString()
            strTanggal = binding.inputTanggal.text.toString()
            strAlamat = binding.inputAlamat.text.toString()
            strCatatan = binding.inputTambahan.text.toString()
            if (strNama.isEmpty() or strTanggal.isEmpty() or strAlamat.isEmpty() or (strKategori.size == 0) or (countBerat == 0) or (countHarga == 0)) {
                Toast.makeText(
                    this@InputDataActivity,
                    "Data tidak boleh ada yang kosong!",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                inputDataViewModel.addDataSampah(
                    strNama,
                    strKategoriSelected,
                    countBerat,
                    countHarga,
                    strTanggal,
                    strAlamat,
                    strCatatan
                )
                Toast.makeText(
                    this@InputDataActivity,
                    "Pesanan Anda sedang diproses, cek di menu riwayat",
                    Toast.LENGTH_SHORT
                ).show()
                finish()
            }
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