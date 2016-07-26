package com.renegens.daggerexample;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by renegens on 25/07/16.
 */

@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {

    void inject (MainActivity target);
}
