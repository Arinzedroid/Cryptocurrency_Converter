
package com.andela.alcprojectone.Model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CurrencyModel {

    /**
     * No args constructor for use in serialization
     *
     */
    public CurrencyModel() {
    }

    /**
     *
     * @param eTH
     * @param bTC
     */
    public CurrencyModel(BTC bTC, ETH eTH) {
        super();
        this.bTC = bTC;
        this.eTH = eTH;

    }
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


    public static class BTC {

        @SerializedName("NGN")
        @Expose
        private Double nGN;
        @SerializedName("USD")
        @Expose
        private Double uSD;
        @SerializedName("EUR")
        @Expose
        private Double eUR;
        @SerializedName("JPY")
        @Expose
        private Double jPY;
        @SerializedName("GBP")
        @Expose
        private Double gBP;
        @SerializedName("CHF")
        @Expose
        private Double cHF;
        @SerializedName("CAD")
        @Expose
        private Double cAD;
        @SerializedName("AUD")
        @Expose
        private Double aUD;
        @SerializedName("ZAR")
        @Expose
        private Double zAR;
        @SerializedName("CNY")
        @Expose
        private Double cNY;
        @SerializedName("INR")
        @Expose
        private Double iNR;
        @SerializedName("SGD")
        @Expose
        private Double sGD;
        @SerializedName("TWD")
        @Expose
        private Double tWD;
        @SerializedName("RUB")
        @Expose
        private Double rUB;
        @SerializedName("MXN")
        @Expose
        private Double mXN;
        @SerializedName("ILS")
        @Expose
        private Double iLS;
        @SerializedName("MYR")
        @Expose
        private Double mYR;
        @SerializedName("SEK")
        @Expose
        private Double sEK;
        @SerializedName("NOK")
        @Expose
        private Double nOK;
        @SerializedName("TRY")
        @Expose
        private Double tRY;

        /**
         * No args constructor for use in serialization
         *
         */
        public BTC() {
        }

        /**
         *
         * @param uSD
         * @param aUD
         * @param tRY
         * @param tWD
         * @param cHF
         * @param eUR
         * @param iNR
         * @param rUB
         * @param nOK
         * @param mYR
         * @param zAR
         * @param mXN
         * @param sGD
         * @param iLS
         * @param cNY
         * @param sEK
         * @param gBP
         * @param nGN
         * @param jPY
         * @param cAD
         */
        public BTC(Double nGN, Double uSD, Double eUR, Double jPY, Double gBP, Double cHF, Double cAD, Double aUD, Double zAR, Double cNY, Double iNR, Double sGD, Double tWD, Double rUB, Double mXN, Double iLS, Double mYR, Double sEK, Double nOK, Double tRY) {
            super();
            this.nGN = nGN;
            this.uSD = uSD;
            this.eUR = eUR;
            this.jPY = jPY;
            this.gBP = gBP;
            this.cHF = cHF;
            this.cAD = cAD;
            this.aUD = aUD;
            this.zAR = zAR;
            this.cNY = cNY;
            this.iNR = iNR;
            this.sGD = sGD;
            this.tWD = tWD;
            this.rUB = rUB;
            this.mXN = mXN;
            this.iLS = iLS;
            this.mYR = mYR;
            this.sEK = sEK;
            this.nOK = nOK;
            this.tRY = tRY;
        }


        public Double getNGN() {
            return nGN;
        }

        public void setNGN(Double nGN) {
            this.nGN = nGN;
        }

        public Double getUSD() {
            return uSD;
        }

        public void setUSD(Double uSD) {
            this.uSD = uSD;
        }

        public Double getEUR() {
            return eUR;
        }

        public void setEUR(Double eUR) {
            this.eUR = eUR;
        }

        public Double getJPY() {
            return jPY;
        }

        public void setJPY(Double jPY) {
            this.jPY = jPY;
        }

        public Double getGBP() {
            return gBP;
        }

        public void setGBP(Double gBP) {
            this.gBP = gBP;
        }

        public Double getCHF() {
            return cHF;
        }

        public void setCHF(Double cHF) {
            this.cHF = cHF;
        }

        public Double getCAD() {
            return cAD;
        }

        public void setCAD(Double cAD) {
            this.cAD = cAD;
        }

        public Double getAUD() {
            return aUD;
        }

        public void setAUD(Double aUD) {
            this.aUD = aUD;
        }

        public Double getZAR() {
            return zAR;
        }

        public void setZAR(Double zAR) {
            this.zAR = zAR;
        }

        public Double getCNY() {
            return cNY;
        }

        public void setCNY(Double cNY) {
            this.cNY = cNY;
        }

        public Double getINR() {
            return iNR;
        }

        public void setINR(Double iNR) {
            this.iNR = iNR;
        }

        public Double getSGD() {
            return sGD;
        }

        public void setSGD(Double sGD) {
            this.sGD = sGD;
        }

        public Double getTWD() {
            return tWD;
        }

        public void setTWD(Double tWD) {
            this.tWD = tWD;
        }

        public Double getRUB() {
            return rUB;
        }

        public void setRUB(Double rUB) {
            this.rUB = rUB;
        }

        public Double getMXN() {
            return mXN;
        }

        public void setMXN(Double mXN) {
            this.mXN = mXN;
        }

        public Double getILS() {
            return iLS;
        }

        public void setILS(Double iLS) {
            this.iLS = iLS;
        }

        public Double getMYR() {
            return mYR;
        }

        public void setMYR(Double mYR) {
            this.mYR = mYR;
        }

        public Double getSEK() {
            return sEK;
        }

        public void setSEK(Double sEK) {
            this.sEK = sEK;
        }

        public Double getNOK() {
            return nOK;
        }

        public void setNOK(Double nOK) {
            this.nOK = nOK;
        }

        public Double getTRY() {
            return tRY;
        }

        public void setTRY(Double tRY) {
            this.tRY = tRY;
        }

    }


    public static class ETH {

        /**
         * No args constructor for use in serialization
         *
         */
        public ETH() {
        }

        /**
         *
         * @param uSD
         * @param aUD
         * @param tRY
         * @param tWD
         * @param cHF
         * @param eUR
         * @param iNR
         * @param rUB
         * @param nOK
         * @param mYR
         * @param zAR
         * @param mXN
         * @param sGD
         * @param iLS
         * @param cNY
         * @param sEK
         * @param gBP
         * @param nGN
         * @param jPY
         * @param cAD
         */
        public ETH(Double nGN, Double uSD, Double eUR, Double jPY, Double gBP, Double cHF, Double cAD, Double aUD, Double zAR, Double cNY, Double iNR, Double sGD, Double tWD, Double rUB, Double mXN, Double iLS, Double mYR, Double sEK, Double nOK, Double tRY) {
            super();
            this.nGN = nGN;
            this.uSD = uSD;
            this.eUR = eUR;
            this.jPY = jPY;
            this.gBP = gBP;
            this.cHF = cHF;
            this.cAD = cAD;
            this.aUD = aUD;
            this.zAR = zAR;
            this.cNY = cNY;
            this.iNR = iNR;
            this.sGD = sGD;
            this.tWD = tWD;
            this.rUB = rUB;
            this.mXN = mXN;
            this.iLS = iLS;
            this.mYR = mYR;
            this.sEK = sEK;
            this.nOK = nOK;
            this.tRY = tRY;
        }

        @SerializedName("NGN")
        @Expose
        private Double nGN;
        @SerializedName("USD")
        @Expose
        private Double uSD;
        @SerializedName("EUR")
        @Expose
        private Double eUR;
        @SerializedName("JPY")
        @Expose
        private Double jPY;
        @SerializedName("GBP")
        @Expose
        private Double gBP;
        @SerializedName("CHF")
        @Expose
        private Double cHF;
        @SerializedName("CAD")
        @Expose
        private Double cAD;
        @SerializedName("AUD")
        @Expose
        private Double aUD;
        @SerializedName("ZAR")
        @Expose
        private Double zAR;
        @SerializedName("CNY")
        @Expose
        private Double cNY;
        @SerializedName("INR")
        @Expose
        private Double iNR;
        @SerializedName("SGD")
        @Expose
        private Double sGD;
        @SerializedName("TWD")
        @Expose
        private Double tWD;
        @SerializedName("RUB")
        @Expose
        private Double rUB;
        @SerializedName("MXN")
        @Expose
        private Double mXN;
        @SerializedName("ILS")
        @Expose
        private Double iLS;
        @SerializedName("MYR")
        @Expose
        private Double mYR;
        @SerializedName("SEK")
        @Expose
        private Double sEK;
        @SerializedName("NOK")
        @Expose
        private Double nOK;
        @SerializedName("TRY")
        @Expose
        private Double tRY;

        public Double getNGN() {
            return nGN;
        }

        public void setNGN(Double nGN) {
            this.nGN = nGN;
        }

        public Double getUSD() {
            return uSD;
        }

        public void setUSD(Double uSD) {
            this.uSD = uSD;
        }

        public Double getEUR() {
            return eUR;
        }

        public void setEUR(Double eUR) {
            this.eUR = eUR;
        }

        public Double getJPY() {
            return jPY;
        }

        public void setJPY(Double jPY) {
            this.jPY = jPY;
        }

        public Double getGBP() {
            return gBP;
        }

        public void setGBP(Double gBP) {
            this.gBP = gBP;
        }

        public Double getCHF() {
            return cHF;
        }

        public void setCHF(Double cHF) {
            this.cHF = cHF;
        }

        public Double getCAD() {
            return cAD;
        }

        public void setCAD(Double cAD) {
            this.cAD = cAD;
        }

        public Double getAUD() {
            return aUD;
        }

        public void setAUD(Double aUD) {
            this.aUD = aUD;
        }

        public Double getZAR() {
            return zAR;
        }

        public void setZAR(Double zAR) {
            this.zAR = zAR;
        }

        public Double getCNY() {
            return cNY;
        }

        public void setCNY(Double cNY) {
            this.cNY = cNY;
        }

        public Double getINR() {
            return iNR;
        }

        public void setINR(Double iNR) {
            this.iNR = iNR;
        }

        public Double getSGD() {
            return sGD;
        }

        public void setSGD(Double sGD) {
            this.sGD = sGD;
        }

        public Double getTWD() {
            return tWD;
        }

        public void setTWD(Double tWD) {
            this.tWD = tWD;
        }

        public Double getRUB() {
            return rUB;
        }

        public void setRUB(Double rUB) {
            this.rUB = rUB;
        }

        public Double getMXN() {
            return mXN;
        }

        public void setMXN(Double mXN) {
            this.mXN = mXN;
        }

        public Double getILS() {
            return iLS;
        }

        public void setILS(Double iLS) {
            this.iLS = iLS;
        }

        public Double getMYR() {
            return mYR;
        }

        public void setMYR(Double mYR) {
            this.mYR = mYR;
        }

        public Double getSEK() {
            return sEK;
        }

        public void setSEK(Double sEK) {
            this.sEK = sEK;
        }

        public Double getNOK() {
            return nOK;
        }

        public void setNOK(Double nOK) {
            this.nOK = nOK;
        }

        public Double getTRY() {
            return tRY;
        }

        public void setTRY(Double tRY) {
            this.tRY = tRY;
        }

    }


}



