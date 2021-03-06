package com.vuforia.samples.VuforiaSamples

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

import com.vuforia.samples.VuforiaSamples.app.ImageTargets.ImageTargets
import com.vuforia.samples.VuforiaSamples.ui.ActivityList.ActivityLauncher
import com.vuforia.samples.VuforiaSamples.test.Drawertest

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1 : Button = findViewById(R.id.button_1)
        val btn2 : Button = findViewById(R.id.button_2)
        val btn3 : Button = findViewById(R.id.button_3)
        val btn4 : Button = findViewById(R.id.button_4)

        btn1.setOnClickListener{
            val intent1:Intent = Intent(this@MainActivity,SelectPart::class.java)
            startActivity(intent1)
        }
        btn2.setOnClickListener{
            val intent2:Intent = Intent(this@MainActivity,RegistrationPart::class.java)
            startActivity(intent2)
        }
        btn3.setOnClickListener{
            val intent3:Intent = Intent(this@MainActivity,Assembly::class.java)
            startActivity(intent3)
        }
        btn4.setOnClickListener{
            //val intent4:Intent = Intent(this@MainActivity,ActivityLauncher::class.java)
            val intent4:Intent = Intent(this@MainActivity, Drawertest::class.java)
            startActivity(intent4)
        }
    }
}