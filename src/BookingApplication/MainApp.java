package BookingApplication;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TicketBooking t1 = new TicketBooking();

        boolean status = true ;
        do {
            System.out.println("1. BOOK TICKET ");
            System.out.println("2. DISPLAY TICKET ");
            System.out.println("3. EXIT ");
            int ch = sc.nextInt();
            switch (ch)
            {
                case 1:
                    System.out.println("ENTER NAME ");
                    String name = sc.next();
                    System.out.println("ENTER AGE ");
                    int age = sc.nextInt();
                    System.out.println("ENTER CONTACT ");
                    long con = sc.nextLong();
                    System.out.println("ENTER SEATS ");
                    int seats = sc.nextInt();
                    t1.bookTicket(name, age , con , seats);
                    break;
                case 2 :
                    t1.display();
                    break;
                case 3:
                    status = false;
                default:
                    System.out.println("INVALID CHOICE !!");
            }
        }while (status);
    }
}
