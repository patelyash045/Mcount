package com.yash.mcount

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.yash.mcount.R
import com.yash.mcount.activity.AddGroupActivity

class MainActivity : AppCompatActivity() {

    lateinit var fabCreate: FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fabCreate = findViewById(R.id.fabCreateGroup)

        fabCreate.setOnClickListener {
            val intent = Intent(this, AddGroupActivity::class.java)
            startActivity(intent)
        }


    }
}