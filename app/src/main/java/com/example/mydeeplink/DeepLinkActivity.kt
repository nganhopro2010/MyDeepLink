package com.example.mydeeplink

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_deep_link.*

class DeepLinkActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_deep_link)
        val valueId = intent.getStringExtra(PRAMAM_ID)
        textView.text = "Gía trị nhận được là "+valueId
    }
}