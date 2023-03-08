package oldpackage;

public class MethodOverloading {

    String city;

    MethodOverloading(){
        city = "hyderabad";
    }

    String show(){
        return city;
    }

    void show(String a){
        System.out.println("hi : " + a);
    }

    void show(int a){
        System.out.println("hi : " + a);
    }
    void show(int a,String b){
        System.out.println("hi : " + a + b);
    }


    public static void main(String[] args) {
        MethodOverloading overloading = new MethodOverloading();
        overloading.show();
        overloading.show(10);
        overloading.show("abc");
        overloading.show(100,"xyz");
    }




}
