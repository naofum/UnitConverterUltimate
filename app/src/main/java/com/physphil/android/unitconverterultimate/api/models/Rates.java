package com.physphil.android.unitconverterultimate.api.models;

import com.google.gson.annotations.SerializedName;

/**
 * List of conversion rates from Fixer.io API
 * Created by Phizz on 16-03-25.
 */
public class Rates
{
    @SerializedName("AUD") private float aud;
    @SerializedName("BGN") private float bgn;
    @SerializedName("BRL") private float brl;
    @SerializedName("CAD") private float cad;

    public float getAud()
    {
        return aud;
    }

    public float getBgn()
    {
        return bgn;
    }

    public float getBrl()
    {
        return brl;
    }

    public float getCad()
    {
        return cad;
    }
}
