package org.example;


import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import java.io.IOException;
import java.util.List;

public class Main {
    private static final String BASE_URL = "https://api.github.com";
    public static void main(String[] args) {
        // Create a very simple REST adapter which points the GitHub API.
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        // Create an instance of our GitHub API interface.
        GithubService service = retrofit.create(GithubService.class);

        // Create a call instance for looking up Retrofit
        Call<List<Repo>> call = service.getRepos();

        // Fetch and print a list of the names of the repos
        try {
            Response<List<Repo>> response = call.execute();
            List<Repo> repos = response.body();
            for (Repo repo : repos) {
                System.out.println(repo.getName());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}