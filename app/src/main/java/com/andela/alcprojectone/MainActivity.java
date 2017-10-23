package com.andela.alcprojectone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
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

    public CurrencyViewModel currencyViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        currencyViewModel.getCurrency().observe(this,Currency ->{

            //Update UI
        });
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
