package com.example.ejemplo_intent_implicito

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var boton_llamar:Button
    lateinit var intent_llamar:Intent
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        InitComponentes()
    }

    private fun InitComponentes() {
        this.boton_llamar=findViewById(R.id.button)
        boton_llamar.setOnClickListener {
            intent_llamar=Intent(Intent.ACTION_CALL)
            intent_llamar.setData(Uri.parse("tel:983454554"))
            // COMO VERIFICAR SI TU APP TIENE PERMISOS
            // https://developer.android.com/training/permissions/requesting?hl=es-419
            //Ejercicio.- Averigue como mostrar selector de permisos
            startActivity(intent_llamar)



            }

        }
    }





