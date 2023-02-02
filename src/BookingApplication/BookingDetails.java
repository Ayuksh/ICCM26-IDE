package BookingApplication;

public class BookingDetails {
    private String name ;
    private int age ;
    private long contact ;
    private int seats ;

    public BookingDetails(String name, int age, long contact, int seats) {
        this.name = name;
        this.age = age;
        this.contact = contact;
        this.seats = seats;
    }

    public void displayDetails()
    {
        System.out.println("NAME : "+name);
        System.out.println("AGE : "+age);
        System.out.println("CONTACT NUMBER : "+contact);
        System.out.println("SEAT COUNT : "+seats);
    }
}
