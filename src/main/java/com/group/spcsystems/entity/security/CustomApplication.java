/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.group.spcsystems.entity.security;

import org.glassfish.jersey.filter.LoggingFilter;
import org.glassfish.jersey.server.ResourceConfig;
 

 
public class CustomApplication extends ResourceConfig 
{
    public CustomApplication() 
    {
        packages("com.group.sunset.security");
        register(LoggingFilter.class);
        register(GsonMessageBodyHandler.class);
 
        //Register Auth Filter here
        register(AuthenticationFilter.class);
    }
}