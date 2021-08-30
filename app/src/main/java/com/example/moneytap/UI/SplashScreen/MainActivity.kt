package com.example.moneytap.UI.SplashScreen

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.moneytap.R
import com.example.moneytap.UI.Login.LoginActivity
import com.example.moneytap.UI.Utilities.AppConstant

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        gotoLoginScreen()
    }

    fun gotoLoginScreen(){
            val intent = Intent(this, LoginActivity::class.java)
            val thread: Thread = object : Thread() {
                override fun run() {
                    try {
                        sleep(AppConstant.SPLASH_TIME)
                        startActivity(intent)
                        finish()
                    } catch (e: Exception) {
                        e.printStackTrace()
                    }
                }
            }
            thread.start()
    }
}