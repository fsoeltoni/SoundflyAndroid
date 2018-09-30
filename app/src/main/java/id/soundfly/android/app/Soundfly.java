package id.soundfly.android.app;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;
import id.soundfly.android.app.di.DaggerSoundflyComponent;

public class Soundfly extends DaggerApplication {

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {

        return DaggerSoundflyComponent
                .builder()
                .create(this);
    }
}
