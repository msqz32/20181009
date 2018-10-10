package com.kotlin.order.coffe.cofferorder

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var contador:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
/*
        btnSuma.setOnClickListener{
            var ope = btnSuma.text
            var opc1 = txtPrimerOperando.text
            var opc2 = txtSegundoOperando.text
        }

*/
    }


    fun operacion(view: View){
        var b = view as Button
        var o1 = txtPrimerOperando.text
        var o2 = txtSegundoOperando.text
        calcular(o1.toString().toInt(), o2.toString().toInt(), b.text.toString())
    }


    fun calcular(opc1:Int, opc2:Int, ope:String){

        when(ope){
            "+" -> {
                println("suma ${opc1+opc2}")
                txtResultado.setText("${opc1+opc2}")
            }
            "-" -> {
                println("resta ${opc1-opc2}")
                txtResultado.setText("${opc1-opc2}")
            }
            "*" -> {
                println("multiplica ${opc1*opc2}")
                txtResultado.setText("${opc1*opc2}")
            }
            "/" -> {
                println("divide ${opc1/opc2}")
                txtResultado.setText("${opc1/opc2}")
            }
            else -> {
                println("siguiente version")
            }
        }
    }




    fun ordenarTaza(view: View){

        contador++

    }
}
