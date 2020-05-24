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
public class PhoneNumbers
{
    private String phoneNumberType;

    private String phoneNumber;

    private String primary;

    public PhoneNumbers() {
    }

    public PhoneNumbers(String phoneNumberType, String phoneNumber, String primary) {
        this.phoneNumberType = phoneNumberType;
        this.phoneNumber = phoneNumber;
        this.primary = primary;
    }
    
    
    
    

    public String getPhoneNumberType ()
    {
        return phoneNumberType;
    }

    public void setPhoneNumberType (String phoneNumberType)
    {
        this.phoneNumberType = phoneNumberType;
    }

    public String getPhoneNumber ()
    {
        return phoneNumber;
    }

    public void setPhoneNumber (String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public String getPrimary ()
    {
        return primary;
    }

    public void setPrimary (String primary)
    {
        this.primary = primary;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [phoneNumberType = "+phoneNumberType+", phoneNumber = "+phoneNumber+", primary = "+primary+"]";
    }
}
