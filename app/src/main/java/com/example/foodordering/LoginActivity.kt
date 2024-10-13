package com.example.foodordering

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.foodordering.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private val binding : ActivityLoginBinding by lazy {
        ActivityLoginBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        binding.loginbutton.setOnClickListener{
            val intent = Intent(this,SigninActivity::class.java)
            startActivity(intent)
        }
        binding.donthavebutton.setOnClickListener{
            val intent = Intent(this,SigninActivity::class.java)
            startActivity(intent)
        }
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        }
    }
