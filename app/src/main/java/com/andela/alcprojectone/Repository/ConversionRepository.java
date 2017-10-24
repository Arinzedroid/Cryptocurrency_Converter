package com.andela.alcprojectone.Repository;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.support.annotation.NonNull;
import android.util.Log;

import com.andela.alcprojectone.InterfaceMethods.Webservice;
import com.andela.alcprojectone.Model.CurrencyModel;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Arinze on 10/23/2017.
 */

public class ConversionRepository {
    private Webservice webservice;
    private static final String BASE_URL = "https://min-api.cryptocompare.com";

    public ConversionRepository(){
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
// set your desired log level
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
// add your other interceptors …

// add logging as last interceptor
        httpClient.addInterceptor(logging);

        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL)
                .client(httpClient.build())
                .build();
        webservice = retrofit.create(Webservice.class);
    }

    public LiveData<CurrencyModel> getConversion(String fsyms, String tsyms){
       final MutableLiveData<CurrencyModel> data = new MutableLiveData<>();
       webservice.getConversions(fsyms,tsyms).enqueue(new Callback<CurrencyModel>() {
           @Override
           public void onResponse( Call<CurrencyModel> call, Response<CurrencyModel> response) {
               data.postValue(response.body());
           }

           @Override
           public void onFailure(Call<CurrencyModel> call, Throwable t) {

           }
       });

       return data;
    }
}
