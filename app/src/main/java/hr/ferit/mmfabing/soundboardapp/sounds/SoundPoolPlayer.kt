package hr.ferit.mmfabing.soundboardapp.sounds

import android.content.Context
import android.media.AudioAttributes
import android.media.AudioManager
import android.media.SoundPool
import hr.ferit.mmfabing.soundboardapp.R

class SoundPoolPlayer(context: Context): AudioPlayer{

    private val priority: Int = 1
    private val maxStreams: Int = 3
    private val srcQuality: Int = 1

    private val leftVolume = 1f
    private val righVolume = 1f
    private val shouldLoop = 0
    private val playbackRate = 1f

    private val soundPool: SoundPool
    private val catSoundId: Int
    private val dogSoundId: Int
    private val owlSoundId: Int

    init {
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
            val audioAttributes = AudioAttributes.Builder()
                .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                .setUsage(AudioAttributes.USAGE_GAME)
                .build()
            soundPool = SoundPool.Builder()
                .setAudioAttributes(audioAttributes)
                .setMaxStreams(maxStreams)
                .build()
        } else {
            soundPool = SoundPool(maxStreams, AudioManager.USE_DEFAULT_STREAM_TYPE, srcQuality)
        }

        catSoundId = soundPool.load(context, R.raw.meow, priority)
        dogSoundId = soundPool.load(context, R.raw.woof, priority)
        owlSoundId = soundPool.load(context, R.raw.hoot, priority)
    }

    override fun playCatSound() {
        soundPool.play(catSoundId, leftVolume, righVolume, priority, shouldLoop, playbackRate)
    }

    override fun playDogSound() {
        soundPool.play(dogSoundId, leftVolume, righVolume, priority, shouldLoop, playbackRate)
    }

    override fun playOwlSound() {
        soundPool.play(owlSoundId, leftVolume, righVolume, priority, shouldLoop, playbackRate)
    }
}