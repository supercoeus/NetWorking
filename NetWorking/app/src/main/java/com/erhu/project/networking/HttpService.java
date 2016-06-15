package com.erhu.project.networking;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface HttpService {
    @FormUrlEncoded
    @POST("/frist/noIntercept/user/login.do")
    Call<UserResponse> getUserByLogin(@Field("password") String password, @Field("phone") String phone);



   /* @GET("/frist/noIntercept/user/login.do?password=123456&phone=15029206553")
    Call<UserResponse> getUserByLogin();*/

   /* @GET("/frist/noIntercept/{user}/login.do?password=123456&phone=15029206553")
    Call<UserResponse> getUserByLogin(@Path("user") String user);*/


   /* @GET("/frist/noIntercept/user/login.do")
    Call<UserResponse> getUserByLogin(@Query("password") String password, @Query("phone") String phone);*/

  /*  @GET("/frist/noIntercept/{user}/login.do")
    Call<UserResponse> getUserByLogin(@Path("user") String user,@Query("password") String password, @Query("phone") String phone);*/



      /* @POST("/frist/noIntercept/user/login.do")
       Call<UserResponse> getUserByLogin(@Body LoginBean loginBean);*/

}
