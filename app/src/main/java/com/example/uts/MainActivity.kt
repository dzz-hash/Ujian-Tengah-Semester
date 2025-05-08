package com.example.uts

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

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val Textnama: TextView = findViewById(R.id.Text_nama)
        val Textemail: TextView = findViewById(R.id.Text_email)
        val Textpw: TextView = findViewById(R.id.Text_pswrd)
        val btnLogin: Button = findViewById(R.id.Button_login)
        val btnRegist: Button = findViewById(R.id.Button_register)

        btnLogin.setOnClickListener {
            val nama = Textnama.text.toString()
            val email = Textemail.text.toString()
            val pw = Textpw.text.toString()

            val sharedPref = getSharedPreferences("user_data", MODE_PRIVATE)
            val saveNama = sharedPref.getString("username", null)
            val saveEmail = sharedPref.getString("email", null)
            val savePw = sharedPref.getString("password", null)

            if (nama == saveNama && email == saveEmail && pw == savePw) {
                Toast.makeText(this, "Login berhasil!", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this, ListActiivity::class.java))
                finish()
            } else {
                Toast.makeText(this, "Username atau Password salah", Toast.LENGTH_SHORT).show()
            }
        }


        btnRegist.setOnClickListener {
            startActivity(Intent(this, Register::class.java))
        }

        val  textLog: TextView = findViewById(R.id.Label_login)
        val paintL =  textLog.paint
        val widthL = paintL.measureText(textLog.text.toString())

        val textShaderL = LinearGradient(
            0f, 0f, widthL, textLog.textSize,
            intArrayOf(
                Color.parseColor("#004D98"),
                Color.parseColor("#A50044")
            ),
            null,
            Shader.TileMode.CLAMP
        )
        textLog.paint.shader = textShaderL



        val textMes2: TextView = findViewById(R.id.Text_Mes2)
        val paint = textMes2.paint
        val width = paint.measureText(textMes2.text.toString())

        val textShader = LinearGradient(
            0f, 0f, width, textMes2.textSize,
            intArrayOf(
                Color.parseColor("#004D98"),
                Color.parseColor("#A50044")
            ),
            null,
            Shader.TileMode.CLAMP
        )
        textMes2.paint.shader = textShader

        val textVisca2: TextView = findViewById(R.id.Text_Visca2)
        val paint2 = textVisca2.paint
        val width2 = paint.measureText(textVisca2.text.toString())

        val textShader2 = LinearGradient(
            0f, 0f, width, textVisca2.textSize,
            intArrayOf(
                Color.parseColor("#004D98"),
                Color.parseColor("#A50044")
            ),
            null,
            Shader.TileMode.CLAMP
        )
        textVisca2.paint.shader = textShader
    }
}

