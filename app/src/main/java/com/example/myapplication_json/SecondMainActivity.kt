package com.example.myapplication_json

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.json.JSONObject

class SecondMainActivity : AppCompatActivity() {

    lateinit var receiver_msg1: TextView
    lateinit var receiver_msg2: TextView
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_main)

        receiver_msg1 = findViewById(R.id.textView2)
        receiver_msg2 = findViewById(R.id.textView3)

        val intent= intent
        val str=intent.getStringExtra("someKey");
        val obj= JSONObject(str);
        val MAC: String =obj.getString("MAC");
        val server:String=obj.getString("server");

        receiver_msg1.text=MAC;
        receiver_msg2.text=server;

    }
}


