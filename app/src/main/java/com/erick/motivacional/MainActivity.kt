package com.erick.motivacional

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var tvMotiva: TextView
    private lateinit var btMotiva: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.tvMotiva = findViewById(R.id.tvMotiva)
        this.btMotiva = findViewById(R.id.btMotiva)

        this.tvMotiva.text = Motivacional.getInstance()

        this.btMotiva.setOnClickListener(OnClickMotiva())
    }

    inner class OnClickMotiva: View.OnClickListener{
        override fun onClick(v: View?) {
            this@MainActivity.tvMotiva.text = Motivacional.getInstance()
        }
    }
}
