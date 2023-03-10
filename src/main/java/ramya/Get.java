package ramya;

public class Get {
    public static void main(String[] args) {
        String str = "abc" + "ABC";
        byte[] b = str.getBytes();
        //char[] c=str.toCharArray();
        System.out.println(str);
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + "  ");
            //System.out.print(c[i]+"  ");
        }
    }
}

