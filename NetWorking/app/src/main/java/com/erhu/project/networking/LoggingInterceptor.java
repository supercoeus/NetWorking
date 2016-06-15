package com.erhu.project.networking;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class LoggingInterceptor implements Interceptor {

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();

        long t1 = System.nanoTime();

       // request.url(), chain.connection(), request.headers();

        Response response = chain.proceed(request);
        long t2 = System.nanoTime();

       // response.request().url(), (t2 - t1) / 1e6d, response.headers();

        return response;
    }
}
