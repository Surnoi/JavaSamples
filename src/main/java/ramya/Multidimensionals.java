package ramya;

public class Multidimensionals {
    public static void main(String args[]) {
        Scanner input;
        input = new Scanner(System.in);
        int a[] = {10, 20, 30, 40, 50};
        char[] c = {'a', 'b', 'c', 'd', 'e'};
        int b[] = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print(a[i] + " ");
            System.out.println(c[i] + " ");
        }
        for (int i = 0; i < 5; i++) {
            b[i] = input.nextInt();
        }
        for (int i = 0; i < 5; i++) System.out.print(b[i] + " ");
    }
}


