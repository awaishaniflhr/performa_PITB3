package com.example.performa_pitb;

public class CommoditiesModel {
    String Sr;
    String Commodities;
    String Avail;
    String NA;
    String NotifiedRetailPrice;
    String SpotPrice;

    public CommoditiesModel(String sr, String commodities, String avail, String NA, String notifiedRetailPrice, String spotPrice) {
        Sr = sr;
        Commodities = commodities;
        Avail = avail;
        this.NA = NA;
        NotifiedRetailPrice = notifiedRetailPrice;
        SpotPrice = spotPrice;
    }

    public String getSr() {
        return Sr;
    }

    public String getCommodities() {
        return Commodities;
    }

    public String getAvail() {
        return Avail;
    }

    public String getNA() {
        return NA;
    }

    public String getNotifiedRetailPrice() {
        return NotifiedRetailPrice;
    }

    public String getSpotPrice() {
        return SpotPrice;
    }
}
