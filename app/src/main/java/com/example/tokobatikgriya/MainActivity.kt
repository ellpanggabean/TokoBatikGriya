package com.example.tokobatikgriya

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    //deklarasi variabel
    private lateinit var btn_daftar : Button
    private lateinit var btn_login : Button


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_daftar = findViewById(R.id.btn_daftar)
        btn_daftar.setOnClickListener(this)
        btn_login = findViewById(R.id.btn_login)
        btn_login.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btn_daftar-> {
                val daftar = Intent(this@MainActivity, RegisterActivity::class.java)
                startActivity(daftar)
            }
            R.id.btn_login-> {
                val login = Intent(this@MainActivity, LoginActivity::class.java)
                startActivity(login)

                }
            }
       }
    }