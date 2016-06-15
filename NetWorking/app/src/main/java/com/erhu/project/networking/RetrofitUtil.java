package com.erhu.project.networking;

import android.content.Context;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitUtil {
    private static final String WEB_URL = "http://192.168.1.115:8080";

    public static final HttpService service = null;

    public static void instanceHttpService(final Context context) {
        if (service == null) {
            HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
            logging.setLevel(HttpLoggingInterceptor.Level.BODY);

            //公私密钥
            //   MarvelSigningInterceptor signingInterceptor = new MarvelSigningInterceptor(KeyValue.MARVEL_PUBLIC_KEY, KeyValue.MARVEL_PRIVATE_KEY);

            //token拦截器
        /*Interceptor mToken = new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request originalRequest = chain.request();
                if ("" == null || alreadyHasAuthorizationHeader(originalRequest)) {
                    return chain.proceed(originalRequest);
                }
                Request authorised = originalRequest.newBuilder()
                        .header("Authorization", "")
                        .build();
                return chain.proceed(authorised);
            }
        };*/

            //设置缓存
          /*  File cacheFile = new File(context.getCacheDir(), "ZhiBookCache");
            Cache cache = new Cache(cacheFile, 1024 * 1024 * 50);
            Interceptor interceptorCache = new Interceptor() {
                @Override
                public Response intercept(Chain chain) throws IOException {
                    Request request = chain.request();
                    if (!NetworkStateUtils.getInstance(context).isConnection()) {
                        request = request.newBuilder()
                                .cacheControl(CacheControl.FORCE_CACHE)
                                .build();
                    }
                    Response response = chain.proceed(request);
                    if (NetworkStateUtils.getInstance(context).isConnection()) {
                        int maxAge = 0 * 60;
                        // 有网络时 设置缓存超时时间0个小时
                        response.newBuilder()
                                .header("Cache-Control", "public, max-age=" + maxAge)
                                .removeHeader("Pragma")// 清除头信息，因为服务器如果不支持，会返回一些干扰信息，不清除下面无法生效
                                .build();
                    } else {
                        // 无网络时，设置超时为4周
                        int maxStale = 60 * 60 * 24 * 28;
                        response.newBuilder()
                                .header("Cache-Control", "public, only-if-cached, max-stale=" + maxStale)
                                .removeHeader("Pragma")
                                .build();
                    }
                    return response;
                }
            };*/


            OkHttpClient httpClient = new OkHttpClient.Builder()
                    .addInterceptor(logging)//添加打印拦截器
                    //   .addInterceptor(signingInterceptor)//加密处理
                    .connectTimeout(30, TimeUnit.SECONDS)//设置请求超时时间
                    .retryOnConnectionFailure(true)//设置出现错误进行重新连接
                    //  .cache(cache)//设置缓存策略
                    .build();
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(WEB_URL)
                    .client(httpClient)
                    //增加 RxJava 适配器
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    //增加 Gson 转换器
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            HttpService httpService = retrofit.create(HttpService.class);
        }
    }


    public static boolean alreadyHasAuthorizationHeader(Request request) {
        if (request != null) {
            if (request.headers() != null) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

}
