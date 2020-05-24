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
public class CreditCards
{
    private String creditCardLast4;

    private String primary;

    private String creditCardExpirationDate;

    private String creditCardType;

    public CreditCards() {
    }

    public CreditCards(String creditCardLast4, String primary, String creditCardExpirationDate, String creditCardType) {
        this.creditCardLast4 = creditCardLast4;
        this.primary = primary;
        this.creditCardExpirationDate = creditCardExpirationDate;
        this.creditCardType = creditCardType;
    }
    
    
    
    

    public String getCreditCardLast4 ()
    {
        return creditCardLast4;
    }

    public void setCreditCardLast4 (String creditCardLast4)
    {
        this.creditCardLast4 = creditCardLast4;
    }

    public String getPrimary ()
    {
        return primary;
    }

    public void setPrimary (String primary)
    {
        this.primary = primary;
    }

    public String getCreditCardExpirationDate ()
    {
        return creditCardExpirationDate;
    }

    public void setCreditCardExpirationDate (String creditCardExpirationDate)
    {
        this.creditCardExpirationDate = creditCardExpirationDate;
    }

    public String getCreditCardType ()
    {
        return creditCardType;
    }

    public void setCreditCardType (String creditCardType)
    {
        this.creditCardType = creditCardType;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [creditCardLast4 = "+creditCardLast4+", primary = "+primary+", creditCardExpirationDate = "+creditCardExpirationDate+", creditCardType = "+creditCardType+"]";
    }
}