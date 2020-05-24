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
public class Amount
{
    
    private String value;
    private String currency;

    public Amount() {
    }

    public Amount(String value, String currency) {
        this.value = value;
        this.currency = currency;
    }
    
    
    
    

    public String getValue ()
    {
        return value;
    }

    public void setValue (String value)
    {
        this.value = value;
    }

    public String getCurrency ()
    {
        return currency;
    }

    public void setCurrency (String currency)
    {
        this.currency = currency;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [value = "+value+", currency = "+currency+"]";
    }
}
		