package BookingApplication;

import java.util.ArrayList;

public class TicketBooking {

    ArrayList<BookingDetails> list = new ArrayList<>();
    public void bookTicket(String name , int age , long con , int seats )
    {
        BookingDetails bd = new BookingDetails(name, age , con , seats);
        list.add(bd);
    }

    public void display()
    {
        for (BookingDetails b : list) {
            b.displayDetails();
            System.out.println("=======================================");
        }
    }
}
