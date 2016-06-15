package com.erhu.project.networking;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.start).setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.start:
                getUser();
                break;
        }
    }


    private void getUser() {
        String phone = "15029206553";
        String password = "123456";
        Call<UserResponse> call = RetrofitUtil.service.getUserByLogin(password, phone);
        //1
        call.enqueue(new Callback<UserResponse>() {
            @Override
            public void onResponse(Call<UserResponse> call, Response<UserResponse> response) {
                Toast.makeText(MainActivity.this, "respone" + response.body().getData().getUser().getImagpath(), Toast.LENGTH_LONG).show();
            }

            @Override
            public void onFailure(Call<UserResponse> call, Throwable t) {

            }
        });
        //2
        call.enqueue(new RCllBack<UserResponse>() {
            @Override
            public void onSuccess(UserResponse response) {

            }
        });
        //3
        call.enqueue(new RCllBaackComm<UserResponse>() {
            @Override
            public void onSuccess(UserResponse response) {

            }

            @Override
            public void onFailed(CommError error) {

            }
        });
    }


}
