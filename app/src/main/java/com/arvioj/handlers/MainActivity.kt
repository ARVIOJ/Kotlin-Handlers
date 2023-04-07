package com.arvioj.handlers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myButton = findViewById<Button>(R.id.button)

        myButton.setOnClickListener {
                /*Handler().post{
                    run{
                        Toast.makeText(this, "Nuevo evento Handler", Toast.LENGTH_SHORT).show()
                    }
                }*/

            mainLooper.run {
                Toast.makeText(this@MainActivity, "Nuevo evento Handler", Toast.LENGTH_SHORT).show()
            }

        }

    }

}