package com.texto.myfirstandroidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nameInput = findViewById<EditText>(R.id.nameText)
        val ageInput = findViewById<EditText>(R.id.ageText)
        val goButton = findViewById<Button>(R.id.go_button)

        goButton.setOnClickListener(){

            val textName:String = nameInput.text.toString()
            var textAge:Int= ageInput.text.toString().toInt()

            if(textAge <10)
                textAge *= 7
            if (textAge > 9)
            {
                while (textAge >9)
                {
                    textAge = textAge.toString().substring(0,1).toInt() + textAge.toString().substring(1).toInt()
                }
            }

            Toast.makeText(this, "Hey " + textName + ", your lucky number today is: " +textAge.toString() , Toast.LENGTH_SHORT).show()



        }






    }
}