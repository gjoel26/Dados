package mx.edu.tecmm.moviles.proyectocovi


import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    var cont: Int = 0
    var incrementar: Boolean = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtConteo = findViewById<TextView>(R.id.txtConteo)
        val btnContador = findViewById<Button>(R.id.btnCuenta)
        val btnReset = findViewById<Button>(R.id.btnReset)
        cont = 0
        incrementar = true

        btnContador.setOnClickListener {
            if (incrementar) {
                cont++
                if (cont > 9) {
                    cont = 8
                    incrementar = false
                }
            } else {
                cont--
                if (cont < 0) {
                    cont = 1
                    incrementar = true
                }
            }

            actualizarTextoBoton(btnContador)
        }

        btnReset.setOnClickListener {
            cont = 0
            incrementar = true
            actualizarTextoBoton(btnContador)
        }
    }

    private fun actualizarTextoBoton(btnContador: Button) {
        val txtConteo = findViewById<TextView>(R.id.txtConteo)
        txtConteo.text = "$cont"
        if (cont == 0) {
            btnContador.text = "cambio"
        } else {
            btnContador.text = "Incrementar"
        }
    }
}

