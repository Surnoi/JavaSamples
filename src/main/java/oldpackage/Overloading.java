package oldpackage;

public class Overloading {

    int x;
    String name;

 /*   Overloading(){
        x =0;
        name = null;
    }*/
    Overloading(){

    }

    Overloading(int a){
        x = a;
    }
    Overloading(String b){
        name = b;
    }

    Overloading(int a, String b){
        x =a;
        name = b;
    }

    Overloading(String a, String b){
        name = b;
    }


    public static void main(String[] args) {
        Overloading o1 = new Overloading();
        Overloading o2 = new Overloading(10);
        Overloading o3 = new Overloading("abc");
        Overloading o4 = new Overloading(100,"abc");
        System.out.println(o1.x +" : "+ o1.name);
        System.out.println(o2.x +" : "+ o2.name);
        System.out.println(o3.x +" : "+ o3.name);
        System.out.println(o4.x +" : "+ o4.name);



    }

}
