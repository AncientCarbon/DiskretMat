// version 1.0.0

import java.util.Scanner;

public class SFD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Første tal: ");
        int tal1 = in.nextInt();
        System.out.print("Andet tal: ");
        int tal2 = in.nextInt();
        System.out.println();
        int tal3 = greatestCommonDenom.gcd(tal1, tal2);
        System.out.println("sfd = " + tal3);
        int[] udvidet = new int[2];
        udvidet = Euclid.extend(tal1, tal2, tal3);
        int max;
        int min;
        if (tal1 > tal2){
            max = tal1;
            min = tal2;
        }
        else {
            max = tal2;
            min = tal1;
        }

        System.out.println("Udvidet: " + udvidet[0] + " * " + min + " - " + udvidet[1] + " * " + max + " = " + tal3);
    }
}

