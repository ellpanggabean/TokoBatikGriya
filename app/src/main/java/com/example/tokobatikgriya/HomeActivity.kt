package com.example.tokobatikgriya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val button1 = findViewById<Button>(R.id.button1)

        button1.setOnClickListener {
            val intent = Intent(this, BatikpriadewasaActivity::class.java)
            startActivity(intent)
        }

        val button2 = findViewById<Button>(R.id.button2)

        button2.setOnClickListener {
            val intent = Intent(this, BatikwanitadewasaActivity::class.java)
            startActivity(intent)
        }

        val button3 = findViewById<Button>(R.id.button3)

        button3.setOnClickListener {
            val intent = Intent(this, BatikanakcowoActivity::class.java)
            startActivity(intent)
        }

        val button4 = findViewById<Button>(R.id.button4)

        button4.setOnClickListener {
            val intent = Intent(this, BatikanakceweActivity::class.java)
            startActivity(intent)
        }
    }
}