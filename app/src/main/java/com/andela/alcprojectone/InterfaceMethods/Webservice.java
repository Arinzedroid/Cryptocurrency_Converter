package com.andela.alcprojectone.InterfaceMethods;

import com.andela.alcprojectone.Model.CurrencyModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Arinze on 10/23/2017.
 */

public interface Webservice {

@GET("/data/pricemulti")
    Call<CurrencyModel> getConversions (@Query("fsyms")String fsyms,
                                        @Query("tsyms") String tsyms);

}
