package com.example.collectrack

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    private lateinit var emailEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var signInButton: Button


    // correct email and password
    private val correctEmail = "admin"
    private val correctPassword = "admin"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        // Initialize views
        emailEditText = findViewById(R.id.editTextEmail)
        passwordEditText = findViewById(R.id.editTextPassword)
        signInButton = findViewById(R.id.buttonSignIn)

        // Set click listener for Sign In button
        signInButton.setOnClickListener {
            // Get user input
            val enteredEmail = emailEditText.text.toString()
            val enteredPassword = passwordEditText.text.toString()

            // Perform authentication
            if (authenticateUser(enteredEmail, enteredPassword)) {
                // Authentication successful
                Toast.makeText(this, "Login successful", Toast.LENGTH_SHORT).show()

                // Navigate to the home page
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
                finish() // Close the login activity to prevent user from navigating back
            } else {
                // Authentication failed
                Toast.makeText(this, "Incorrect email or password", Toast.LENGTH_SHORT).show()
            }
        }
    }

    // Perform authentication (replace with actual authentication logic)
    private fun authenticateUser(email: String, password: String): Boolean {
        // Compare entered email and password with correct credentials
        return email == correctEmail && password == correctPassword
    }
}


