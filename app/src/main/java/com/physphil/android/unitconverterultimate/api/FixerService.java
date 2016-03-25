package com.physphil.android.unitconverterultimate.api;

import com.physphil.android.unitconverterultimate.api.models.Latest;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Retrofit Service used to consume Fixer.io API
 * Created by Phizz on 16-03-25.
 */
public interface FixerService
{
    @GET("latest")
    Call<Latest> getLatest();
}
