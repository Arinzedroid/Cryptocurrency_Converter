package com.andela.alcprojectone;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnTextChanged;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * Use the {@link ConversionFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ConversionFragment extends DialogFragment {

    @BindView(R.id.fragment_rate)
    TextView rate;
    @BindView(R.id.to_value)
    EditText ToValue;
    @BindView(R.id.from_value)
    EditText FromValue;
    @BindView(R.id.from_spinner)
    Spinner FromSpinner;
    @BindView(R.id.to_spinner)
    Spinner ToSpinner;

    MainActivity main;

    Double NGN,USD,EUR,JPY,GBP,CHF,CAD,AUD,ZAR,CNY,INR,SGD,TWD,RUB,MXN,ILS,MYR,SEK,NOK,TRY;
    Double NGN_, USD_, EUR_, JPY_, GBP_, CHF_, CAD_, AUD_, ZAR_, CNY_, INR_, SGD_, TWD_, RUB_, MXN_, ILS_, MYR_, SEK_, NOK_, TRY_;



    public ConversionFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment ConversionFragment.
//     */
    // TODO: Rename and change types and number of parameters
    public static ConversionFragment newInstance() {
        ConversionFragment fragment = new ConversionFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(DialogFragment.STYLE_NO_TITLE,android.R.style.Theme_Holo_Light_Dialog);

        main = (MainActivity)getActivity();

        NGN = main.NGN;
        USD = main.USD;
        EUR = main.EUR;
        JPY = main.JPY;
        GBP = main.GBP;
        CHF = main.CHF;
        CAD = main.CAD;
        AUD = main.AUD;
        ZAR = main.ZAR;
        CNY = main.CNY;
        INR = main.INR;
        SGD = main.SGD;
        TWD = main.TWD;
        RUB = main.RUB;
        MXN = main.MXN;
        ILS = main.ILS;
        MYR = main.MYR;
        SEK = main.SEK;
        NOK = main.NOK;
        TRY = main.TRY;

        NGN_ = main.NGN_;
        USD_ = main.USD_;
        EUR_ = main.EUR_;
        JPY_ = main.JPY_;
        GBP_ = main.GBP_;
        CHF_ = main.CHF_;
        CAD_ = main.CAD_;
        AUD_ = main.AUD_;
        ZAR_ = main.ZAR_;
        CNY_ = main.CNY_;
        INR_ = main.INR_;
        SGD_ = main.SGD_;
        TWD_ = main.TWD_;
        RUB_ = main.RUB_;
        MXN_ = main.MXN_;
        ILS_ = main.ILS_;
        MYR_ = main.MYR_;
        SEK_ = main.SEK_;
        NOK_ = main.NOK_;
        TRY_ = main.TRY_;

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_conversion, container, false);
        ButterKnife.bind(this,view );



        ToValue.addTextChangedListener(new TextWatcher() {

            boolean ignoreChange = false;
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(!ignoreChange) {
                    if(!ToValue.getText().toString().trim().equalsIgnoreCase("")) {//
                        Double value = Double.valueOf(charSequence.toString());
                        String FromFormat= ToSpinner.getSelectedItem().toString();
                        String  ToFormat= FromSpinner.getSelectedItem().toString();

                        FromValue.setText(String.valueOf(ConvertToBaseCurrency(value, FromFormat, ToFormat)));
                    }
                    else FromValue.setText("");
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });


        return view;
    }

    
    private Double ConvertToBaseCurrency(Double value, String fromFormat,String toFormat){
        Double result = 0.0;
        if(value == null)
            return result;
        switch (fromFormat.toUpperCase()){
            case "NGN": {
                switch (toFormat.toUpperCase()) {
                    case "NGN": {
                        result = (value * NGN) / NGN;
                        break;
                    }
                    case "USD": {
                        result = (value * USD) / NGN;

                        break;
                    }
                    case "EUR": {
                        result = (value * EUR) / NGN;

                        break;
                    }
                    case "JPY": {
                        result = (value * JPY) / NGN;

                        break;
                    }
                    case "GBP": {
                        result = (value * GBP) / NGN;
                        break;
                    }
                    case "CHF": {
                        result = (value * CHF) / NGN;
                        break;
                    }
                    case "CAD": {
                        result = (value * CAD) / NGN;
                        break;
                    }
                    case "AUD": {
                        result = (value * AUD) / NGN;
                        break;
                    }
                    case "ZAR": {
                        result = (value * ZAR) / NGN;
                        break;
                    }
                    case "CNY": {
                        result = (value * CNY) / NGN;
                        break;
                    }
                    case "INR": {
                        result = (value * INR) / NGN;
                        break;
                    }
                    case "SGD": {
                        result = (value * SGD) / NGN;
                        break;
                    }
                    case "TWD": {
                        result = (value * TWD) / NGN;
                        break;
                    }
                    case "RUB": {
                        result = (value * RUB) / NGN;
                        break;
                    }
                    case "MXN": {
                        result = (value * MXN) / NGN;
                        break;
                    }
                    case "ILS": {
                        result = (value * ILS) / NGN;
                        break;
                    }
                    case "MYR": {
                        result = (value * MYR) / NGN;
                        break;
                    }
                    case "SEK": {
                        result = (value * SEK) / NGN;
                        break;
                    }
                    case "NOK": {
                        result = (value * NOK) / NGN;
                        break;
                    }
                    case "TRY": {
                        result = (value * TRY) / NGN;
                        break;
                    }
                }
                break;
            }
            case "USD": {
                switch (toFormat.toUpperCase()) {
                    case "NGN": {
                        result = (value * NGN) / USD;
                        break;
                    }
                    case "USD": {
                        result = (value * USD) / USD;

                        break;
                    }
                    case "EUR": {
                        result = (value * EUR) / USD;

                        break;
                    }
                    case "JPY": {
                        result = (value * JPY) / USD;

                        break;
                    }
                    case "GBP": {
                        result = (value * GBP) / USD;
                        break;
                    }
                    case "CHF": {
                        result = (value * CHF) / USD;
                        break;
                    }
                    case "CAD": {
                        result = (value * CAD) / USD;
                        break;
                    }
                    case "AUD": {
                        result = (value * AUD) / USD;
                        break;
                    }
                    case "ZAR": {
                        result = (value * ZAR) / USD;
                        break;
                    }
                    case "CNY": {
                        result = (value * CNY) / USD;
                        break;
                    }
                    case "INR": {
                        result = (value * INR) / USD;
                        break;
                    }
                    case "SGD": {
                        result = (value * SGD) / USD;
                        break;
                    }
                    case "TWD": {
                        result = (value * TWD) / USD;
                        break;
                    }
                    case "RUB": {
                        result = (value * RUB) / USD;
                        break;
                    }
                    case "MXN": {
                        result = (value * MXN) / USD;
                        break;
                    }
                    case "ILS": {
                        result = (value * ILS) / USD;
                        break;
                    }
                    case "MYR": {
                        result = (value * MYR) / USD;
                        break;
                    }
                    case "SEK": {
                        result = (value * SEK) / USD;
                        break;
                    }
                    case "NOK": {
                        result = (value * NOK) / USD;
                        break;
                    }
                    case "TRY": {
                        result = (value * TRY) / USD;
                        break;
                    }
                }
               
                break;
            }
            case "EUR": {
                switch (toFormat.toUpperCase()) {
                    case "NGN": {
                        result = (value * NGN) / EUR;
                        break;
                    }
                    case "USD": {
                        result = (value * USD) / EUR;

                        break;
                    }
                    case "EUR": {
                        result = (value * EUR) / EUR;

                        break;
                    }
                    case "JPY": {
                        result = (value * JPY) / EUR;

                        break;
                    }
                    case "GBP": {
                        result = (value * GBP) / EUR;
                        break;
                    }
                    case "CHF": {
                        result = (value * CHF) / EUR;
                        break;
                    }
                    case "CAD": {
                        result = (value * CAD) / EUR;
                        break;
                    }
                    case "AUD": {
                        result = (value * AUD) / EUR;
                        break;
                    }
                    case "ZAR": {
                        result = (value * ZAR) / EUR;
                        break;
                    }
                    case "CNY": {
                        result = (value * CNY) / EUR;
                        break;
                    }
                    case "INR": {
                        result = (value * INR) / EUR;
                        break;
                    }
                    case "SGD": {
                        result = (value * SGD) / EUR;
                        break;
                    }
                    case "TWD": {
                        result = (value * TWD) / EUR;
                        break;
                    }
                    case "RUB": {
                        result = (value * RUB) / EUR;
                        break;
                    }
                    case "MXN": {
                        result = (value * MXN) / EUR;
                        break;
                    }
                    case "ILS": {
                        result = (value * ILS) / EUR;
                        break;
                    }
                    case "MYR": {
                        result = (value * MYR) / EUR;
                        break;
                    }
                    case "SEK": {
                        result = (value * SEK) / EUR;
                        break;
                    }
                    case "NOK": {
                        result = (value * NOK) / EUR;
                        break;
                    }
                    case "TRY": {
                        result = (value * TRY) / EUR;
                        break;
                    }
                }
                
                break;
            }
            case "JPY": {
                switch (toFormat.toUpperCase()) {
                    case "NGN": {
                        result = (value * NGN) / JPY;
                        break;
                    }
                    case "USD": {
                        result = (value * USD) / JPY;

                        break;
                    }
                    case "EUR": {
                        result = (value * EUR) / JPY;

                        break;
                    }
                    case "JPY": {
                        result = (value * JPY) / JPY;

                        break;
                    }
                    case "GBP": {
                        result = (value * GBP) / JPY;
                        break;
                    }
                    case "CHF": {
                        result = (value * CHF) / JPY;
                        break;
                    }
                    case "CAD": {
                        result = (value * CAD) / JPY;
                        break;
                    }
                    case "AUD": {
                        result = (value * AUD) / JPY;
                        break;
                    }
                    case "ZAR": {
                        result = (value * ZAR) / JPY;
                        break;
                    }
                    case "CNY": {
                        result = (value * CNY) / JPY;
                        break;
                    }
                    case "INR": {
                        result = (value * INR) / JPY;
                        break;
                    }
                    case "SGD": {
                        result = (value * SGD) / JPY;
                        break;
                    }
                    case "TWD": {
                        result = (value * TWD) / JPY;
                        break;
                    }
                    case "RUB": {
                        result = (value * RUB) / JPY;
                        break;
                    }
                    case "MXN": {
                        result = (value * MXN) / JPY;
                        break;
                    }
                    case "ILS": {
                        result = (value * ILS) / JPY;
                        break;
                    }
                    case "MYR": {
                        result = (value * MYR) / JPY;
                        break;
                    }
                    case "SEK": {
                        result = (value * SEK) / JPY;
                        break;
                    }
                    case "NOK": {
                        result = (value * NOK) / JPY;
                        break;
                    }
                    case "TRY": {
                        result = (value * TRY) / JPY;
                        break;
                    }
                }
                
                break;
            }
            case "GBP": {

                switch (toFormat.toUpperCase()) {
                    case "NGN": {
                        result = (value * NGN) / GBP;
                        break;
                    }
                    case "USD": {
                        result = (value * USD) / GBP;

                        break;
                    }
                    case "EUR": {
                        result = (value * EUR) / GBP;

                        break;
                    }
                    case "JPY": {
                        result = (value * JPY) / GBP;

                        break;
                    }
                    case "GBP": {
                        result = (value * GBP) / GBP;
                        break;
                    }
                    case "CHF": {
                        result = (value * CHF) / GBP;
                        break;
                    }
                    case "CAD": {
                        result = (value * CAD) / GBP;
                        break;
                    }
                    case "AUD": {
                        result = (value * AUD) / GBP;
                        break;
                    }
                    case "ZAR": {
                        result = (value * ZAR) / GBP;
                        break;
                    }
                    case "CNY": {
                        result = (value * CNY) / GBP;
                        break;
                    }
                    case "INR": {
                        result = (value * INR) / GBP;
                        break;
                    }
                    case "SGD": {
                        result = (value * SGD) / GBP;
                        break;
                    }
                    case "TWD": {
                        result = (value * TWD) / GBP;
                        break;
                    }
                    case "RUB": {
                        result = (value * RUB) / GBP;
                        break;
                    }
                    case "MXN": {
                        result = (value * MXN) / GBP;
                        break;
                    }
                    case "ILS": {
                        result = (value * ILS) / GBP;
                        break;
                    }
                    case "MYR": {
                        result = (value * MYR) / GBP;
                        break;
                    }
                    case "SEK": {
                        result = (value * SEK) / GBP;
                        break;
                    }
                    case "NOK": {
                        result = (value * NOK) / GBP;
                        break;
                    }
                    case "TRY": {
                        result = (value * TRY) / GBP;
                        break;
                    }
                }
                
                break;
            }
            case "CHF": {

                switch (toFormat.toUpperCase()) {
                    case "NGN": {
                        result = (value * NGN) / CHF;
                        break;
                    }
                    case "USD": {
                        result = (value * USD) / CHF;

                        break;
                    }
                    case "EUR": {
                        result = (value * EUR) / CHF;

                        break;
                    }
                    case "JPY": {
                        result = (value * JPY) / CHF;

                        break;
                    }
                    case "GBP": {
                        result = (value * GBP) / CHF;
                        break;
                    }
                    case "CHF": {
                        result = (value * CHF) / CHF;
                        break;
                    }
                    case "CAD": {
                        result = (value * CAD) / CHF;
                        break;
                    }
                    case "AUD": {
                        result = (value * AUD) / CHF;
                        break;
                    }
                    case "ZAR": {
                        result = (value * ZAR) / CHF;
                        break;
                    }
                    case "CNY": {
                        result = (value * CNY) / CHF;
                        break;
                    }
                    case "INR": {
                        result = (value * INR) / CHF;
                        break;
                    }
                    case "SGD": {
                        result = (value * SGD) / CHF;
                        break;
                    }
                    case "TWD": {
                        result = (value * TWD) / CHF;
                        break;
                    }
                    case "RUB": {
                        result = (value * RUB) / CHF;
                        break;
                    }
                    case "MXN": {
                        result = (value * MXN) / CHF;
                        break;
                    }
                    case "ILS": {
                        result = (value * ILS) / CHF;
                        break;
                    }
                    case "MYR": {
                        result = (value * MYR) / CHF;
                        break;
                    }
                    case "SEK": {
                        result = (value * SEK) / CHF;
                        break;
                    }
                    case "NOK": {
                        result = (value * NOK) / CHF;
                        break;
                    }
                    case "TRY": {
                        result = (value * TRY) / CHF;
                        break;
                    }
                }
                
                break;
            }
            case "CAD": {

                switch (toFormat.toUpperCase()) {
                    case "NGN": {
                        result = (value * NGN) / CAD;
                        break;
                    }
                    case "USD": {
                        result = (value * USD) / CAD;

                        break;
                    }
                    case "EUR": {
                        result = (value * EUR) / CAD;

                        break;
                    }
                    case "JPY": {
                        result = (value * JPY) / CAD;

                        break;
                    }
                    case "GBP": {
                        result = (value * GBP) / CAD;
                        break;
                    }
                    case "CHF": {
                        result = (value * CHF) / CAD;
                        break;
                    }
                    case "CAD": {
                        result = (value * CAD) / CAD;
                        break;
                    }
                    case "AUD": {
                        result = (value * AUD) / CAD;
                        break;
                    }
                    case "ZAR": {
                        result = (value * ZAR) / CAD;
                        break;
                    }
                    case "CNY": {
                        result = (value * CNY) / CAD;
                        break;
                    }
                    case "INR": {
                        result = (value * INR) / CAD;
                        break;
                    }
                    case "SGD": {
                        result = (value * SGD) / CAD;
                        break;
                    }
                    case "TWD": {
                        result = (value * TWD) / CAD;
                        break;
                    }
                    case "RUB": {
                        result = (value * RUB) / CAD;
                        break;
                    }
                    case "MXN": {
                        result = (value * MXN) / CAD;
                        break;
                    }
                    case "ILS": {
                        result = (value * ILS) / CAD;
                        break;
                    }
                    case "MYR": {
                        result = (value * MYR) / CAD;
                        break;
                    }
                    case "SEK": {
                        result = (value * SEK) / CAD;
                        break;
                    }
                    case "NOK": {
                        result = (value * NOK) / CAD;
                        break;
                    }
                    case "TRY": {
                        result = (value * TRY) / CAD;
                        break;
                    }
                }
                
                break;
            }
            case "AUD": {

                switch (toFormat.toUpperCase()) {
                    case "NGN": {
                        result = (value * NGN) / AUD;
                        break;
                    }
                    case "USD": {
                        result = (value * USD) / AUD;

                        break;
                    }
                    case "EUR": {
                        result = (value * EUR) / AUD;

                        break;
                    }
                    case "JPY": {
                        result = (value * JPY) / AUD;

                        break;
                    }
                    case "GBP": {
                        result = (value * GBP) / AUD;
                        break;
                    }
                    case "CHF": {
                        result = (value * CHF) / AUD;
                        break;
                    }
                    case "CAD": {
                        result = (value * CAD) / AUD;
                        break;
                    }
                    case "AUD": {
                        result = (value * AUD) / AUD;
                        break;
                    }
                    case "ZAR": {
                        result = (value * ZAR) / AUD;
                        break;
                    }
                    case "CNY": {
                        result = (value * CNY) / AUD;
                        break;
                    }
                    case "INR": {
                        result = (value * INR) / AUD;
                        break;
                    }
                    case "SGD": {
                        result = (value * SGD) / AUD;
                        break;
                    }
                    case "TWD": {
                        result = (value * TWD) / AUD;
                        break;
                    }
                    case "RUB": {
                        result = (value * RUB) / AUD;
                        break;
                    }
                    case "MXN": {
                        result = (value * MXN) / AUD;
                        break;
                    }
                    case "ILS": {
                        result = (value * ILS) / AUD;
                        break;
                    }
                    case "MYR": {
                        result = (value * MYR) / AUD;
                        break;
                    }
                    case "SEK": {
                        result = (value * SEK) / AUD;
                        break;
                    }
                    case "NOK": {
                        result = (value * NOK) / AUD;
                        break;
                    }
                    case "TRY": {
                        result = (value * TRY) / AUD;
                        break;
                    }
                }
                
                break;
            }
            case "ZAR": {
                switch (toFormat.toUpperCase()) {
                    case "NGN": {
                        result = (value * NGN) / ZAR;
                        break;
                    }
                    case "USD": {
                        result = (value * USD) / ZAR;

                        break;
                    }
                    case "EUR": {
                        result = (value * EUR) / ZAR;

                        break;
                    }
                    case "JPY": {
                        result = (value * JPY) / ZAR;

                        break;
                    }
                    case "GBP": {
                        result = (value * GBP) / ZAR;
                        break;
                    }
                    case "CHF": {
                        result = (value * CHF) / ZAR;
                        break;
                    }
                    case "CAD": {
                        result = (value * CAD) / ZAR;
                        break;
                    }
                    case "AUD": {
                        result = (value * AUD) / ZAR;
                        break;
                    }
                    case "ZAR": {
                        result = (value * ZAR) / ZAR;
                        break;
                    }
                    case "CNY": {
                        result = (value * CNY) / ZAR;
                        break;
                    }
                    case "INR": {
                        result = (value * INR) / ZAR;
                        break;
                    }
                    case "SGD": {
                        result = (value * SGD) / ZAR;
                        break;
                    }
                    case "TWD": {
                        result = (value * TWD) / ZAR;
                        break;
                    }
                    case "RUB": {
                        result = (value * RUB) / ZAR;
                        break;
                    }
                    case "MXN": {
                        result = (value * MXN) / ZAR;
                        break;
                    }
                    case "ILS": {
                        result = (value * ILS) / ZAR;
                        break;
                    }
                    case "MYR": {
                        result = (value * MYR) / ZAR;
                        break;
                    }
                    case "SEK": {
                        result = (value * SEK) / ZAR;
                        break;
                    }
                    case "NOK": {
                        result = (value * NOK) / ZAR;
                        break;
                    }
                    case "TRY": {
                        result = (value * TRY) / ZAR;
                        break;
                    }
                }
                
                break;
            }
            case "CNY": {
                switch (toFormat.toUpperCase()) {
                    case "NGN": {
                        result = (value * NGN) / CNY;
                        break;
                    }
                    case "USD": {
                        result = (value * USD) / CNY;

                        break;
                    }
                    case "EUR": {
                        result = (value * EUR) / CNY;

                        break;
                    }
                    case "JPY": {
                        result = (value * JPY) / CNY;

                        break;
                    }
                    case "GBP": {
                        result = (value * GBP) / CNY;
                        break;
                    }
                    case "CHF": {
                        result = (value * CHF) / CNY;
                        break;
                    }
                    case "CAD": {
                        result = (value * CAD) / CNY;
                        break;
                    }
                    case "AUD": {
                        result = (value * AUD) / CNY;
                        break;
                    }
                    case "ZAR": {
                        result = (value * ZAR) / CNY;
                        break;
                    }
                    case "CNY": {
                        result = (value * CNY) / CNY;
                        break;
                    }
                    case "INR": {
                        result = (value * INR) / CNY;
                        break;
                    }
                    case "SGD": {
                        result = (value * SGD) / CNY;
                        break;
                    }
                    case "TWD": {
                        result = (value * TWD) / CNY;
                        break;
                    }
                    case "RUB": {
                        result = (value * RUB) / CNY;
                        break;
                    }
                    case "MXN": {
                        result = (value * MXN) / CNY;
                        break;
                    }
                    case "ILS": {
                        result = (value * ILS) / CNY;
                        break;
                    }
                    case "MYR": {
                        result = (value * MYR) / CNY;
                        break;
                    }
                    case "SEK": {
                        result = (value * SEK) / CNY;
                        break;
                    }
                    case "NOK": {
                        result = (value * NOK) / CNY;
                        break;
                    }
                    case "TRY": {
                        result = (value * TRY) / CNY;
                        break;
                    }
                }
               
                break;
            }
            case "INR": {
                switch (toFormat.toUpperCase()) {
                    case "NGN": {
                        result = (value * NGN) / INR;
                        break;
                    }
                    case "USD": {
                        result = (value * USD) / INR;

                        break;
                    }
                    case "EUR": {
                        result = (value * EUR) / INR;

                        break;
                    }
                    case "JPY": {
                        result = (value * JPY) / INR;

                        break;
                    }
                    case "GBP": {
                        result = (value * GBP) / INR;
                        break;
                    }
                    case "CHF": {
                        result = (value * CHF) / INR;
                        break;
                    }
                    case "CAD": {
                        result = (value * CAD) / INR;
                        break;
                    }
                    case "AUD": {
                        result = (value * AUD) / INR;
                        break;
                    }
                    case "ZAR": {
                        result = (value * ZAR) / INR;
                        break;
                    }
                    case "CNY": {
                        result = (value * CNY) / INR;
                        break;
                    }
                    case "INR": {
                        result = (value * INR) / INR;
                        break;
                    }
                    case "SGD": {
                        result = (value * SGD) / INR;
                        break;
                    }
                    case "TWD": {
                        result = (value * TWD) / INR;
                        break;
                    }
                    case "RUB": {
                        result = (value * RUB) / INR;
                        break;
                    }
                    case "MXN": {
                        result = (value * MXN) / INR;
                        break;
                    }
                    case "ILS": {
                        result = (value * ILS) / INR;
                        break;
                    }
                    case "MYR": {
                        result = (value * MYR) / INR;
                        break;
                    }
                    case "SEK": {
                        result = (value * SEK) / INR;
                        break;
                    }
                    case "NOK": {
                        result = (value * NOK) / INR;
                        break;
                    }
                    case "TRY": {
                        result = (value * TRY) / INR;
                        break;
                    }
                }
                
                break;
            }
            case "SGD": {
                switch (toFormat.toUpperCase()) {
                    case "NGN": {
                        result = (value * NGN) / SGD;
                        break;
                    }
                    case "USD": {
                        result = (value * USD) / SGD;

                        break;
                    }
                    case "EUR": {
                        result = (value * EUR) / SGD;

                        break;
                    }
                    case "JPY": {
                        result = (value * JPY) / SGD;

                        break;
                    }
                    case "GBP": {
                        result = (value * GBP) / SGD;
                        break;
                    }
                    case "CHF": {
                        result = (value * CHF) / SGD;
                        break;
                    }
                    case "CAD": {
                        result = (value * CAD) / SGD;
                        break;
                    }
                    case "AUD": {
                        result = (value * AUD) / SGD;
                        break;
                    }
                    case "ZAR": {
                        result = (value * ZAR) / SGD;
                        break;
                    }
                    case "CNY": {
                        result = (value * CNY) / SGD;
                        break;
                    }
                    case "INR": {
                        result = (value * INR) / SGD;
                        break;
                    }
                    case "SGD": {
                        result = (value * SGD) / SGD;
                        break;
                    }
                    case "TWD": {
                        result = (value * TWD) / SGD;
                        break;
                    }
                    case "RUB": {
                        result = (value * RUB) / SGD;
                        break;
                    }
                    case "MXN": {
                        result = (value * MXN) / SGD;
                        break;
                    }
                    case "ILS": {
                        result = (value * ILS) / SGD;
                        break;
                    }
                    case "MYR": {
                        result = (value * MYR) / SGD;
                        break;
                    }
                    case "SEK": {
                        result = (value * SEK) / SGD;
                        break;
                    }
                    case "NOK": {
                        result = (value * NOK) / SGD;
                        break;
                    }
                    case "TRY": {
                        result = (value * TRY) / SGD;
                        break;
                    }
                }
               
                break;
            }
            case "TWD": {

                switch (toFormat.toUpperCase()) {
                    case "NGN": {
                        result = (value * NGN) / TWD;
                        break;
                    }
                    case "USD": {
                        result = (value * USD) / TWD;

                        break;
                    }
                    case "EUR": {
                        result = (value * EUR) / TWD;

                        break;
                    }
                    case "JPY": {
                        result = (value * JPY) / TWD;

                        break;
                    }
                    case "GBP": {
                        result = (value * GBP) / TWD;
                        break;
                    }
                    case "CHF": {
                        result = (value * CHF) / TWD;
                        break;
                    }
                    case "CAD": {
                        result = (value * CAD) / TWD;
                        break;
                    }
                    case "AUD": {
                        result = (value * AUD) / TWD;
                        break;
                    }
                    case "ZAR": {
                        result = (value * ZAR) / TWD;
                        break;
                    }
                    case "CNY": {
                        result = (value * CNY) / TWD;
                        break;
                    }
                    case "INR": {
                        result = (value * INR) / TWD;
                        break;
                    }
                    case "SGD": {
                        result = (value * SGD) / TWD;
                        break;
                    }
                    case "TWD": {
                        result = (value * TWD) / TWD;
                        break;
                    }
                    case "RUB": {
                        result = (value * RUB) / TWD;
                        break;
                    }
                    case "MXN": {
                        result = (value * MXN) / TWD;
                        break;
                    }
                    case "ILS": {
                        result = (value * ILS) / TWD;
                        break;
                    }
                    case "MYR": {
                        result = (value * MYR) / TWD;
                        break;
                    }
                    case "SEK": {
                        result = (value * SEK) / TWD;
                        break;
                    }
                    case "NOK": {
                        result = (value * NOK) / TWD;
                        break;
                    }
                    case "TRY": {
                        result = (value * TRY) / TWD;
                        break;
                    }
                }
                
                break;
            }
            case "RUB": {

                switch (toFormat.toUpperCase()) {
                    case "NGN": {
                        result = (value * NGN) / RUB;
                        break;
                    }
                    case "USD": {
                        result = (value * USD) / RUB;

                        break;
                    }
                    case "EUR": {
                        result = (value * EUR) / RUB;

                        break;
                    }
                    case "JPY": {
                        result = (value * JPY) / RUB;

                        break;
                    }
                    case "GBP": {
                        result = (value * GBP) / RUB;
                        break;
                    }
                    case "CHF": {
                        result = (value * CHF) / RUB;
                        break;
                    }
                    case "CAD": {
                        result = (value * CAD) / RUB;
                        break;
                    }
                    case "AUD": {
                        result = (value * AUD) / RUB;
                        break;
                    }
                    case "ZAR": {
                        result = (value * ZAR) / RUB;
                        break;
                    }
                    case "CNY": {
                        result = (value * CNY) / RUB;
                        break;
                    }
                    case "INR": {
                        result = (value * INR) / RUB;
                        break;
                    }
                    case "SGD": {
                        result = (value * SGD) / RUB;
                        break;
                    }
                    case "TWD": {
                        result = (value * TWD) / RUB;
                        break;
                    }
                    case "RUB": {
                        result = (value * RUB) / RUB;
                        break;
                    }
                    case "MXN": {
                        result = (value * MXN) / RUB;
                        break;
                    }
                    case "ILS": {
                        result = (value * ILS) / RUB;
                        break;
                    }
                    case "MYR": {
                        result = (value * MYR) / RUB;
                        break;
                    }
                    case "SEK": {
                        result = (value * SEK) / RUB;
                        break;
                    }
                    case "NOK": {
                        result = (value * NOK) / RUB;
                        break;
                    }
                    case "TRY": {
                        result = (value * TRY) / RUB;
                        break;
                    }
                }
                
                break;
            }
            case "MXN": {

                switch (toFormat.toUpperCase()) {
                    case "NGN": {
                        result = (value * NGN) / MXN;
                        break;
                    }
                    case "USD": {
                        result = (value * USD) / MXN;

                        break;
                    }
                    case "EUR": {
                        result = (value * EUR) / MXN;

                        break;
                    }
                    case "JPY": {
                        result = (value * JPY) / MXN;

                        break;
                    }
                    case "GBP": {
                        result = (value * GBP) / MXN;
                        break;
                    }
                    case "CHF": {
                        result = (value * CHF) / MXN;
                        break;
                    }
                    case "CAD": {
                        result = (value * CAD) / MXN;
                        break;
                    }
                    case "AUD": {
                        result = (value * AUD) / MXN;
                        break;
                    }
                    case "ZAR": {
                        result = (value * ZAR) / MXN;
                        break;
                    }
                    case "CNY": {
                        result = (value * CNY) / MXN;
                        break;
                    }
                    case "INR": {
                        result = (value * INR) / MXN;
                        break;
                    }
                    case "SGD": {
                        result = (value * SGD) / MXN;
                        break;
                    }
                    case "TWD": {
                        result = (value * TWD) / MXN;
                        break;
                    }
                    case "RUB": {
                        result = (value * RUB) / MXN;
                        break;
                    }
                    case "MXN": {
                        result = (value * MXN) / MXN;
                        break;
                    }
                    case "ILS": {
                        result = (value * ILS) / MXN;
                        break;
                    }
                    case "MYR": {
                        result = (value * MYR) / MXN;
                        break;
                    }
                    case "SEK": {
                        result = (value * SEK) / MXN;
                        break;
                    }
                    case "NOK": {
                        result = (value * NOK) / MXN;
                        break;
                    }
                    case "TRY": {
                        result = (value * TRY) / MXN;
                        break;
                    }
                }
                
                break;
            }
            case "ILS": {

                switch (toFormat.toUpperCase()) {
                    case "NGN": {
                        result = (value * NGN) / ILS;
                        break;
                    }
                    case "USD": {
                        result = (value * USD) / ILS;

                        break;
                    }
                    case "EUR": {
                        result = (value * EUR) / ILS;

                        break;
                    }
                    case "JPY": {
                        result = (value * JPY) / ILS;

                        break;
                    }
                    case "GBP": {
                        result = (value * GBP) / ILS;
                        break;
                    }
                    case "CHF": {
                        result = (value * CHF) / ILS;
                        break;
                    }
                    case "CAD": {
                        result = (value * CAD) / ILS;
                        break;
                    }
                    case "AUD": {
                        result = (value * AUD) / ILS;
                        break;
                    }
                    case "ZAR": {
                        result = (value * ZAR) / ILS;
                        break;
                    }
                    case "CNY": {
                        result = (value * CNY) / ILS;
                        break;
                    }
                    case "INR": {
                        result = (value * INR) / ILS;
                        break;
                    }
                    case "SGD": {
                        result = (value * SGD) / ILS;
                        break;
                    }
                    case "TWD": {
                        result = (value * TWD) / ILS;
                        break;
                    }
                    case "RUB": {
                        result = (value * RUB) / ILS;
                        break;
                    }
                    case "MXN": {
                        result = (value * MXN) / ILS;
                        break;
                    }
                    case "ILS": {
                        result = (value * ILS) / ILS;
                        break;
                    }
                    case "MYR": {
                        result = (value * MYR) / ILS;
                        break;
                    }
                    case "SEK": {
                        result = (value * SEK) / ILS;
                        break;
                    }
                    case "NOK": {
                        result = (value * NOK) / ILS;
                        break;
                    }
                    case "TRY": {
                        result = (value * TRY) / ILS;
                        break;
                    }
                }
                
                break;
            }
            case "MYR": {

                switch (toFormat.toUpperCase()) {
                    case "NGN": {
                        result = (value * NGN) / MYR;
                        break;
                    }
                    case "USD": {
                        result = (value * USD) / MYR;

                        break;
                    }
                    case "EUR": {
                        result = (value * EUR) / MYR;

                        break;
                    }
                    case "JPY": {
                        result = (value * JPY) / MYR;

                        break;
                    }
                    case "GBP": {
                        result = (value * GBP) / MYR;
                        break;
                    }
                    case "CHF": {
                        result = (value * CHF) / MYR;
                        break;
                    }
                    case "CAD": {
                        result = (value * CAD) / MYR;
                        break;
                    }
                    case "AUD": {
                        result = (value * AUD) / MYR;
                        break;
                    }
                    case "ZAR": {
                        result = (value * ZAR) / MYR;
                        break;
                    }
                    case "CNY": {
                        result = (value * CNY) / MYR;
                        break;
                    }
                    case "INR": {
                        result = (value * INR) / MYR;
                        break;
                    }
                    case "SGD": {
                        result = (value * SGD) / MYR;
                        break;
                    }
                    case "TWD": {
                        result = (value * TWD) / MYR;
                        break;
                    }
                    case "RUB": {
                        result = (value * RUB) / MYR;
                        break;
                    }
                    case "MXN": {
                        result = (value * MXN) / MYR;
                        break;
                    }
                    case "ILS": {
                        result = (value * ILS) / MYR;
                        break;
                    }
                    case "MYR": {
                        result = (value * MYR) / MYR;
                        break;
                    }
                    case "SEK": {
                        result = (value * SEK) / MYR;
                        break;
                    }
                    case "NOK": {
                        result = (value * NOK) / MYR;
                        break;
                    }
                    case "TRY": {
                        result = (value * TRY) / MYR;
                        break;
                    }
                }
                
                break;
            }
            case "SEK": {

                switch (toFormat.toUpperCase()) {
                    case "NGN": {
                        result = (value * NGN) / SEK;
                        break;
                    }
                    case "USD": {
                        result = (value * USD) / SEK;

                        break;
                    }
                    case "EUR": {
                        result = (value * EUR) / SEK;

                        break;
                    }
                    case "JPY": {
                        result = (value * JPY) / SEK;

                        break;
                    }
                    case "GBP": {
                        result = (value * GBP) / SEK;
                        break;
                    }
                    case "CHF": {
                        result = (value * CHF) / SEK;
                        break;
                    }
                    case "CAD": {
                        result = (value * CAD) / SEK;
                        break;
                    }
                    case "AUD": {
                        result = (value * AUD) / SEK;
                        break;
                    }
                    case "ZAR": {
                        result = (value * ZAR) / SEK;
                        break;
                    }
                    case "CNY": {
                        result = (value * CNY) / SEK;
                        break;
                    }
                    case "INR": {
                        result = (value * INR) / SEK;
                        break;
                    }
                    case "SGD": {
                        result = (value * SGD) / SEK;
                        break;
                    }
                    case "TWD": {
                        result = (value * TWD) / SEK;
                        break;
                    }
                    case "RUB": {
                        result = (value * RUB) / SEK;
                        break;
                    }
                    case "MXN": {
                        result = (value * MXN) / SEK;
                        break;
                    }
                    case "ILS": {
                        result = (value * ILS) / SEK;
                        break;
                    }
                    case "MYR": {
                        result = (value * MYR) / SEK;
                        break;
                    }
                    case "SEK": {
                        result = (value * SEK) / SEK;
                        break;
                    }
                    case "NOK": {
                        result = (value * NOK) / SEK;
                        break;
                    }
                    case "TRY": {
                        result = (value * TRY) / SEK;
                        break;
                    }
                }
                
                break;
            }
            case "NOK": {

                switch (toFormat.toUpperCase()) {
                    case "NGN": {
                        result = (value * NGN) / NOK;
                        break;
                    }
                    case "USD": {
                        result = (value * USD) / NOK;

                        break;
                    }
                    case "EUR": {
                        result = (value * EUR) / NOK;

                        break;
                    }
                    case "JPY": {
                        result = (value * JPY) / NOK;

                        break;
                    }
                    case "GBP": {
                        result = (value * GBP) / NOK;
                        break;
                    }
                    case "CHF": {
                        result = (value * CHF) / NOK;
                        break;
                    }
                    case "CAD": {
                        result = (value * CAD) / NOK;
                        break;
                    }
                    case "AUD": {
                        result = (value * AUD) / NOK;
                        break;
                    }
                    case "ZAR": {
                        result = (value * ZAR) / NOK;
                        break;
                    }
                    case "CNY": {
                        result = (value * CNY) / NOK;
                        break;
                    }
                    case "INR": {
                        result = (value * INR) / NOK;
                        break;
                    }
                    case "SGD": {
                        result = (value * SGD) / NOK;
                        break;
                    }
                    case "TWD": {
                        result = (value * TWD) / NOK;
                        break;
                    }
                    case "RUB": {
                        result = (value * RUB) / NOK;
                        break;
                    }
                    case "MXN": {
                        result = (value * MXN) / NOK;
                        break;
                    }
                    case "ILS": {
                        result = (value * ILS) / NOK;
                        break;
                    }
                    case "MYR": {
                        result = (value * MYR) / NOK;
                        break;
                    }
                    case "SEK": {
                        result = (value * SEK) / NOK;
                        break;
                    }
                    case "NOK": {
                        result = (value * NOK) / NOK;
                        break;
                    }
                    case "TRY": {
                        result = (value * TRY) / NOK;
                        break;
                    }
                }
                
                break;
            }
            case "TRY": {

                switch (toFormat.toUpperCase()) {
                    case "NGN": {
                        result = (value * NGN) / TRY;
                        break;
                    }
                    case "USD": {
                        result = (value * USD) / TRY;

                        break;
                    }
                    case "EUR": {
                        result = (value * EUR) / TRY;

                        break;
                    }
                    case "JPY": {
                        result = (value * JPY) / TRY;

                        break;
                    }
                    case "GBP": {
                        result = (value * GBP) / TRY;
                        break;
                    }
                    case "CHF": {
                        result = (value * CHF) / TRY;
                        break;
                    }
                    case "CAD": {
                        result = (value * CAD) / TRY;
                        break;
                    }
                    case "AUD": {
                        result = (value * AUD) / TRY;
                        break;
                    }
                    case "ZAR": {
                        result = (value * ZAR) / TRY;
                        break;
                    }
                    case "CNY": {
                        result = (value * CNY) / TRY;
                        break;
                    }
                    case "INR": {
                        result = (value * INR) / TRY;
                        break;
                    }
                    case "SGD": {
                        result = (value * SGD) / TRY;
                        break;
                    }
                    case "TWD": {
                        result = (value * TWD) / TRY;
                        break;
                    }
                    case "RUB": {
                        result = (value * RUB) / TRY;
                        break;
                    }
                    case "MXN": {
                        result = (value * MXN) / TRY;
                        break;
                    }
                    case "ILS": {
                        result = (value * ILS) / TRY;
                        break;
                    }
                    case "MYR": {
                        result = (value * MYR) / TRY;
                        break;
                    }
                    case "SEK": {
                        result = (value * SEK) / TRY;
                        break;
                    }
                    case "NOK": {
                        result = (value * NOK) / TRY;
                        break;
                    }
                    case "TRY": {
                        result = (value * TRY) / TRY;
                        break;
                    }
                }
                
                break;
            }
        }
        return result;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    @Override
    public void onDetach() {
        super.onDetach();

    }
}
