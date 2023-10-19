package org.eu.noobshubham.blackcoffer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nextButton: FloatingActionButton = findViewById(R.id.nextButton)
        nextButton.setOnClickListener {
            startActivity(Intent(this, RefineActivity::class.java))
            // setContentView(R.layout.activity_refine)
        }
    }
}