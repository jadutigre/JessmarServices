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
public class StayLength
{

    private String stayLengthUnits;
    private String stayLength;

    public StayLength() {
    }

   
    
    
    
    
    public String getStayLengthUnits ()
    {
        return stayLengthUnits;
    }

    public void setStayLengthUnits (String stayLengthUnits)
    {
        this.stayLengthUnits = stayLengthUnits;
    }

    public String getStayLength ()
    {
        return stayLength;
    }

    public void setStayLength (String stayLength)
    {
        this.stayLength = stayLength;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [stayLengthUnits = "+stayLengthUnits+", stayLength = "+stayLength+"]";
    }
}
