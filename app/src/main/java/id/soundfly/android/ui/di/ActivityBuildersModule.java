package id.soundfly.android.ui.di;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import id.soundfly.android.app.di.annotations.Scopes;
import id.soundfly.android.ui.main.MainActivity;
import id.soundfly.android.ui.main.di.MainModule;

@Module
public abstract class ActivityBuildersModule {

    @Scopes.Activity
    @ContributesAndroidInjector(modules = {
            MainModule.class
    })
    abstract MainActivity bindMainActivity();
}
