/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.group.sunset.entity.revinate;

/**
 *
 * @author jdelgado
 */
public class Memberships
{
    private String loyaltyNumber;

    private String programCode;    
    

    public Memberships() {
    }



    public String getProgramCode() {
        return programCode;
    }

    public void setProgramCode(String programCode) {
        this.programCode = programCode;
    }
    
    
    

    public String getLoyaltyNumber ()
    {
        return loyaltyNumber;
    }

    public void setLoyaltyNumber (String loyaltyNumber)
    {
        this.loyaltyNumber = loyaltyNumber;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [loyaltyNumber = "+loyaltyNumber+"]";
    }
}