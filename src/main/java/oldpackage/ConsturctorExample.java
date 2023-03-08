package oldpackage;

public class ConsturctorExample {

    int age;
    protected String name;
    private int k;

    public ConsturctorExample(){
        age = 10;
        name = "hyd";
    }


    ConsturctorExample(int a,String s){
        age = a;
        name = s;
    }


    public static void main(String[] args) {
        ConsturctorExample example = new ConsturctorExample();
        ConsturctorExample example1 = new ConsturctorExample(20,"bnglr");
        System.out.println("age : "+ example.age +" name : "+ example.name);
        System.out.println("age : "+ example1.age +" name : "+ example1.name);
    }
}
