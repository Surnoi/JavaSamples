package oldpackage;

public class FirstClass {

   String city ;
   static String country;
   static int noOfStates;

   static long l;

    public static void main(String[] args) {

        ConsturctorExample example = new ConsturctorExample();


        System.out.println("hiiiii");
        FirstClass f1 = new FirstClass();
        FirstClass f2 = new FirstClass();

        f1.city = "Hyderabad";
        f1.country = "India";
        f1.noOfStates = 28;
        System.out.println("f1.city : "+ f1.city +" : country : "+ f1.country + " : f1.noOfStates: "+ f1.noOfStates);
        f2.city = "New York";
        f2.country= "US";
        f2.noOfStates = 53;
        System.out.println("f2.city : "+ f2.city +" : country : "+ f2.country + " : f1.noOfStates: "+ f2.noOfStates);

        System.out.println("f1.city : "+ f1.city +" : country : "+ f1.country + " : f1.noOfStates: "+ f1.noOfStates);


    }

}
