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
public class Profiles
{
    private String middleName;

    private String dateOfBirth;

    private String lastName;

    private String vipStatus;

    private String mailOptOut;

    private String property;

    private PhoneNumbers[] phoneNumbers;

    private PostalAddresses[] postalAddresses;

    private String primaryLanguage;

    private String title;

    private String profileType;

    private String profileId;

    private Memberships[] memberships;

    private String action;

    private String gender;

    private String emailOptOut;

    private String firstName;

    private CompanyInfo companyInfo;

    private CreditCards[] creditCards;

    private EmailAddresses[] emailAddresses;

    public Profiles() {
    }

    public Profiles(String middleName, String dateOfBirth, String lastName, String vipStatus, String mailOptOut, String property, PhoneNumbers[] phoneNumbers, PostalAddresses[] postalAddresses, String primaryLanguage, String title, String profileType, String profileId, Memberships[] memberships, String action, String gender, String emailOptOut, String firstName, CompanyInfo companyInfo, CreditCards[] creditCards, EmailAddresses[] emailAddresses) {
        this.middleName = middleName;
        this.dateOfBirth = dateOfBirth;
        this.lastName = lastName;
        this.vipStatus = vipStatus;
        this.mailOptOut = mailOptOut;
        this.property = property;
        this.phoneNumbers = phoneNumbers;
        this.postalAddresses = postalAddresses;
        this.primaryLanguage = primaryLanguage;
        this.title = title;
        this.profileType = profileType;
        this.profileId = profileId;
        this.memberships = memberships;
        this.action = action;
        this.gender = gender;
        this.emailOptOut = emailOptOut;
        this.firstName = firstName;
        this.companyInfo = companyInfo;
        this.creditCards = creditCards;
        this.emailAddresses = emailAddresses;
    }
    
    
    
    
    
    

    public String getMiddleName ()
    {
        return middleName;
    }

    public void setMiddleName (String middleName)
    {
        this.middleName = middleName;
    }

    public String getDateOfBirth ()
    {
        return dateOfBirth;
    }

    public void setDateOfBirth (String dateOfBirth)
    {
        this.dateOfBirth = dateOfBirth;
    }

    public String getLastName ()
    {
        return lastName;
    }

    public void setLastName (String lastName)
    {
        this.lastName = lastName;
    }

    public String getVipStatus ()
    {
        return vipStatus;
    }

    public void setVipStatus (String vipStatus)
    {
        this.vipStatus = vipStatus;
    }

    public String getMailOptOut ()
    {
        return mailOptOut;
    }

    public void setMailOptOut (String mailOptOut)
    {
        this.mailOptOut = mailOptOut;
    }

    public String getProperty ()
    {
        return property;
    }

    public void setProperty (String property)
    {
        this.property = property;
    }

    public PhoneNumbers[] getPhoneNumbers ()
    {
        return phoneNumbers;
    }

    public void setPhoneNumbers (PhoneNumbers[] phoneNumbers)
    {
        this.phoneNumbers = phoneNumbers;
    }

    public PostalAddresses[] getPostalAddresses ()
    {
        return postalAddresses;
    }

    public void setPostalAddresses (PostalAddresses[] postalAddresses)
    {
        this.postalAddresses = postalAddresses;
    }

    public String getPrimaryLanguage ()
    {
        return primaryLanguage;
    }

    public void setPrimaryLanguage (String primaryLanguage)
    {
        this.primaryLanguage = primaryLanguage;
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

    public Memberships[] getMemberships ()
    {
        return memberships;
    }

    public void setMemberships (Memberships[] memberships)
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

    public String getGender ()
    {
        return gender;
    }

    public void setGender (String gender)
    {
        this.gender = gender;
    }

    public String getEmailOptOut ()
    {
        return emailOptOut;
    }

    public void setEmailOptOut (String emailOptOut)
    {
        this.emailOptOut = emailOptOut;
    }

    public String getFirstName ()
    {
        return firstName;
    }

    public void setFirstName (String firstName)
    {
        this.firstName = firstName;
    }

    public CompanyInfo getCompanyInfo ()
    {
        return companyInfo;
    }

    public void setCompanyInfo (CompanyInfo companyInfo)
    {
        this.companyInfo = companyInfo;
    }

    public CreditCards[] getCreditCards ()
    {
        return creditCards;
    }

    public void setCreditCards (CreditCards[] creditCards)
    {
        this.creditCards = creditCards;
    }

    public EmailAddresses[] getEmailAddresses ()
    {
        return emailAddresses;
    }

    public void setEmailAddresses (EmailAddresses[] emailAddresses)
    {
        this.emailAddresses = emailAddresses;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [middleName = "+middleName+", dateOfBirth = "+dateOfBirth+", lastName = "+lastName+", vipStatus = "+vipStatus+", mailOptOut = "+mailOptOut+", property = "+property+", phoneNumbers = "+phoneNumbers+", postalAddresses = "+postalAddresses+", primaryLanguage = "+primaryLanguage+", title = "+title+", profileType = "+profileType+", profileId = "+profileId+", memberships = "+memberships+", action = "+action+", gender = "+gender+", emailOptOut = "+emailOptOut+", firstName = "+firstName+", companyInfo = "+companyInfo+", creditCards = "+creditCards+", emailAddresses = "+emailAddresses+"]";
    }
}
			