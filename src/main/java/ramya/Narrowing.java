package ramya;

public class Narrowing {
    public static void main(String[] args) {
        byte b=2;
        int i=257;
        double d=323.142;
        System.out.println("int to byte conversion");
        b= (byte)i;	//int to byte
        System.out.println("i and b values: "+i+" "+b);
        System.out.println("double to int conversion");
        i=(int)d;	//double to int
        System.out.println("d amd i values: "+d+" "+i);
        System.out.println("double to byte conversion");
        b=(byte)d;	//double to byte
        System.out.println("d amd b values: "+d+" "+b);
    }
}



