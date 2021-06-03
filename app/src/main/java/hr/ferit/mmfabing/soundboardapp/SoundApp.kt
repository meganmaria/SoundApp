package hr.ferit.mmfabing.soundboardapp

import android.app.Application
import hr.ferit.mmfabing.soundboardapp.di.appModule
import hr.ferit.mmfabing.soundboardapp.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class SoundApp: Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin{
            androidContext(this@SoundApp)
            modules(appModule, viewModelModule)
        }
    }
}