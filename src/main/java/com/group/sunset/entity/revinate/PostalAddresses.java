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
public class PostalAddresses
{
    private String primary;
    private String zipCode;
    private String country;
    private String state;
    private String address1;
    private String address2;
    private String city;

    public PostalAddresses() {
    }

    public PostalAddresses(String primary, String zipCode, String country, String state, String address1, String address2, String city) {
        this.primary = primary;
        this.zipCode = zipCode;
        this.country = country;
        this.state = state;
        this.address1 = address1;
        this.address2 = address2;
        this.city = city;
    }
    

    public String getPrimary ()
    {
        return primary;
    }

    public void setPrimary (String primary)
    {
        this.primary = primary;
    }

    public String getZipCode ()
    {
        return zipCode;
    }

    public void setZipCode (String zipCode)
    {
        this.zipCode = zipCode;
    }

    public String getCountry ()
    {
        return country;
    }

    public void setCountry (String country)
    {
        this.country = country;
    }

    public String getState ()
    {
        return state;
    }

    public void setState (String state)
    {
        this.state = state;
    }

    public String getAddress1 ()
    {
        return address1;
    }

    public void setAddress1 (String address1)
    {
        this.address1 = address1;
    }

    public String getAddress2 ()
    {
        return address2;
    }

    public void setAddress2 (String address2)
    {
        this.address2 = address2;
    }

    public String getCity ()
    {
        return city;
    }

    public void setCity (String city)
    {
        this.city = city;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [primary = "+primary+", zipCode = "+zipCode+", country = "+country+", state = "+state+", address1 = "+address1+", address2 = "+address2+", city = "+city+"]";
    }
}