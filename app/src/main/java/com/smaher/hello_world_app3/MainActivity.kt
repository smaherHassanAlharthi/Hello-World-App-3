package com.smaher.hello_world_app3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var Entry = findViewById<EditText>(R.id.editTextEntry)
        var listShow=findViewById<TextView>(R.id.EntredText)
        val addB=findViewById<Button>(R.id.BAdd)
        val deleteB=findViewById<Button>(R.id.BDelete)

        var list= arrayListOf<String>()
        var str =""

        addB.setOnClickListener{
            if(Entry.text.isBlank()){
                listShow.text="Please Enter Country"
            }
            else {
                list.add(Entry.text.toString())
                str = ""
                for (i in list) {
                    str += i + "\n"
                }
                listShow.text = str
                Entry.text = null
            }
        }

        deleteB.setOnClickListener {
            str = ""
            if (list.size == 0)
                listShow.text = "Nothing There to Delete"
            else {
                list.remove(list[list.size - 1])
                for (i in list) {
                    str += i + "\n"
                }
                listShow.text = str
            }
        }


    }
}