package com.example.praktikummobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.praktikummobile.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            var username = usernameInput.editableText
            btnLogin.setOnClickListener{
                Toast.makeText(this@MainActivity, "hello $username", Toast.LENGTH_LONG).show()
            }
        }
    }
}