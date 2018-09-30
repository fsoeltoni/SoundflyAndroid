package id.soundfly.android.ui.main.di;

import android.content.Context;

import dagger.Module;
import dagger.Provides;
import id.soundfly.android.app.di.annotations.Qualifiers;
import id.soundfly.android.app.di.annotations.Scopes;
import id.soundfly.android.ui.main.MainActivity;

@Module
public class MainModule {

    @Provides
    @Scopes.Activity
    @Qualifiers.MainContext
    public Context context(MainActivity mainActivity) {
        return mainActivity;
    }
}
