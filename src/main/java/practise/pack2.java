package practise;

public class pack2 {
    public static void main(String[] args) {
        int result = sum(5, 10);
        System.out.println(result);
    }

    public static int sum(int start, int end) {
        if (end > start) {
            int i = end + sum(start, end - 1);
            return i;
        } else return end;
    }
}
