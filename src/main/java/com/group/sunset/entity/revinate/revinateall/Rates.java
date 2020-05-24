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
public class Rates
{
    private String startTime;
    private Amount amount;
    private String timeUnitType;
    private String timeUnits;

    public Rates() {
    }

    public Rates(String startTime, Amount amount, String timeUnitType, String timeUnits) {
        this.startTime = startTime;
        this.amount = amount;
        this.timeUnitType = timeUnitType;
        this.timeUnits = timeUnits;
    }

    
    
    
    
    
    public String getStartTime ()
    {
        return startTime;
    }

    public void setStartTime (String startTime)
    {
        this.startTime = startTime;
    }

    public Amount getAmount ()
    {
        return amount;
    }

    public void setAmount (Amount amount)
    {
        this.amount = amount;
    }

    public String getTimeUnitType ()
    {
        return timeUnitType;
    }

    public void setTimeUnitType (String timeUnitType)
    {
        this.timeUnitType = timeUnitType;
    }

    public String getTimeUnits ()
    {
        return timeUnits;
    }

    public void setTimeUnits (String timeUnits)
    {
        this.timeUnits = timeUnits;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [startTime = "+startTime+", amount = "+amount+", timeUnitType = "+timeUnitType+", timeUnits = "+timeUnits+"]";
    }
}