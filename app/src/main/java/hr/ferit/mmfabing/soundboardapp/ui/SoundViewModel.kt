package hr.ferit.mmfabing.soundboardapp.ui

import androidx.lifecycle.ViewModel
import hr.ferit.mmfabing.soundboardapp.sounds.AudioPlayer

class SoundViewModel(
    private val audioPlayer: AudioPlayer
): ViewModel(){

    fun playCatSound() = audioPlayer.playCatSound()
    fun playDogSound() = audioPlayer.playDogSound()
    fun playOwlSound() = audioPlayer.playOwlSound()
}