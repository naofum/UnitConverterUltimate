package com.physphil.android.unitconverterultimate.api.models;

import com.google.gson.annotations.SerializedName;

/**
 * Fixer.io API response with Latest currency conversion info
 * Created by Phizz on 16-03-25.
 */
public class Latest
{
    private String base;
    private String date;
    private Rates rates;

    public String getBase()
    {
        return base;
    }

    public String getDate()
    {
        return date;
    }

    public Rates getRates()
    {
        return rates;
    }
}
