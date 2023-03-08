package oldpackage;

public class StaticKeyword {

    int i;
    public int j;
    static long l=10;
    public static float f;
    char c;
    boolean b;

    void  display(int a){
        i=a;
        System.out.println("i value in display: "+i+l);
    }


    public static void main(String[] args) {


        double d=0.0;
        //public double d=0.0; invalid
        StaticKeyword v1=new StaticKeyword();
        System.out.println("values : "+ v1.i+v1.j+l+f+v1.c+v1.b); // values : 0010.0false
        StaticKeyword v2=new StaticKeyword();
        StaticKeyword v3=new StaticKeyword();
        v1.display(100);
        v1.i=2;
        v2.i=3;
        v3.i=4;



        System.out.println("i value is: "+v1.i);
        System.out.println("i value is: "+v2.i);
        System.out.println("i value is: "+v3.i);
        System.out.println("i value is: "+v1.j);
        StaticKeyword.l=20;
        StaticKeyword.l=30;




        l=40;
        System.out.println("l value is: "+StaticKeyword.l);
        System.out.println("l value is: "+v2.l);
        System.out.println("l value is: "+v3.l);

        System.out.println("f value is: "+f);
        System.out.println("c value is: "+v1.c);
        System.out.println("b value is: "+v1.b);

        System.out.println("d value is: "+d);
    }
}


