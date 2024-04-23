package org.example;


import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("your_base_url")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ApiInterface api = retrofit.create(ApiInterface.class);
        Call<ResponseObject> call = api.getSomething();

        call.enqueue(new Callback<ResponseObject>() {
            @Override
            public void onResponse(Call<ResponseObject> call, Response<ResponseObject> response) {
                if (!response.isSuccessful()) {
                    System.out.println("Unsuccessful response from server: " + response.code());
                    return;
                }

                // Use the data from the response
                ResponseObject data = response.body();
                System.out.println(data);
            }

            @Override
            public void onFailure(Call<ResponseObject> call, Throwable t) {
                System.out.println("An error occurred: " + t.getMessage());
            }
        });
    }
}