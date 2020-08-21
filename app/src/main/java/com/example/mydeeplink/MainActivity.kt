package com.example.mydeeplink

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
const val PRAMAM_ID = "id"
class MainActivity : AppCompatActivity() {
    var valueId: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val data = intent.data.let {
            valueId = it?.getQueryParameter(PRAMAM_ID)
        }
        if(valueId.equals("1")){
           val intent = Intent(this, DeepLinkActivity::class.java).apply {
               putExtra(PRAMAM_ID, valueId)
           }
            startActivity(intent)
        }
    }
}