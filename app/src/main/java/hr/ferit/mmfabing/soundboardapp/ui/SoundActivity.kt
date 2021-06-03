package hr.ferit.mmfabing.soundboardapp.ui

import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import hr.ferit.mmfabing.soundboardapp.R
import hr.ferit.mmfabing.soundboardapp.databinding.ActivityMainBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class SoundActivity : AppCompatActivity() {

    private val viewModel by viewModel<SoundViewModel>()
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).also {
            setContentView(it.root)
            it.cat.setOnClickListener{ clickCat() }
            it.dog.setOnClickListener{ clickDog() }
            it.owl.setOnClickListener { clickOwl() }
        }
    }

    private fun clickCat(){
        viewModel.playCatSound()
    }

    private fun clickDog(){
        viewModel.playDogSound()
    }

    private fun clickOwl(){
        viewModel.playOwlSound()
    }
}