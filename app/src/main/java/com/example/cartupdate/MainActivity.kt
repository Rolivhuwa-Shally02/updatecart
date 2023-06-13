package com.example.cartupdate

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var cartItemCount = 0
    private lateinit var cartBadgeTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val shoppingCartIcon: ImageView = findViewById(R.id.shoppingCartIcon)
        cartBadgeTextView = findViewById(R.id.cartBadgeTextView)
        val addToCartButton: Button = findViewById(R.id.addToCartButton)

        shoppingCartIcon.setOnClickListener {
            // Open the cart or perform any desired action
        }

        addToCartButton.setOnClickListener {
            addToCart()
        }
    }

    private fun addToCart() {
        cartItemCount++
        updateCartBadge()
    }

    private fun updateCartBadge() {
        if (cartItemCount > 0) {
            cartBadgeTextView.visibility = View.VISIBLE
            cartBadgeTextView.text = cartItemCount.toString()
        } else {
            cartBadgeTextView.visibility = View.GONE
        }
    }
}
