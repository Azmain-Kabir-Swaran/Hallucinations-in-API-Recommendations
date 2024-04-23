package org.example;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;

class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }
}