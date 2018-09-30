package id.soundfly.android.app.di.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

public interface Scopes {

    @Scope
    @Retention(RetentionPolicy.RUNTIME)
    @interface Activity{}
}
