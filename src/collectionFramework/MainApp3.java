package collectionFramework;

import java.util.HashSet;
import java.util.Scanner;

public class MainApp3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> hs = new HashSet<>();

        System.out.println("ENTER 3 INPUTS :");
        for (int i =0 ; i<5 ; i++)
        {
            hs.add(sc.next());
        }

        System.out.println("ELEMENTS ARE : ");
        for (String s : hs)
            System.out.println(s);

    }
}
