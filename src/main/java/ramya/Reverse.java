package ramya;

import java.util.Scanner;

public class Reverse {
    private static Scanner Sc;

    public static void main(String[] args) {
        int numbers, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the maximum integer value");
        int number = sc.nextInt();
        for (i = number; i > 1; i--) {
            System.out.println(i + " \t");
        }
    }
}
