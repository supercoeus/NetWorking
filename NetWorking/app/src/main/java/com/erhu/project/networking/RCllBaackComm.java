package com.erhu.project.networking;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public abstract class RCllBaackComm<T> implements Callback<T> {
    @Override
    public void onResponse(Call<T> call, Response<T> response) {

        BaseResponse resp = (BaseResponse) response.body();
        //在此可以根据自己的功能需求进行相关判断
    }

    @Override
    public void onFailure(Call<T> call, Throwable t) {
        onFailed(new CommError("网络错误"));
    }

    public abstract void onSuccess(T response);

    public abstract void onFailed(CommError error);


}
