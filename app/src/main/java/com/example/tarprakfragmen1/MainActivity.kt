package com.example.tarprakfragmen1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

lateinit var btnFragment1: Button
lateinit var btnFragment2 : Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnFragment1 = findViewById(R.id.btnFragment1)
        btnFragment2 = findViewById(R.id.btnFragment2)

        btnFragment1.setOnClickListener(){
            var fr = supportFragmentManager.beginTransaction()
            fr.replace(R.id.f1Movie, MovieFragment1())
            fr.commit()
        }
        btnFragment2.setOnClickListener(){
            var fr = supportFragmentManager.beginTransaction()
            fr.replace(R.id.f1Movie, MovieFragment2())
            fr.commit()
        }

        var fr = supportFragmentManager.beginTransaction()
        fr.replace(R.id.f1Movie, MovieFragment1())
        fr.commit()

        Log.i("Main Activity","onCreat")

    }
}