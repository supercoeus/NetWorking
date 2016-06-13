package com.erhu.project.networking;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface HttpService {
    @GET("users/{user}/repos")
    Call<UserResponse> getUserList(@Path("user") String user);
}
