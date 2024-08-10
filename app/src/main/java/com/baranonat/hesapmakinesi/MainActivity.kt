package com.baranonat.hesapmakinesi

import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.baranonat.hesapmakinesi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    var birinciSayi:Double?=null
    var ikinciSayi:Double?=null
    var sonuc:Double?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        enableEdgeToEdge()

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun toplama(view: View) {

            birinciSayi = binding.editText.text.toString().toDoubleOrNull()
            ikinciSayi = binding.editText2.text.toString().toDoubleOrNull()
            if (birinciSayi == null || ikinciSayi == null) {
                binding.textView.text = "Sayilari Giriniz!"
            } else {
                sonuc = birinciSayi!! + ikinciSayi!!
                binding.textView.text = "Sonuc:${sonuc}"

            }



    }
        fun bolme(view: View) {

                birinciSayi = binding.editText.text.toString().toDoubleOrNull()
                ikinciSayi = binding.editText2.text.toString().toDoubleOrNull()
                if (birinciSayi != null && ikinciSayi != null) {
                    sonuc = birinciSayi!! / ikinciSayi!!
                    binding.textView.text = "Sonuc:${sonuc}"
                } else {
                    binding.textView.text = "Sayilari Giriniz!"
                }

        }

        fun carpma(view: View) {

                birinciSayi = binding.editText.text.toString().toDoubleOrNull()
                ikinciSayi = binding.editText2.text.toString().toDoubleOrNull()
                if (birinciSayi != null && ikinciSayi != null) {
                    sonuc = birinciSayi!! * ikinciSayi!!
                    binding.textView.text = "Sonuc:${sonuc}"
                } else {
                    binding.textView.text = "Sayilari Giriniz!"
                }
32
        }

        fun cikartma(view: View) {

                birinciSayi = binding.editText.text.toString().toDoubleOrNull()
                ikinciSayi = binding.editText2.text.toString().toDoubleOrNull()
                if (birinciSayi != null && ikinciSayi != null) {
                    sonuc = birinciSayi!! - ikinciSayi!!
                    binding.textView.text = "Sonuc:${sonuc}"
                } else {
                    binding.textView.text = "Sayilari Giriniz!"
                }
            }




}