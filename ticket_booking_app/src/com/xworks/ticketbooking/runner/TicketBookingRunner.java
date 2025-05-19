package com.xworks.ticketbooking.runner;

import com.xworks.ticketbooking.thinks.TicketBookingDetails;

public class TicketBookingRunner {
    public static void main(String args[]){
       System.out.println( new TicketBookingDetails());
       TicketBookingDetails bookingDetails = new TicketBookingDetails();
       bookingDetails.name = "Smitha";
       bookingDetails.contactNumber = 6360471549l;
       bookingDetails.email = "smithadhage812@gmail.com";
       bookingDetails.ticketPrice = 120;
       bookingDetails.numberOfSeats = 45;
       System.out.println( "NAME IS :"+bookingDetails.name);
       System.out.println( "CONTACT NUMBER IS:"+bookingDetails.contactNumber);
       System.out.println( "EMAIL ID IS:"+bookingDetails.email);
       System.out.println( "TICKET PRICE IS:"+bookingDetails.ticketPrice);
       System.out.println( "NUMBER OF SEATS:"+bookingDetails.numberOfSeats);


    }
}
