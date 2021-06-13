package booking;

import movie.MovieTicket;
import movie.Show;
import payment.Payment;

import java.util.List;

public class Booking
{
   private String BookingID;
   private Show movie;
   private int bookingTime;
   private int totalNumberOfBookingTickets;

   private List<MovieTicket>tickets;

   private Payment payment;

   public boolean makePayment()
   {
     // implement it   ...
   }

   public boolean cancel()
   {
      // implement it   ...
   }

   public boolean assignSeat(List<MovieTicket>tickets)
   {
      // implement it ...
   }
}
