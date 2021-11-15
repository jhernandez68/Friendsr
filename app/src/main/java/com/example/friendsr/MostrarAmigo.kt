package com.example.friendsr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_mostrar_amigo.*

class MostrarAmigo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        lateinit var ratingBar: RatingBar
        lateinit var button: Button
        lateinit var textView: TextView
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mostrar_amigo)

        ratingBar = findViewById(R.id.ratingBar)
        ratingBar.numStars = 5
        button = findViewById(R.id.buttonCheck)
        textView = findViewById(R.id.textView)
        ratingBar.onRatingBarChangeListener =
            RatingBar.OnRatingBarChangeListener { _, rating, _ ->
                Toast.makeText(
                    this@MostrarAmigo, "Estrellas: " +
                            rating.toInt(), Toast.LENGTH_SHORT
                ).show()
            }
        button.setOnClickListener {
            textView.text = "You have got " + ratingBar.rating.toInt()+ " stars"
        }

        val amigo = intent.getSerializableExtra("amigo") as Amigo

        nombre_amigo.text = amigo.nombre
        detalles.text = amigo.descripcion
        imagenxd.setImageResource(amigo.imagen)

    }
}