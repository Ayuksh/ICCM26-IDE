package collectionFramework;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApp1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("ENTER 3 INPUT : ");
        for (int i = 0 ; i<3 ; i++)
        {
            int a = sc.nextInt();
            arr.add(a);
        }



        System.out.println("ELEMENT INSIDE ARRAYLIST :");
        for (Integer i : arr)
            System.out.println(i);

    }
}
