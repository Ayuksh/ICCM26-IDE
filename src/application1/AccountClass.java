package application1;

import java.util.Scanner;

public class AccountClass {
    static AccountClass ac ;
    static Scanner sc = new Scanner(System.in);
    String name ;
    int age ;
    long contact;

    public AccountClass(String name, int age, long contact) {
        this.name = name;
        this.age = age;
        this.contact = contact;
    }

    public  static  AccountClass createAccount()
    {
        System.out.println("NAME :");
        String name = sc.next();
        System.out.println("AGE : ");
        int age = sc.nextInt();
        System.out.println("CONTACT NUMBER : ");
        long con = sc.nextLong();
        ac = new AccountClass(name , age , con);
        return ac ;
    }
}
