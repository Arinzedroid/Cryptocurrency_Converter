package com.andela.alcprojectone.ViewModel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import com.andela.alcprojectone.Model.CurrencyModel;
import com.andela.alcprojectone.Repository.ConversionRepository;

import javax.inject.Inject;


/**
 * Created by Arinze on 10/23/2017.
 */

public class CurrencyViewModel extends ViewModel{

    private ConversionRepository conversionRepository;
    private LiveData<CurrencyModel> Currency;


    public CurrencyViewModel(){
        this.conversionRepository = new ConversionRepository();
    }

    public LiveData<CurrencyModel> getConversion(String fsyms, String tsyms){
        if(this.Currency == null) {
            Currency = conversionRepository.getConversion(fsyms, tsyms);
        }
        return Currency;
    }





}
