package com.example.cakeshop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean{
        var inflater=menuInflater
        inflater.inflate(R.menu.my_first_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.item1->Toast.makeText(this, "item 1 selected", Toast.LENGTH_SHORT).show()
            R.id.item2-> Toast.makeText(this, "item 2 selected", Toast.LENGTH_SHORT).show()
            R.id.item3-> Toast.makeText(this, "item 3 selected", Toast.LENGTH_SHORT).show()
            R.id.item4-> Toast.makeText(this, "item 4 selected", Toast.LENGTH_SHORT).show()
            R.id.item5-> Toast.makeText(this, "item 5 selected", Toast.LENGTH_SHORT).show()
            R.id.subitem1-> Toast.makeText(this, "Sub-item 1 selected", Toast.LENGTH_SHORT).show()
        }
        return true;
    }

    fun receiveFeedback(toString: String) {

    }

    class MainActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
            val cakerate: TextView = findViewById(R.id.textView4)
            cakerate.setOnClickListener{
                var dialog_var = CustomDialogFragment()
                dialog_var.show(supportFragmentManager, "Custom Dialog")
            }
        }
        fun receiveFeedback(feedback: String){
            val cakerate : TextView = findViewById(R.id.textView4)
            cakerate.text = feedback;
        }
    }
    }
