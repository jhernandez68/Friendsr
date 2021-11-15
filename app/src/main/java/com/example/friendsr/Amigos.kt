package com.example.friendsr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_amigos.*

class Amigos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_amigos)
        val amigo = Amigo("Camila Cabello", "Hola, soy guapa", R.drawable.mujer)
        val amigo2 = Amigo("Scarlett Johanson", "Hola, me gustan las pelis", R.drawable.scarlett)
        val amigo3 = Amigo("Andrea Hernandez", "Hola, me gusta hacer deporte", R.drawable.mujer2)
        val amigo4 = Amigo("Camila Fonseca", "Hola, me gusta jugar", R.drawable.mujer3)
        val amigo5 = Amigo("Stiven Rodriguez", "Hola, me gusta jugar futbol", R.drawable.hombre)
        val amigo6 = Amigo("Ericson Pagani", "Hola, me gusta jugar baloncesto", R.drawable.hombre2)
        val amigo7 = Amigo("Jeremy Cauca", "Hola, me gusta acampar", R.drawable.hombre3)
        val amigo8 = Amigo("Esteban Fierro", "Hola, me gusta correr", R.drawable.hombre4)

        val listaAmigos = listOf(amigo, amigo2, amigo3, amigo4, amigo5, amigo6, amigo7, amigo8)

        val adapter = AmigosAdapter(this, listaAmigos)

        lista.adapter = adapter
        lista.setOnItemClickListener { adapterView, view, i, l ->
            val intent = Intent(this, MostrarAmigo::class.java)
            intent.putExtra("amigo", listaAmigos[i])
            startActivity(intent)
        }
    }
}