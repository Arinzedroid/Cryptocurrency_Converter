package com.andela.alcprojectone;



import android.arch.lifecycle.ViewModelProviders;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
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

    Double NGN, USD, EUR, JPY, GBP, CHF, CAD, AUD, ZAR, CNY, INR, SGD, TWD, RUB, MXN, ILS, MYR, SEK, NOK, TRY;
    Double NGN_, USD_, EUR_, JPY_, GBP_, CHF_, CAD_, AUD_, ZAR_, CNY_, INR_, SGD_, TWD_, RUB_, MXN_, ILS_, MYR_, SEK_, NOK_, TRY_;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        currencyViewModel = ViewModelProviders.of(this).get(CurrencyViewModel.class);
        currencyViewModel.getConversion(fyms, tsyms).observe(this, Currency -> {

            USD = Currency.getBTC().getUSD();
            NGN = Currency.getBTC().getNGN();
            EUR = Currency.getBTC().getEUR();
            GBP = Currency.getBTC().getGBP();
            JPY = Currency.getBTC().getJPY();
            CHF = Currency.getBTC().getCHF();
            CAD = Currency.getBTC().getCAD();
            AUD = Currency.getBTC().getAUD();
            ZAR = Currency.getBTC().getZAR();
            CNY = Currency.getBTC().getCNY();
            INR = Currency.getBTC().getINR();
            SGD = Currency.getBTC().getSGD();
            TWD = Currency.getBTC().getTWD();
            RUB = Currency.getBTC().getRUB();
            MXN = Currency.getBTC().getMXN();
            ILS = Currency.getBTC().getILS();
            MYR = Currency.getBTC().getMYR();
            SEK = Currency.getBTC().getSEK();
            NOK = Currency.getBTC().getNOK();
            TRY = Currency.getBTC().getTRY();

            USD_ = Currency.getETH().getUSD();
            NGN_ = Currency.getETH().getNGN();
            EUR_ = Currency.getETH().getEUR();
            GBP_ = Currency.getETH().getGBP();
            JPY_ = Currency.getETH().getJPY();
            CHF_ = Currency.getETH().getCHF();
            CAD_ = Currency.getETH().getCAD();
            AUD_ = Currency.getETH().getAUD();
            ZAR_ = Currency.getETH().getZAR();
            CNY_ = Currency.getETH().getCNY();
            INR_ = Currency.getETH().getINR();
            SGD_ = Currency.getETH().getSGD();
            TWD_ = Currency.getETH().getTWD();
            RUB_ = Currency.getETH().getRUB();
            MXN_ = Currency.getETH().getMXN();
            ILS_ = Currency.getETH().getILS();
            MYR_ = Currency.getETH().getMYR();
            SEK_ = Currency.getETH().getSEK();
            NOK_ = Currency.getETH().getNOK();
            TRY_ = Currency.getETH().getTRY();

            RateBTC.setText(String.valueOf("1BTC = " + USD + "USD"));
            RateETH.setText(String.valueOf("1ETH = " + USD_ + "USD"));
            BTCConversion.setText(String.valueOf(USD));
            ETHConversion.setText(String.valueOf(USD_));

            SpinnerBTC.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    String Item = adapterView.getItemAtPosition(i).toString();
                    switch (Item.toUpperCase()) {
                        case "NGN": {
                            BTCConversion.setText(String.valueOf(NGN));
                            break;
                        }
                        case "USD": {
                            BTCConversion.setText(String.valueOf(USD));
                            break;
                        }
                        case "EUR": {
                            BTCConversion.setText(String.valueOf(EUR));
                            break;
                        }
                        case "JPY": {
                            BTCConversion.setText(String.valueOf(JPY));
                            break;
                        }
                        case "GBP": {
                            BTCConversion.setText(String.valueOf(GBP));
                            break;
                        }
                        case "CHF": {
                            BTCConversion.setText(String.valueOf(CHF));
                            break;
                        }
                        case "CAD": {
                            BTCConversion.setText(String.valueOf(CAD));
                            break;
                        }
                        case "AUD": {
                            BTCConversion.setText(String.valueOf(AUD));
                            break;
                        }
                        case "ZAR": {
                            BTCConversion.setText(String.valueOf(ZAR));
                            break;
                        }
                        case "CNY": {
                            BTCConversion.setText(String.valueOf(CNY));
                            break;
                        }
                        case "INR": {
                            BTCConversion.setText(String.valueOf(INR));
                            break;
                        }
                        case "SGD": {
                            BTCConversion.setText(String.valueOf(SGD));
                            break;
                        }
                        case "TWD": {
                            BTCConversion.setText(String.valueOf(TWD));
                            break;
                        }
                        case "RUB": {
                            BTCConversion.setText(String.valueOf(RUB));
                            break;
                        }
                        case "MXN": {
                            BTCConversion.setText(String.valueOf(MXN));
                            break;
                        }
                        case "ILS": {
                            BTCConversion.setText(String.valueOf(ILS));
                            break;
                        }
                        case "MYR": {
                            BTCConversion.setText(String.valueOf(MYR));
                            break;
                        }
                        case "SEK": {
                            BTCConversion.setText(String.valueOf(SEK));
                            break;
                        }
                        case "NOK": {
                            BTCConversion.setText(String.valueOf(NOK));
                            break;
                        }
                        case "TRY": {
                            BTCConversion.setText(String.valueOf(TRY));
                            break;
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
                    switch (Item.toUpperCase()) {
                        case "NGN": {
                            ETHConversion.setText(String.valueOf(NGN_));
                            break;
                        }
                        case "USD": {
                            ETHConversion.setText(String.valueOf(USD_));
                            break;
                        }
                        case "EUR": {
                            ETHConversion.setText(String.valueOf(EUR_));
                            break;
                        }
                        case "JPY": {
                            ETHConversion.setText(String.valueOf(JPY_));
                            break;
                        }
                        case "GBP": {
                            ETHConversion.setText(String.valueOf(GBP_));
                            break;
                        }
                        case "CHF": {
                            ETHConversion.setText(String.valueOf(CHF_));
                            break;
                        }
                        case "CAD": {
                            ETHConversion.setText(String.valueOf(CAD_));
                            break;
                        }
                        case "AUD": {
                            ETHConversion.setText(String.valueOf(AUD_));
                            break;
                        }
                        case "ZAR": {
                            ETHConversion.setText(String.valueOf(ZAR_));
                            break;
                        }
                        case "CNY": {
                            ETHConversion.setText(String.valueOf(CNY_));
                            break;
                        }
                        case "INR": {
                            ETHConversion.setText(String.valueOf(INR_));
                            break;
                        }
                        case "SGD": {
                            ETHConversion.setText(String.valueOf(SGD_));
                            break;
                        }
                        case "TWD": {
                            ETHConversion.setText(String.valueOf(TWD_));
                            break;
                        }
                        case "RUB": {
                            ETHConversion.setText(String.valueOf(RUB_));
                            break;
                        }
                        case "MXN": {
                            ETHConversion.setText(String.valueOf(MXN_));
                            break;
                        }
                        case "ILS": {
                            ETHConversion.setText(String.valueOf(ILS_));
                            break;
                        }
                        case "MYR": {
                            ETHConversion.setText(String.valueOf(MYR_));
                            break;
                        }
                        case "SEK": {
                            ETHConversion.setText(String.valueOf(SEK_));
                            break;
                        }
                        case "NOK": {
                            ETHConversion.setText(String.valueOf(NOK_));
                            break;
                        }
                        case "TRY": {
                            ETHConversion.setText(String.valueOf(TRY_));
                            break;
                        }
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {

                }
            });


        });
    }

    @OnClick({R.id.etc_card, R.id.btc_card})
    public void ShowFragment(View v) {
        if (v.getId() == R.id.btc_card) {
            FragmentManager fm = getSupportFragmentManager();
            ConversionFragment frag = ConversionFragment.newInstance();
            frag.show(fm, "tag");
        } else if (v.getId() == R.id.etc_card) {
            FragmentManager fm = getSupportFragmentManager();
            ConversionFragment frag = ConversionFragment.newInstance();

            frag.show(fm, "tag");
        }
    }

    @Optional
    @OnClick({R.id.remove_btc, R.id.remove_eth})
    public void toggle(View v) {
        if (v.getId() == R.id.remove_btc) {
            if (CardBTC.getVisibility() == View.VISIBLE) {
                if (!RemoveBTC.getText().toString().equalsIgnoreCase("Add ETH")) {
                    CardBTC.setVisibility(View.GONE);
                    RemoveBTC.setVisibility(View.GONE);
                    RemoveETH.setText("Add BTC");
                } else {
                    if (CardEth.getVisibility() == View.GONE) {
                        CardEth.setVisibility(View.VISIBLE);
                        RemoveETH.setVisibility(View.VISIBLE);
                        RemoveBTC.setText("Remove BTC");
                    }
                }

            }
        } else if (v.getId() == R.id.remove_eth) {
            if (CardEth.getVisibility() == View.VISIBLE) {
                if (!RemoveETH.getText().toString().equalsIgnoreCase("Add BTC")) {
                    CardEth.setVisibility(View.GONE);
                    RemoveETH.setVisibility(View.GONE);
                    RemoveBTC.setText("Add ETH");
                } else {
                    if (CardBTC.getVisibility() == View.GONE) {
                        CardBTC.setVisibility(View.VISIBLE);
                        RemoveBTC.setVisibility(View.VISIBLE);
                        RemoveETH.setText("Remove ETH");
                    }
                }

            }
        }
    }
}