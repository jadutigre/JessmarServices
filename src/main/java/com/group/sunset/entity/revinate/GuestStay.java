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
public class GuestStay
{
    private String statusCode;
    private StayLength stayLength;    
    private String reservationSource;
    private String roomNumber;
    private String roomType;
    private String action;
    private String confirmationCode;
    private String property;
    private List<Profiles> profiles;
    private List<RatePlans> ratePlans;
    private String checkinDate;
    private String checkoutDate;
    private TotalRoomRevenue totalRoomRevenue;

    public GuestStay() {
    }

    public StayLength getStayLength() {
        return stayLength;
    }

    public void setStayLength(StayLength stayLength) {
        this.stayLength = stayLength;
    }


    

    public String getStatusCode ()
    {
        return statusCode;
    }

    public void setStatusCode (String statusCode)
    {
        this.statusCode = statusCode;
    }

    public String getReservationSource ()
    {
        return reservationSource;
    }

    public void setReservationSource (String reservationSource)
    {
        this.reservationSource = reservationSource;
    }

    public String getRoomNumber ()
    {
        return roomNumber;
    }

    public void setRoomNumber (String roomNumber)
    {
        this.roomNumber = roomNumber;
    }

    public String getRoomType ()
    {
        return roomType;
    }

    public void setRoomType (String roomType)
    {
        this.roomType = roomType;
    }

    public String getAction ()
    {
        return action;
    }

    public void setAction (String action)
    {
        this.action = action;
    }

    public String getConfirmationCode ()
    {
        return confirmationCode;
    }

    public void setConfirmationCode (String confirmationCode)
    {
        this.confirmationCode = confirmationCode;
    }

    public String getProperty ()
    {
        return property;
    }

    public void setProperty (String property)
    {
        this.property = property;
    }

    public List<Profiles> getProfiles ()
    {
        return profiles;
    }

    public void setProfiles (List<Profiles> profiles)
    {
        this.profiles = profiles;
    }

    public List<RatePlans> getRatePlans ()
    {
        return ratePlans;
    }

    public void setRatePlans (List<RatePlans> ratePlans)
    {
        this.ratePlans = ratePlans;
    }

    public String getCheckinDate ()
    {
        return checkinDate;
    }

    public void setCheckinDate (String checkinDate)
    {
        this.checkinDate = checkinDate;
    }

    public String getCheckoutDate ()
    {
        return checkoutDate;
    }

    public void setCheckoutDate (String checkoutDate)
    {
        this.checkoutDate = checkoutDate;
    }

    public TotalRoomRevenue getTotalRoomRevenue ()
    {
        return totalRoomRevenue;
    }

    public void setTotalRoomRevenue (TotalRoomRevenue totalRoomRevenue)
    {
        this.totalRoomRevenue = totalRoomRevenue;
    }
    
    
    

    @Override
    public String toString()
    {
        return "ClassPojo [statusCode = "+statusCode+", reservationSource = "+reservationSource+", roomNumber = "+roomNumber+", roomType = "+roomType+", action = "+action+", confirmationCode = "+confirmationCode+", property = "+property+", profiles = "+profiles+", ratePlans = "+ratePlans+", checkinDate = "+checkinDate+", checkoutDate = "+checkoutDate+", totalRoomRevenue = "+totalRoomRevenue+"]";
    }
    
}
