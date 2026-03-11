package com.example.perfectworldstore

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Referenciando os campos da tela
        val editNomeProduto = findViewById<EditText>(R.id.editNomeProduto)
        val editQuantidade = findViewById<EditText>(R.id.editQuantidade)
        val btnSalvar = findViewById<Button>(R.id.editSalvar)

        btnSalvar.setOnClickListener {
            val nome = editNomeProduto.text.toString()
            val qtd = editQuantidade.text.toString()

            if (nome.isNotEmpty() && qtd.isNotEmpty()) {
                // Aqui simulamos o salvamento no estoque da Perfect World Store
                Toast.makeText(this, "Produto $nome salvo no estoque!", Toast.LENGTH_LONG).show()

                // Limpa os campos após salvar
                editNomeProduto.text.clear()
                editQuantidade.text.clear()
            } else {
                Toast.makeText(this, "Preencha todos os campos", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
