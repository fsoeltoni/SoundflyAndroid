package id.soundfly.android.app.di.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

public interface Qualifiers {

    @Qualifier
    @Retention(RetentionPolicy.RUNTIME)
    @interface MainContext {
    }
}
