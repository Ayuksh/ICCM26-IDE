package application1;

public class CancelTicket extends RuntimeException{
    public CancelTicket() {
        System.out.println("NO TICKET BOOKED !!");
    }
}
