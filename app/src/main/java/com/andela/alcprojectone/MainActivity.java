package com.andela.alcprojectone;

import android.arch.lifecycle.ViewModelProviders;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.View;
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

    public CurrencyViewModel currencyViewModel;

    private String fyms = "BTC,ETH";
    private String tsyms = "NGN,USD,EUR,JPY,GBP,CHF,CAD,AUD,ZAR,CNY,INR,SGD,TWD,RUB,MXN,ILS,MYR,SEK,CHF,NOK,TRY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        currencyViewModel = ViewModelProviders.of(this).get(CurrencyViewModel.class);
        currencyViewModel.getConversion(fyms,tsyms).observe(this, Currency -> {

            RateBTC.setText(String.valueOf("1BTC = " + Currency.getBTC().getUSD()));
            RateETH.setText(String.valueOf("1ETH = " + Currency.getETH().getUSD()));
            BTCConversion.setText(String.valueOf(Currency.getBTC().getUSD()));
            ETHConversion.setText(String.valueOf(Currency.getETH().getUSD()));


            //Update UI
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
