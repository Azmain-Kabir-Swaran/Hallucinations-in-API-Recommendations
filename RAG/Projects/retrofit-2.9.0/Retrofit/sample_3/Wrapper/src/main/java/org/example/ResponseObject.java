package org.example;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import java.io.IOException;

class ResponseObject {
    // Define the structure of your JSON response here
    // Using GSON for parsing JSON. You must have included the GSON dependency in your project
    // @SerializedName defines the field name that is used in the JSON response
}