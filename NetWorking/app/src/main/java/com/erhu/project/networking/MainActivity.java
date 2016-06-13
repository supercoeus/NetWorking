package com.erhu.project.networking;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    private void getUser(){
       Retrofit retrofit=new Retrofit.Builder().baseUrl("").build();
        HttpService  httpService=retrofit.create(HttpService.class);
        retrofit2.Call<UserResponse>  call=httpService.getUserList("user");
        call.enqueue(new Callback<UserResponse>() {
            @Override
            public void onResponse(retrofit2.Call<UserResponse> call, Response<UserResponse> response) {
                UserResponse response1=response.body();
            }

            @Override
            public void onFailure(retrofit2.Call<UserResponse> call, Throwable t) {

            }
        });

    }
}
