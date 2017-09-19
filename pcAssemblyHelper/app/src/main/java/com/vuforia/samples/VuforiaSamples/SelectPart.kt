package com.vuforia.samples.VuforiaSamples

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner

class SelectPart:AppCompatActivity() {

    lateinit var spinner1: Spinner//신기해서 써봄

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select)
        setTitle("부품 선택")

        val spin1:Spinner = findViewById(R.id.spinner1) as Spinner
        val spin2:Spinner = findViewById(R.id.spinner2) as Spinner
        val spin3:Spinner = findViewById(R.id.spinner3) as Spinner
        val spin4:Spinner = findViewById(R.id.spinner4) as Spinner
        val spin5:Spinner = findViewById(R.id.spinner5) as Spinner
        val spin6:Spinner = findViewById(R.id.spinner6) as Spinner

        val mainBoard = arrayListOf("메인보드")
        val cpu = arrayListOf("CPU")
        val ram = arrayListOf("RAM")
        val vga = arrayListOf("VGA")
        val hdd = arrayListOf("HDD","SDD")
        val etc = arrayListOf("기타")

        spin1.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,mainBoard)
        spin2.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,cpu)
        spin3.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,ram)
        spin4.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,vga)
        spin5.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,hdd)
        spin6.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,etc)
    }

}
