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
public class Rates
{
    
    private String startTime;
    private String timeUnitType;    
    private Amount amount ;

    public Rates() {
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getTimeUnitType() {
        return timeUnitType;
    }

    public void setTimeUnitType(String timeUnitType) {
        this.timeUnitType = timeUnitType;
    }


    
    
    

    public Amount getAmount ()
    {
        return amount;
    }

    public void setAmount (Amount amount)
    {
        this.amount = amount;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [amount = "+amount+"]";
    }
}