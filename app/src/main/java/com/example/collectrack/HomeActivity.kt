package com.example.collectrack

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.HomeLayout)

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
    }
}
