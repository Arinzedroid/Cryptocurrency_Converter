
package com.andela.alcprojectone.Model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CurrencyModel {

    @SerializedName("BTC")
    @Expose
    private BTC bTC;
    @SerializedName("ETH")
    @Expose
    private ETH eTH;

    public BTC getBTC() {
        return bTC;
    }

    public void setBTC(BTC bTC) {
        this.bTC = bTC;
    }

    public ETH getETH() {
        return eTH;
    }

    public void setETH(ETH eTH) {
        this.eTH = eTH;
    }

}
