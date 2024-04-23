package org.example;


import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.Call;
import retrofit2.Response;

public class Main {

    public static void main(String[] args) {
        // Setup HttpLoggingInterceptor
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BASIC);
        
        // Initialize OkHttpClient
        OkHttpClient client = new OkHttpClient.Builder()
                                        .addInterceptor(logging)
                                        .build();
        
        // Setup Retrofit with OkHttpClient and Gson converter
        Retrofit retrofit = new Retrofit.Builder()
                                .baseUrl("https://example.com/")
                                .client(client)
                                .addConverterFactory(GsonConverterFactory.create())
                                .build();
        
        // Define an interface with your API method
        API api = retrofit.create(API.class);
        
        // Invoke an API method
        Call<YourDataClass> call = api.yourApiMethod();
        Response<YourDataClass> response = call.execute();
        
        // Handle response
        YourDataClass yourData = response.body();
        System.out.println(yourData);
    }

    // Define an interface for your API
    public interface API {
        @GET("your-api")
        Call<YourDataClass> yourApiMethod();
    }

    // YourDataClass is a POJO class for your data model
    public class YourDataClass {
        // Properties correspond to data in your API response
    }
}