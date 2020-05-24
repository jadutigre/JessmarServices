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
public class Memberships
{
    private String expireDate;

    private String loyaltyNumber;

    private String levelCode;

    private String programCode;

    public Memberships() {
    }

    public Memberships(String expireDate, String loyaltyNumber, String levelCode, String programCode) {
        this.expireDate = expireDate;
        this.loyaltyNumber = loyaltyNumber;
        this.levelCode = levelCode;
        this.programCode = programCode;
    }
    
    
    
    
    

    public String getExpireDate ()
    {
        return expireDate;
    }

    public void setExpireDate (String expireDate)
    {
        this.expireDate = expireDate;
    }

    public String getLoyaltyNumber ()
    {
        return loyaltyNumber;
    }

    public void setLoyaltyNumber (String loyaltyNumber)
    {
        this.loyaltyNumber = loyaltyNumber;
    }

    public String getLevelCode ()
    {
        return levelCode;
    }

    public void setLevelCode (String levelCode)
    {
        this.levelCode = levelCode;
    }

    public String getProgramCode ()
    {
        return programCode;
    }

    public void setProgramCode (String programCode)
    {
        this.programCode = programCode;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [expireDate = "+expireDate+", loyaltyNumber = "+loyaltyNumber+", levelCode = "+levelCode+", programCode = "+programCode+"]";
    }
}
