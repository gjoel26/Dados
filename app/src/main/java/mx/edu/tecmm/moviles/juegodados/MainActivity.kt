package mx.edu.tecmm.moviles.juegodados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random




class MainActivity : AppCompatActivity() {
    lateinit var imagenDato: ImageView
    lateinit var txtNumero: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imagenDato = findViewById(R.id.imagenDado)
        txtNumero = findViewById(R.id.txtnumero)
    }

    // Método para lanzar el dado al presionar el botón
    fun lanzarDado(v: View) {
        val numeroAlAzar = Random.nextInt(6) + 1 // Generar número aleatorio entre 1 y 6
        txtNumero.text = numeroAlAzar.toString() // Mostrar el número en el TextView

        val recurso = when (numeroAlAzar) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        imagenDato.setImageResource(recurso) // Cambiar la imagen del dado
    }
}