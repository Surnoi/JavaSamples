package oldpackage;

public class ControlStatements {

    public static void main(String[] args) {

        int i = 10;
        int j = 20;
        int k = 30;
        int m = 100;
        int n = 200;



        if((i>j)){
            if(100>200){

            }
            else {

            }
            System.out.println("i is greater than j");
        }
        else if(i>k){
            System.out.println("i is less than j");
        }
        else {
            System.out.println("i is less than every value in the system");
        }

        String weekday = "june";

        switch (weekday){
            case "tuesday " : {
                if(10>20){

                }
                System.out.println("Tuesday");
            }
            case "monday " : {
                System.out.println("monday");
            }
            case "sunday" : {
                System.out.println("sunday");
                //break;
            }
            case "wednesday " : {
                System.out.println("wednesday");
            }
            case "thursday " : {
                System.out.println("thursday");
                break;
            }
            case "friday " : {
                System.out.println("friday");
            }
            case "saturday " : {
                System.out.println("saturday");
            }
            default:{
                System.out.println("Entered values is not a weekday");
            }
        }
        System.out.println("out of switch block");
    }
}
