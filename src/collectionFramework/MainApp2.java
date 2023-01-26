package collectionFramework;

import java.util.Scanner;
import java.util.Vector;

public class MainApp2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Character> vec = new Vector<>();
        System.out.println("ENTER 3 INPUTS ");
        for (int i =0 ; i<3 ; i++)
        {
            vec.add(sc.next().charAt(0));
        }

        System.out.println("ELEMENTS INSIDE THE VECTOR :");
        for (Character c : vec )
            System.out.println(c);
    }
}
