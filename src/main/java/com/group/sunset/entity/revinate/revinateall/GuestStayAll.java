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
public class GuestStayAll
{
    private String actualCheckoutDate;
    private StayLength stayLength;
    private String confirmationCode;
    private String checkinDate;
    private String numberOfAdults;
    private String cancellationDate;
    private String statusCode;
    private String lastUpdatedAt;
    private String roomNumber;
    private TotalTaxes totalTaxes;
    private String action;
    private TotalOtherRevenue totalOtherRevenue;
    private String actualCheckinDate;
    private String checkoutDate;
    private String bookingDate;
    private TotalFoodAndBeverageRevenue totalFoodAndBeverageRevenue;
    private String numberOfRooms;
    private String property;
    private RatePlans[] ratePlans;
    private GuestNotes[] guestNotes;
    private TotalRoomRevenue totalRoomRevenue;
    private String cancellationNumber;
    private String market;
    private String reservationSource;
    private String roomType;
    private String numberOfChildren;
    private Profiles[] profiles;

    public GuestStayAll() {
    }

    public GuestStayAll(String actualCheckoutDate, StayLength stayLength, String confirmationCode, String checkinDate, String numberOfAdults, String cancellationDate, String statusCode, String lastUpdatedAt, String roomNumber, TotalTaxes totalTaxes, String action, TotalOtherRevenue totalOtherRevenue, String actualCheckinDate, String checkoutDate, String bookingDate, TotalFoodAndBeverageRevenue totalFoodAndBeverageRevenue, String numberOfRooms, String property, RatePlans[] ratePlans, GuestNotes[] guestNotes, TotalRoomRevenue totalRoomRevenue, String cancellationNumber, String market, String reservationSource, String roomType, String numberOfChildren, Profiles[] profiles) {
        this.actualCheckoutDate = actualCheckoutDate;
        this.stayLength = stayLength;
        this.confirmationCode = confirmationCode;
        this.checkinDate = checkinDate;
        this.numberOfAdults = numberOfAdults;
        this.cancellationDate = cancellationDate;
        this.statusCode = statusCode;
        this.lastUpdatedAt = lastUpdatedAt;
        this.roomNumber = roomNumber;
        this.totalTaxes = totalTaxes;
        this.action = action;
        this.totalOtherRevenue = totalOtherRevenue;
        this.actualCheckinDate = actualCheckinDate;
        this.checkoutDate = checkoutDate;
        this.bookingDate = bookingDate;
        this.totalFoodAndBeverageRevenue = totalFoodAndBeverageRevenue;
        this.numberOfRooms = numberOfRooms;
        this.property = property;
        this.ratePlans = ratePlans;
        this.guestNotes = guestNotes;
        this.totalRoomRevenue = totalRoomRevenue;
        this.cancellationNumber = cancellationNumber;
        this.market = market;
        this.reservationSource = reservationSource;
        this.roomType = roomType;
        this.numberOfChildren = numberOfChildren;
        this.profiles = profiles;
    }
    
    

    public String getActualCheckoutDate ()
    {
        return actualCheckoutDate;
    }

    public void setActualCheckoutDate (String actualCheckoutDate)
    {
        this.actualCheckoutDate = actualCheckoutDate;
    }

    public StayLength getStayLength ()
    {
        return stayLength;
    }

    public void setStayLength (StayLength stayLength)
    {
        this.stayLength = stayLength;
    }

    public String getConfirmationCode ()
    {
        return confirmationCode;
    }

    public void setConfirmationCode (String confirmationCode)
    {
        this.confirmationCode = confirmationCode;
    }

    public String getCheckinDate ()
    {
        return checkinDate;
    }

    public void setCheckinDate (String checkinDate)
    {
        this.checkinDate = checkinDate;
    }

    public String getNumberOfAdults ()
    {
        return numberOfAdults;
    }

    public void setNumberOfAdults (String numberOfAdults)
    {
        this.numberOfAdults = numberOfAdults;
    }

    public String getCancellationDate ()
    {
        return cancellationDate;
    }

    public void setCancellationDate (String cancellationDate)
    {
        this.cancellationDate = cancellationDate;
    }

    public String getStatusCode ()
    {
        return statusCode;
    }

    public void setStatusCode (String statusCode)
    {
        this.statusCode = statusCode;
    }

    public String getLastUpdatedAt ()
    {
        return lastUpdatedAt;
    }

    public void setLastUpdatedAt (String lastUpdatedAt)
    {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    public String getRoomNumber ()
    {
        return roomNumber;
    }

    public void setRoomNumber (String roomNumber)
    {
        this.roomNumber = roomNumber;
    }

    public TotalTaxes getTotalTaxes ()
    {
        return totalTaxes;
    }

    public void setTotalTaxes (TotalTaxes totalTaxes)
    {
        this.totalTaxes = totalTaxes;
    }

    public String getAction ()
    {
        return action;
    }

    public void setAction (String action)
    {
        this.action = action;
    }

    public TotalOtherRevenue getTotalOtherRevenue ()
    {
        return totalOtherRevenue;
    }

    public void setTotalOtherRevenue (TotalOtherRevenue totalOtherRevenue)
    {
        this.totalOtherRevenue = totalOtherRevenue;
    }

    public String getActualCheckinDate ()
    {
        return actualCheckinDate;
    }

    public void setActualCheckinDate (String actualCheckinDate)
    {
        this.actualCheckinDate = actualCheckinDate;
    }

    public String getCheckoutDate ()
    {
        return checkoutDate;
    }

    public void setCheckoutDate (String checkoutDate)
    {
        this.checkoutDate = checkoutDate;
    }

    public String getBookingDate ()
    {
        return bookingDate;
    }

    public void setBookingDate (String bookingDate)
    {
        this.bookingDate = bookingDate;
    }

    public TotalFoodAndBeverageRevenue getTotalFoodAndBeverageRevenue ()
    {
        return totalFoodAndBeverageRevenue;
    }

    public void setTotalFoodAndBeverageRevenue (TotalFoodAndBeverageRevenue totalFoodAndBeverageRevenue)
    {
        this.totalFoodAndBeverageRevenue = totalFoodAndBeverageRevenue;
    }

    public String getNumberOfRooms ()
    {
        return numberOfRooms;
    }

    public void setNumberOfRooms (String numberOfRooms)
    {
        this.numberOfRooms = numberOfRooms;
    }

    public String getProperty ()
    {
        return property;
    }

    public void setProperty (String property)
    {
        this.property = property;
    }

    public RatePlans[] getRatePlans ()
    {
        return ratePlans;
    }

    public void setRatePlans (RatePlans[] ratePlans)
    {
        this.ratePlans = ratePlans;
    }

    public GuestNotes[] getGuestNotes ()
    {
        return guestNotes;
    }

    public void setGuestNotes (GuestNotes[] guestNotes)
    {
        this.guestNotes = guestNotes;
    }

    public TotalRoomRevenue getTotalRoomRevenue ()
    {
        return totalRoomRevenue;
    }

    public void setTotalRoomRevenue (TotalRoomRevenue totalRoomRevenue)
    {
        this.totalRoomRevenue = totalRoomRevenue;
    }

    public String getCancellationNumber ()
    {
        return cancellationNumber;
    }

    public void setCancellationNumber (String cancellationNumber)
    {
        this.cancellationNumber = cancellationNumber;
    }

    public String getMarket ()
    {
        return market;
    }

    public void setMarket (String market)
    {
        this.market = market;
    }

    public String getReservationSource ()
    {
        return reservationSource;
    }

    public void setReservationSource (String reservationSource)
    {
        this.reservationSource = reservationSource;
    }

    public String getRoomType ()
    {
        return roomType;
    }

    public void setRoomType (String roomType)
    {
        this.roomType = roomType;
    }

    public String getNumberOfChildren ()
    {
        return numberOfChildren;
    }

    public void setNumberOfChildren (String numberOfChildren)
    {
        this.numberOfChildren = numberOfChildren;
    }

    public Profiles[] getProfiles ()
    {
        return profiles;
    }

    public void setProfiles (Profiles[] profiles)
    {
        this.profiles = profiles;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [actualCheckoutDate = "+actualCheckoutDate+", stayLength = "+stayLength+", confirmationCode = "+confirmationCode+", checkinDate = "+checkinDate+", numberOfAdults = "+numberOfAdults+", cancellationDate = "+cancellationDate+", statusCode = "+statusCode+", lastUpdatedAt = "+lastUpdatedAt+", roomNumber = "+roomNumber+", totalTaxes = "+totalTaxes+", action = "+action+", totalOtherRevenue = "+totalOtherRevenue+", actualCheckinDate = "+actualCheckinDate+", checkoutDate = "+checkoutDate+", bookingDate = "+bookingDate+", totalFoodAndBeverageRevenue = "+totalFoodAndBeverageRevenue+", numberOfRooms = "+numberOfRooms+", property = "+property+", ratePlans = "+ratePlans+", guestNotes = "+guestNotes+", totalRoomRevenue = "+totalRoomRevenue+", cancellationNumber = "+cancellationNumber+", market = "+market+", reservationSource = "+reservationSource+", roomType = "+roomType+", numberOfChildren = "+numberOfChildren+", profiles = "+profiles+"]";
    }
}