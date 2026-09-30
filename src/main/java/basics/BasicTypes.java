package basics;

public class BasicTypes {
    public static void main(String[] args) {
        int a = 20;
        long b = 8_000_000L;
        boolean c = true;
        double d = 1.1;
        char e = 'a';

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        String s = "a";
        System.out.println(s);

        // == 比较基本类型的值；字符串内容通常使用 equals() 比较。
    }
}
