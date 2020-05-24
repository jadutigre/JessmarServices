/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.group.sunset.entity.revinate.revinateall;

/**
 *
 * @author jdelgado
 */
public class RatePlans
{
    
    private Rates[] rates;
    private String rateCode;

    public RatePlans() {
    }

    public RatePlans(Rates[] rates, String rateCode) {
        this.rates = rates;
        this.rateCode = rateCode;
    }


    

    public Rates[] getRates ()
    {
        return rates;
    }

    public void setRates (Rates[] rates)
    {
        this.rates = rates;
    }

    public String getRateCode ()
    {
        return rateCode;
    }

    public void setRateCode (String rateCode)
    {
        this.rateCode = rateCode;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [rates = "+rates+", rateCode = "+rateCode+"]";
    }
}