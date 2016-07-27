package com.tetraandroid.junitexample.login;

public class MemoryRepository implements LoginRepository {

    private User user;

    @Override
    public User getUser() {

        if (user == null) {
            User user = new User("Fox", "Mulder");
            user.setId(0);
            this.user = user;
            return this.user;
        } else {
            return user;
        }

    }

    @Override
    public void saveUser(User user) {

        this.user.setFirstName(user.getFirstName());
        this.user.setLastName(user.getLastName());


    }
}
