package com.erhu.project.networking;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * 正常处理Retrofif返回数据
 */
public abstract class RCllBack<T> implements Callback<T> {
    @Override
    public void onResponse(Call<T> call, Response<T> response) {
        onSuccess(response.body());
    }

    @Override
    public void onFailure(Call<T> call, Throwable t) {

    }


    public abstract void onSuccess(T response);
}
