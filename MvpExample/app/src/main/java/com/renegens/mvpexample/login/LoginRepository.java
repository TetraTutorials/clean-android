package com.renegens.mvpexample.login;

public interface LoginRepository {

    User getUser();

    void saveUser(User user);
}
