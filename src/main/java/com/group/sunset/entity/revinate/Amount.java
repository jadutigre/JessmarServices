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
public class Amount
{
    private String value;

    public Amount() {
    }

    public Amount(String value) {
        this.value = value;
    }
    
    
    
    

    public String getValue ()
    {
        return value;
    }

    public void setValue (String value)
    {
        this.value = value;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [value = "+value+"]";
    }
    
}
