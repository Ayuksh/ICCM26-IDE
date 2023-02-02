package application1;

import java.util.Scanner;

public class MainApp2 {
    public static void main(String[] args) {
        AccountClass ac = null;
        Scanner sc = new Scanner(System.in);
        boolean status = true ;
        do {
            System.out.println("SELECT THE OPTION ");
            System.out.println("1. OPTION 1");
            System.out.println("2. OPTION 2");
            System.out.println("3. OPTION 3");
            System.out.println("4. SIGN OUT ");
            System.out.println("5 . exit ");
            int ch =sc.nextInt();
            if (ac==null)
                ac = AccountClass.createAccount();

            switch (ch)
            {
                case 1 :
                    System.out.println("OPTION 1 IS SELECTED !!");
                    break;
                case 2 :
                    System.out.println("OPTION 2 IS SELECTED !!");
                    break;
                case 3 :
                    System.out.println("OPTION 3 IS SELECTED !!");
                    break;
                case 4 :
                    ac=null;
                    break;
                case 5 :
                    status= false;
                    break;
                default:
                    System.out.println("INVALID CHOICE !!");
            }
        }while (status);


    }
}
