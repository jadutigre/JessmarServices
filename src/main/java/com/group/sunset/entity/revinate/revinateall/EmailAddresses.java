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
public class EmailAddresses
{
    
    private String primary;
    private String emailAddress;

    public EmailAddresses() {
    }

    public EmailAddresses(String primary, String emailAddress) {
        this.primary = primary;
        this.emailAddress = emailAddress;
    }
    
  
    
    
    

    public String getPrimary ()
    {
        return primary;
    }

    public void setPrimary (String primary)
    {
        this.primary = primary;
    }

    public String getEmailAddress ()
    {
        return emailAddress;
    }

    public void setEmailAddress (String emailAddress)
    {
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [primary = "+primary+", emailAddress = "+emailAddress+"]";
    }
}