package application1;

import java.util.Scanner;

public class MainApp1 {
    static Scanner sc = new Scanner(System.in);
    static TicketBooking t1 = new TicketBooking() ;
    public static void main(String[] args) {

        int qty = 0 ;
        boolean status = true ;
        do {
            System.out.println("SELECT THE OPERATION");
            System.out.println("1. BOOK TICKET ");
            System.out.println("2. CANCEL TICKET ");
            System.out.println("3. DISPLAY TICKET ");
            System.out.println("4. EXIT ");
            int ch = sc.nextInt();

            switch (ch)
            {
                case 1 :
                        bookTicket();
                    break;
                case 2 :
                    System.out.println("ENTER CANCEL TICKET COUNT : ");
                    qty = sc.nextInt();
                    t1.cancelTicket(qty);
                    System.out.println("TICKET CANCELED SUCCESSFULLY !!");
                    System.out.println("-------------------------------------");

                    break;
                case 3:
                    t1.displayTicket();
                    System.out.println("-------------------------------------");
                    break;

                case 4:
                    status = false;
                    break;
                default:
                    System.out.println("INVALID CHOICE !!");
                    System.out.println("-------------------------------------");



            }
        }while (status);
    }

    public static void bookTicket()
    {
        System.out.println("ENTER TICKET COUNT : ");
        int qty = sc.nextInt();
        t1.bookTicket(qty);
        System.out.println("-------------------------------------");
    }


}
