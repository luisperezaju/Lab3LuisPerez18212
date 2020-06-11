package com.example.guatemala

import android.annotation.SuppressLint
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }



    fun mostrarTexto(view: View) {

        val boton: ImageButton = findViewById<ImageButton>(R.id.BotonEstrella)
        val ingresado: EditText = findViewById(R.id.NombreIngresado)
        val resultado: TextView = findViewById<TextView>(R.id.Resultado)
        val nombre: TextView = findViewById<TextView>(R.id.EtiquetaNombre)

        var contador = 1
        boton.setOnClickListener {

            contador = contador + 1
            if (contador % 2 != 0) {


                nombre.visibility = View.VISIBLE
                ingresado.visibility = View.VISIBLE
                resultado.setText(ingresado.text.toString())
            } else {
                nombre.visibility = View.INVISIBLE
                ingresado.visibility = View.INVISIBLE


                resultado.setText(ingresado.text.toString())
            }

        }
    }

    //Extraído de: https://medium.com/@jencisov/androids-data-binding-with-kotlin-df94a24ffc0f
    fun abrirBotonTikal(view: View) {

        val intento: Intent = Intent(this, Informacion::class.java)
        intento.putExtra(
            "Descripcion",
            Descripcion(
                "Virus",
                "La COVID‑19 es la enfermedad infecciosa causada por el coronavirus que se ha descubierto más recientemente. Tanto este nuevo virus como la enfermedad que provoca eran desconocidos antes de que estallara el brote en Wuhan (China) en diciembre de 2019. Actualmente la COVID‑19 es una pandemia que afecta a muchos países de todo el mundo.",
                "¿Qué es el Coronavirus?"
            )
        )
        startActivity(intento)

    }


    fun abrirSemuc(view: View) {
        val intento: Intent = Intent(this, Informacion::class.java)
        intento.putExtra(
            "Descripcion",
            Descripcion(
                "Síntomas",
                "Los síntomas más habituales de la COVID-19 son la fiebre, la tos seca y el cansancio. Otros síntomas menos frecuentes que afectan a algunos pacientes son los dolores y molestias, la congestión nasal, el dolor de cabeza, la conjuntivitis, el dolor de garganta, la diarrea, la pérdida del gusto o el olfato y las erupciones cutáneas o cambios de color en los dedos de las manos o los pies. Estos síntomas suelen ser leves y comienzan gradualmente. Algunas de las personas infectadas solo presentan síntomas levísimos.",
                "¿Cuáles son los síntomas?"
            )
        )
        startActivity(intento)

    }

    fun abrirAntigua(view: View) {
        val intento: Intent = Intent(this, Informacion::class.java)
        intento.putExtra(
            "Descripcion", Descripcion(
                "Indicaciones",
                "" +
                        "\n" +
                        "Usar mascarrilla, gel, y lavarse las manos constantemente.",
                "¿Cuáles son las indicaciones?"
            )
        )
        startActivity(intento)
    }

    fun backear(view: View) {
        val boton:Button = findViewById<Button>(R.id.back)
        val ingresdo:TextView = findViewById<TextView>(R.id.ComentarioIngresado)
        boton.setOnClickListener {

            Toast.makeText(this, "No puede disminuir abajo de cero", Toast.LENGTH_LONG).show()
            val intento: Intent = Intent(this, MainActivity::class.java)
            startActivity(intento)
        }



    }


}




