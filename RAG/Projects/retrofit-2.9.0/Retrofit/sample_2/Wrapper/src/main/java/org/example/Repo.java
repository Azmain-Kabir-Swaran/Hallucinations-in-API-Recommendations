package org.example;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import java.io.IOException;
import java.util.List;

public class Repo {
    String name;

    public String getName() {
        return name;
    }
}