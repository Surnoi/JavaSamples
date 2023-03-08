package oldpackage;

import java.util.Scanner;

public class Iteration {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Please enter your name");
        String input = s.next();

        System.out.println("User entered value : "+input);


       /* int k = 10;
        short n =1;

        k = n;
        n = (short) k;

        for(int i =0;i<=10;i++){
            if(i ==3){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("outside of for loop");*/
       /* int i  = 1000 ;
        while(i <= 100){
            if(i % 3 ==0){
                System.out.println(i);
            }
            i = i+1;
        }


        do {
            System.out.println(i);
        }while (i<100);*/
    }

}
