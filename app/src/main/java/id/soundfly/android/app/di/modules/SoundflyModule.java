package id.soundfly.android.app.di.modules;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import id.soundfly.android.app.Soundfly;
import id.soundfly.android.ui.di.ActivityBuildersModule;

@Module(includes = {
        ActivityBuildersModule.class
})
public class SoundflyModule {

    @Provides
    @Singleton
    public Context context(Soundfly soundfly) {
        return soundfly;
    }
}
