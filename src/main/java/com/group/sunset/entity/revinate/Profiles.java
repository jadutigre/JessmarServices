/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.group.sunset.entity.revinate;

import java.util.List;

/**
 *
 * @author jdelgado
 */
public class Profiles
{
    private String middleName;
    private String lastName;
    private String title;
    private String profileType;
    private String profileId;
    private List<Memberships> memberships;
    private String action;
    private String property;
    private List<PhoneNumbers> phoneNumbers;
    private String firstName;
    private List<PostalAddresses> postalAddresses;
    private List<EmailAddresses> emailAddresses;
    private String primaryLanguage;

    public Profiles() {
    }
    
    
    
    
    

    public String getMiddleName ()
    {
        return middleName;
    }

    public void setMiddleName (String middleName)
    {
        this.middleName = middleName;
    }

    public String getLastName ()
    {
        return lastName;
    }

    public void setLastName (String lastName)
    {
        this.lastName = lastName;
    }

    public String getTitle ()
    {
        return title;
    }

    public void setTitle (String title)
    {
        this.title = title;
    }

    public String getProfileType ()
    {
        return profileType;
    }

    public void setProfileType (String profileType)
    {
        this.profileType = profileType;
    }

    public String getProfileId ()
    {
        return profileId;
    }

    public void setProfileId (String profileId)
    {
        this.profileId = profileId;
    }

    public List<Memberships> getMemberships ()
    {
        return memberships;
    }

    public void setMemberships (List<Memberships> memberships)
    {
        this.memberships = memberships;
    }

    public String getAction ()
    {
        return action;
    }

    public void setAction (String action)
    {
        this.action = action;
    }

    public String getProperty ()
    {
        return property;
    }

    public void setProperty (String property)
    {
        this.property = property;
    }

    public List<PhoneNumbers> getPhoneNumbers ()
    {
        return phoneNumbers;
    }

    public void setPhoneNumbers (List<PhoneNumbers> phoneNumbers)
    {
        this.phoneNumbers = phoneNumbers;
    }

    public String getFirstName ()
    {
        return firstName;
    }

    public void setFirstName (String firstName)
    {
        this.firstName = firstName;
    }

    public List<PostalAddresses> getPostalAddresses ()
    {
        return postalAddresses;
    }

    public void setPostalAddresses (List<PostalAddresses> postalAddresses)
    {
        this.postalAddresses = postalAddresses;
    }

    public List<EmailAddresses> getEmailAddresses ()
    {
        return emailAddresses;
    }

    public void setEmailAddresses (List<EmailAddresses> emailAddresses)
    {
        this.emailAddresses = emailAddresses;
    }

    public String getPrimaryLanguage() {
        return primaryLanguage;
    }

    public void setPrimaryLanguage(String primaryLanguage) {
        this.primaryLanguage = primaryLanguage;
    }
    
    
    

    @Override
    public String toString()
    {
        return "ClassPojo [middleName = "+middleName+", lastName = "+lastName+", title = "+title+", profileType = "+profileType+", profileId = "+profileId+", memberships = "+memberships+", action = "+action+", property = "+property+", phoneNumbers = "+phoneNumbers+", firstName = "+firstName+", postalAddresses = "+postalAddresses+", emailAddresses = "+emailAddresses+"]";
    }
}