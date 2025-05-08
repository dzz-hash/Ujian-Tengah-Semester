package com.example.uts

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.graphics.LinearGradient
import android.graphics.Shader
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.uts.MainActivity

class Register : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.register)

        val inputNama = findViewById<EditText>(R.id.Text_nama)
        val inputEmail = findViewById<EditText>(R.id.Text_email)
        val inputPw = findViewById<EditText>(R.id.Text_pw)
        val btnSubmit = findViewById<Button>(R.id.Button_submit)
        val btnBack = findViewById<Button>(R.id.Button_back)

        btnSubmit.setOnClickListener {
            val nama = inputNama.text.toString()
            val email = inputEmail.text.toString()
            val pw = inputPw.text.toString()

            if (nama.isNotEmpty() && email.isNotEmpty() && pw.isNotEmpty()) {
                val sharedPref = getSharedPreferences("user_data", MODE_PRIVATE)
                val editor = sharedPref.edit()
                editor.putString("username", nama)
                editor.putString("email", email)
                editor.putString("password", pw)
                editor.apply()

                Toast.makeText(this, "Registrasi Berhasil!", Toast.LENGTH_SHORT).show()
                finish() // kembali ke LoginActivity
            } else {
                Toast.makeText(this, "Isi semua data!", Toast.LENGTH_SHORT).show()
            }
        }

        btnBack.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }



        val lRegist: TextView = findViewById(R.id.Label_regist)
        val paint = lRegist.paint
        val width = paint.measureText(lRegist.text.toString())

        val textShader = LinearGradient(
            0f, 0f, width, lRegist.textSize,
            intArrayOf(
                Color.parseColor("#004D98"),
                Color.parseColor("#A50044")
            ),
            null,
            Shader.TileMode.CLAMP
        )
        lRegist.paint.shader = textShader

        val textMes3: TextView = findViewById(R.id.Text_Mes3)
        val paint1 = textMes3.paint
        val width1 = paint.measureText(textMes3.text.toString())

        val textShader1 = LinearGradient(
            0f, 0f, width, textMes3.textSize,
            intArrayOf(
                Color.parseColor("#004D98"),
                Color.parseColor("#A50044")
            ),
            null,
            Shader.TileMode.CLAMP
        )
        textMes3.paint.shader = textShader1

        val textVisca3: TextView = findViewById(R.id.Text_Visca3)
        val paint2 = textVisca3.paint
        val width2 = paint.measureText(textVisca3.text.toString())

        val textShader2 = LinearGradient(
            0f, 0f, width, textVisca3.textSize,
            intArrayOf(
                Color.parseColor("#004D98"),
                Color.parseColor("#A50044")
            ),
            null,
            Shader.TileMode.CLAMP
        )
        textVisca3.paint.shader = textShader2
    }
}


