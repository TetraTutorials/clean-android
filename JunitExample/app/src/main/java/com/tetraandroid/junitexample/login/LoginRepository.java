package com.tetraandroid.junitexample.login;

public interface LoginRepository {

    User getUser();

    void saveUser(User user);
}
