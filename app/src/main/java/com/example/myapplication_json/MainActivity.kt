package com.example.myapplication_json

import  android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import org.json.JSONException
import org.json.JSONObject

class MainActivity : AppCompatActivity() {

    lateinit var send_button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        send_button=findViewById(R.id.send_button_id);

        send_button.setOnClickListener{
            val serverJson = JSONObject()
            try {
                serverJson.put("connected", "true")
                serverJson.put("MAC", "ff-fff-fff-ff")
                serverJson.put("server", "dev.samsungvx.com")
                serverJson.put("content_server", "dev-content.samsungvx.com")
            } catch (e: JSONException) {
                // TODO Auto-generated catch block
                e.printStackTrace()
            }
            val intent = Intent(this, SecondMainActivity::class.java)
            intent.putExtra("someKey", serverJson.toString())
            startActivity(intent);
        }
    }
}