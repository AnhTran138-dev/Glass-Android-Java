package com.example.glass_project.config;

import com.example.glass_project.data.model.EyeGlass;
import com.example.glass_project.data.model.EyeGlassImage;
import com.example.glass_project.data.model.EyeGlassType;
import com.example.glass_project.data.model.Login;
import com.example.glass_project.data.model.LoginResponse;
import com.example.glass_project.data.model.ResponseData;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface ApiService {
    @GET("api/EyeGlass")
    Call<ResponseData> getGlasses();

    @GET("api/EyeGlass/{eyeGlassId}")
    Call<EyeGlass> getGlassById(@Path("eyeGlassId") int eyeGlassId);

    @GET("api/EyeGlassImage/eyeGlass/{eyeGlassId}")
    Call<List<EyeGlassImage>> getGlassImageById(@Path("eyeGlassId") int eyeGlassId);

    @GET("api/EyeGlassType/{eyeGlassTypeId}")
    Call<EyeGlassType> getGlassTypeById(@Path("eyeGlassTypeId") int eyeGlassTypeId);

    @POST("api/Account/Login")
    Call<LoginResponse> login(@Body Login login);
}
