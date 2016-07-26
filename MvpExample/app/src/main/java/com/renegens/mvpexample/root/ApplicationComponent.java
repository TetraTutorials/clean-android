package com.renegens.mvpexample.root;

import com.renegens.mvpexample.login.LoginActivity;
import com.renegens.mvpexample.login.LoginModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class, LoginModule.class})
public interface ApplicationComponent {

    void inject(LoginActivity target);

}
