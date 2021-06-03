package hr.ferit.mmfabing.soundboardapp.di

import hr.ferit.mmfabing.soundboardapp.sounds.AudioPlayer
import hr.ferit.mmfabing.soundboardapp.sounds.SoundPoolPlayer
import hr.ferit.mmfabing.soundboardapp.ui.SoundViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    single<AudioPlayer> { SoundPoolPlayer(androidContext()) }
}

val viewModelModule = module {
    viewModel<SoundViewModel>{SoundViewModel(get())}
}

