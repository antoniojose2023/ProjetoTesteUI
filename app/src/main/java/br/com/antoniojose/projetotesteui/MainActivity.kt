package br.com.antoniojose.projetotesteui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import br.com.antoniojose.projetotesteui.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

   private val binding by lazy { ActivityMainBinding.inflate( layoutInflater ) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonEntrar.setOnClickListener {
            login()
        }

    }

    fun login(){
        if(binding.ediUsuario.text.toString() == "antonio" && binding.editSenha.text.toString() == "123"){
                startActivity(Intent(this, TelaPrincipalActivity::class.java))
        }else{
                Toast.makeText(this, "Erro ao logar no sistema", Toast.LENGTH_SHORT).show()
        }
    }
}