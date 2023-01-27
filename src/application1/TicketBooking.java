package application1;

public class TicketBooking {
    static  int ticketCount = 100 ;
    static  int ticketPrice = 150 ;

    public void bookTicket(int qty)
    {
        if (qty<ticketCount)
        {
            double amt = qty * ticketPrice ;
            ticketCount-= qty ;
            System.out.println("TOTAL SEATS : "+qty);
            System.out.println("TOTAL AMOUNT : "+amt);
        }else {
            System.out.println("TICKET NOT AVAILABLE !!");
            displayTicket();
        }
    }

    public void cancelTicket( int qty )
    {
        if (ticketCount!=100 )
        {
            ticketCount += qty ;
            displayTicket();
        }else
            throw new CancelTicket();
    }

    public void displayTicket()
    {
        System.out.println("TOTAL AVAILABLE TICKET : "+ticketCount);
    }
}
