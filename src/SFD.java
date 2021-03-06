// version 1.2.1

import java.util.Scanner;

public class SFD {
    public static void main(String[] args) {
        int[] udvidet;
        int max;
        int min;

        Scanner in = new Scanner(System.in);
        System.out.print("Første tal: ");
        int tal1 = in.nextInt();

        System.out.print("Andet tal: ");
        int tal2 = in.nextInt();
        System.out.println();

        int tal3 = greatestCommonDenom.gcd(tal1, tal2);
        System.out.println("sfd = " + tal3);
        if (tal1 > tal2){
            max = tal1;
            min = tal2;
        }
        else {
            max = tal2;
            min = tal1;
        }
        if (tal3 == 1) {
            System.out.println(max + " er et primtal: " + prime.check(max));
        }

        udvidet = Euclid.extend(tal1, tal2, tal3);

        if (max == min){
            System.out.println("Udvidet: 1 * " + min + " - 0 * " + max + " = " + tal3);
        }
        else {
            System.out.println("Udvidet: " + udvidet[0] + " * " + min +
                    " - " + udvidet[1] + " * " + max + " = " + tal3);
        }
    }
}

