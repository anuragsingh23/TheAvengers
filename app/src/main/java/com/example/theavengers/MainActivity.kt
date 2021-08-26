package com.example.theavengers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    var tittleName : String?="Avengers"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.scrollview_example)


        if (intent !=null){
            tittleName= intent.getStringExtra("Name")
        }
        title=tittleName
    }
}