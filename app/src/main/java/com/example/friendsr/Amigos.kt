package com.example.friendsr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_amigos.*

class Amigos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_amigos)
        val amigo = Amigo("Peter Sagan", "Hola, soy guapo", R.drawable.homero)
        val amigo2 = Amigo("Peter Sagan", "Hola, soy guapo", R.drawable.homero)
        val amigo3 = Amigo("Peter Sagan", "Hola, soy guapo", R.drawable.homero)
        val amigo4 = Amigo("Peter Sagan", "Hola, soy guapo", R.drawable.homero)
        val listaAmigos = listOf(amigo, amigo2, amigo3, amigo4)

        val adapter = AmigosAdapter(this, listaAmigos)

        lista.adapter = adapter
        lista.setOnItemClickListener { adapterView, view, i, l ->
            val intent = Intent(this, MostrarAmigo::class.java)
            intent.putExtra("amigo", listaAmigos[i])
            startActivity(intent)
        }
    }
}