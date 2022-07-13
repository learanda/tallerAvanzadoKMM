package ar.leandro.talleravanzadolean.android.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ar.leandro.talleravanzadolean.android.databinding.ActivityErrorBinding
import ar.leandro.talleravanzadolean.android.ui.characters.CharactersActivity

class ErrorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityErrorBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.reintentar.setOnClickListener {
            startActivity(Intent(this, CharactersActivity::class.java))
        }
    }
}