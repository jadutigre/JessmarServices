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
public class GuestNotes
{
    
    private String attachedTo;
    private String time;
    private String text;
    private String title;
    private String type;

    public GuestNotes() {
    }

    public GuestNotes(String attachedTo, String time, String text, String title, String type) {
        this.attachedTo = attachedTo;
        this.time = time;
        this.text = text;
        this.title = title;
        this.type = type;
    }
    
    
    
    

    public String getAttachedTo ()
    {
        return attachedTo;
    }

    public void setAttachedTo (String attachedTo)
    {
        this.attachedTo = attachedTo;
    }

    public String getTime ()
    {
        return time;
    }

    public void setTime (String time)
    {
        this.time = time;
    }

    public String getText ()
    {
        return text;
    }

    public void setText (String text)
    {
        this.text = text;
    }

    public String getTitle ()
    {
        return title;
    }

    public void setTitle (String title)
    {
        this.title = title;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [attachedTo = "+attachedTo+", time = "+time+", text = "+text+", title = "+title+", type = "+type+"]";
    }
}