package com.andela.alcprojectone;

import android.arch.lifecycle.ViewModelProviders;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

import com.andela.alcprojectone.ViewModel.CurrencyViewModel;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Optional;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.remove_btc)
    TextView RemoveBTC;
    @BindView(R.id.remove_eth)
    TextView RemoveETH;
    @BindView(R.id.btc_card)
    CardView CardBTC;
    @BindView(R.id.etc_card)
    CardView CardEth;
    @BindView(R.id.eth_conversion)
    TextView ETHConversion;
    @BindView(R.id.btc_conversion)
    TextView BTCConversion;
    @BindView(R.id.rate_btc)
    TextView RateBTC;
    @BindView(R.id.rate_eth)
    TextView RateETH;
    @BindView(R.id.spinner_btc)
    Spinner SpinnerBTC;
    @BindView(R.id.spinner_eth)
    Spinner SpinnerETH;

    public CurrencyViewModel currencyViewModel;

    private String fyms = "BTC,ETH";
    private String tsyms = "NGN,USD,EUR,JPY,GBP,CHF,CAD,AUD,ZAR,CNY,INR,SGD,TWD,RUB,MXN,ILS,MYR,SEK,NOK,TRY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        currencyViewModel = ViewModelProviders.of(this).get(CurrencyViewModel.class);
        currencyViewModel.getConversion(fyms,tsyms).observe(this, Currency -> {

            RateBTC.setText(String.valueOf("1BTC = " + Currency.getBTC().getUSD() + "USD"));
            RateETH.setText(String.valueOf("1ETH = " + Currency.getETH().getUSD() + "USD"));
            BTCConversion.setText(String.valueOf(Currency.getBTC().getUSD()));
            ETHConversion.setText(String.valueOf(Currency.getETH().getUSD()));

            SpinnerBTC.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    String Item = adapterView.getItemAtPosition(i).toString();
                    switch (Item.toUpperCase()){
                        case "NGN":{
                            BTCConversion.setText(String.valueOf(Currency.getBTC().getNGN())); break;
                        }
                        case "USD": {
                            BTCConversion.setText(String.valueOf(Currency.getBTC().getUSD()));break;
                        }
                        case "EUR":{
                            BTCConversion.setText(String.valueOf(Currency.getBTC().getEUR()));break;
                        }
                        case "JPY":{
                            BTCConversion.setText(String.valueOf(Currency.getBTC().getJPY())); break;
                        }
                        case "GBP": {
                            BTCConversion.setText(String.valueOf(Currency.getBTC().getGBP()));break;
                        }
                        case "CHF":{
                            BTCConversion.setText(String.valueOf(Currency.getBTC().getCHF()));break;
                        }
                        case "CAD":{
                            BTCConversion.setText(String.valueOf(Currency.getBTC().getCAD())); break;
                        }
                        case "AUD": {
                            BTCConversion.setText(String.valueOf(Currency.getBTC().getAUD()));break;
                        }
                        case "ZAR":{
                            BTCConversion.setText(String.valueOf(Currency.getBTC().getZAR()));break;
                        }
                        case "CNY":{
                            BTCConversion.setText(String.valueOf(Currency.getBTC().getCNY())); break;
                        }
                        case "INR": {
                            BTCConversion.setText(String.valueOf(Currency.getBTC().getINR()));break;
                        }
                        case "SGD":{
                            BTCConversion.setText(String.valueOf(Currency.getBTC().getSGD()));break;
                        }
                        case "TWD":{
                            BTCConversion.setText(String.valueOf(Currency.getBTC().getTWD())); break;
                        }
                        case "RUB": {
                            BTCConversion.setText(String.valueOf(Currency.getBTC().getRUB()));break;
                        }
                        case "MXN":{
                            BTCConversion.setText(String.valueOf(Currency.getBTC().getMXN()));break;
                        }
                        case "ILS":{
                            BTCConversion.setText(String.valueOf(Currency.getBTC().getILS())); break;
                        }
                        case "MYR": {
                            BTCConversion.setText(String.valueOf(Currency.getBTC().getMYR()));break;
                        }
                        case "SEK":{
                            BTCConversion.setText(String.valueOf(Currency.getBTC().getSEK())); break;
                        }
                        case "NOK": {
                            BTCConversion.setText(String.valueOf(Currency.getBTC().getNOK()));break;
                        }
                        case "TRY":{
                            BTCConversion.setText(String.valueOf(Currency.getBTC().getTRY()));break;
                        }
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {

                }
            });

            SpinnerETH.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    String Item = adapterView.getItemAtPosition(i).toString();
                    switch (Item.toUpperCase()){
                        case "NGN":{
                            ETHConversion.setText(String.valueOf(Currency.getETH().getNGN())); break;
                        }
                        case "USD": {
                            ETHConversion.setText(String.valueOf(Currency.getETH().getUSD()));break;
                        }
                        case "EUR":{
                            ETHConversion.setText(String.valueOf(Currency.getETH().getEUR()));break;
                        }
                        case "JPY":{
                            ETHConversion.setText(String.valueOf(Currency.getETH().getJPY())); break;
                        }
                        case "GBP": {
                            ETHConversion.setText(String.valueOf(Currency.getETH().getGBP()));break;
                        }
                        case "CHF":{
                            ETHConversion.setText(String.valueOf(Currency.getETH().getCHF()));break;
                        }
                        case "CAD":{
                            ETHConversion.setText(String.valueOf(Currency.getETH().getCAD())); break;
                        }
                        case "AUD": {
                            ETHConversion.setText(String.valueOf(Currency.getETH().getAUD()));break;
                        }
                        case "ZAR":{
                            ETHConversion.setText(String.valueOf(Currency.getETH().getZAR()));break;
                        }
                        case "CNY":{
                            ETHConversion.setText(String.valueOf(Currency.getETH().getCNY())); break;
                        }
                        case "INR": {
                            ETHConversion.setText(String.valueOf(Currency.getETH().getINR()));break;
                        }
                        case "SGD":{
                            ETHConversion.setText(String.valueOf(Currency.getETH().getSGD()));break;
                        }
                        case "TWD":{
                            ETHConversion.setText(String.valueOf(Currency.getETH().getTWD())); break;
                        }
                        case "RUB": {
                            ETHConversion.setText(String.valueOf(Currency.getETH().getRUB()));break;
                        }
                        case "MXN":{
                            ETHConversion.setText(String.valueOf(Currency.getETH().getMXN()));break;
                        }
                        case "ILS":{
                            ETHConversion.setText(String.valueOf(Currency.getETH().getILS())); break;
                        }
                        case "MYR": {
                            ETHConversion.setText(String.valueOf(Currency.getETH().getMYR()));break;
                        }
                        case "SEK":{
                            ETHConversion.setText(String.valueOf(Currency.getETH().getSEK())); break;
                        }
                        case "NOK": {
                            ETHConversion.setText(String.valueOf(Currency.getETH().getNOK()));break;
                        }
                        case "TRY":{
                            ETHConversion.setText(String.valueOf(Currency.getETH().getTRY()));break;
                        }
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {

                }
            });


        });

        ButterKnife.bind(this);
    }

    @Optional
    @OnClick({R.id.remove_btc, R.id.remove_eth})
    public void toggle(View v){
        if(v.getId() == R.id.remove_btc ){
            if(CardBTC.getVisibility() == View.VISIBLE){
                if(!RemoveBTC.getText().toString().equalsIgnoreCase("Add ETH")){
                    CardBTC.setVisibility(View.GONE);
                    RemoveBTC.setVisibility(View.GONE);
                    RemoveETH.setText("Add BTC");
                }
                else{
                    if(CardEth.getVisibility() == View.GONE){
                        CardEth.setVisibility(View.VISIBLE);
                        RemoveETH.setVisibility(View.VISIBLE);
                        RemoveBTC.setText("Remove BTC");
                    }
                }

            }
        }
       else if(v.getId() == R.id.remove_eth){
            if(CardEth.getVisibility() == View.VISIBLE){
                if(!RemoveETH.getText().toString().equalsIgnoreCase("Add BTC")){
                    CardEth.setVisibility(View.GONE);
                    RemoveETH.setVisibility(View.GONE);
                    RemoveBTC.setText("Add ETH");
                }
                else{
                    if(CardBTC.getVisibility() == View.GONE){
                        CardBTC.setVisibility(View.VISIBLE);
                        RemoveBTC.setVisibility(View.VISIBLE);
                        RemoveETH.setText("Remove ETH");
                    }
                }

            }
        }
    }
}
