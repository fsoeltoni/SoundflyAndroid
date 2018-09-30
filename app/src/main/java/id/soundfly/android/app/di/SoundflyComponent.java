package id.soundfly.android.app.di;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;
import id.soundfly.android.app.Soundfly;
import id.soundfly.android.app.di.modules.SoundflyModule;

@Singleton
@Component(modules = {
        AndroidSupportInjectionModule.class,
        SoundflyModule.class
})
public interface SoundflyComponent extends AndroidInjector<Soundfly> {

    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<Soundfly> {
    }
}
