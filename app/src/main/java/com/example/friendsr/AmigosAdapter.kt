package com.example.friendsr

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.item_amigo.view.*


class AmigosAdapter (private val mContext: Context, private val listaAmigos:List<Amigo> ) : ArrayAdapter<Amigo>(mContext, 0, listaAmigos) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layout = LayoutInflater.from(mContext).inflate(R.layout.item_amigo, parent, false   )

        val amigo = listaAmigos[position]

        layout.nombre.text = amigo.nombre
        layout.descripcion.text = amigo.descripcion
        layout.imageView8.setImageResource(amigo.imagen)

        return layout
    }
}