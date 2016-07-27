package com.tetraandroid.junitexamplev.root;

import com.tetraandroid.junitexample.login.LoginActivity;
import com.tetraandroid.junitexample.login.LoginModule;
import com.tetraandroid.junitexample.root.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class, LoginModule.class})
public interface ApplicationComponent {

    void inject(LoginActivity target);

}
