package com.moringaschool.lend_demo.services;

import com.moringaschool.lend_demo.models.AccessToken;
import com.moringaschool.lend_demo.models.STKPush;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface STKPushService {
    @POST("mpesa/stkpush/v1/processrequest")
    public Call<STKPush> sendPush(@Body STKPush stkPush);

    @GET("oauth/v1/generate?grant_type=client_credentials")
    public Call<AccessToken> getAccessToken();
}
