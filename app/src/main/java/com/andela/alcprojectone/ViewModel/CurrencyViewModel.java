package com.andela.alcprojectone.ViewModel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.andela.alcprojectone.Model.CurrencyModel;


/**
 * Created by Arinze on 10/23/2017.
 */

public class CurrencyViewModel extends ViewModel{

    private LiveData<CurrencyModel> Currency;
    public LiveData<CurrencyModel> getCurrency(){
        return Currency;
    }


}
