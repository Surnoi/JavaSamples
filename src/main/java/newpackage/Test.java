package newpackage;

import oldpackage.ConsturctorExample;

public class Test extends ConsturctorExample{

    int x =5;
    public static void main(String[] args) {
        Test t = new Test();
        int m = t.x;
        String name = t.name;
       
    }
}
