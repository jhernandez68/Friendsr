package com.example.friendsr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_mostrar_amigo.*

class MostrarAmigo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mostrar_amigo)

        val amigo = intent.getSerializableExtra("amigo") as Amigo

        nombre_amigo.text = amigo.nombre
        detalles.text = amigo.descripcion
        imagenxd.setImageResource(amigo.imagen)
    }
}