package com.example.collectrack

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_layout)

        // Get references to buttons
        val gamesButton = findViewById<Button>(R.id.buttonGames)
        val toolsButton = findViewById<Button>(R.id.buttonTools)
        val booksButton = findViewById<Button>(R.id.buttonBooks)

        // Set OnClickListener for the games button
        gamesButton.setOnClickListener {
            // Handle click for games button
            // Implement your logic for the games button here
        }

        // Set OnClickListener for the tools button
        toolsButton.setOnClickListener {
            // Handle click for tools button
            // Implement your logic for the tools button here
        }

        // Set OnClickListener for the books button
        booksButton.setOnClickListener {
            // Handle click for books button
            // Implement your logic for the books button here
        }

        // Example of navigating back to MainActivity
        // Assuming you have a button with id 'backToLoginButton' in homeLayout.xml
        val backToLoginButton = findViewById<Button>(R.id.backToLoginButton)
        backToLoginButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish() // Close the home activity to prevent user from navigating back
        }
    }
}

class MainActivity {
    // You can add properties or methods specific to MainActivity here
    // For example:
    // private late nit var someVariable: SomeType

    // Or you can leave it empty
}

