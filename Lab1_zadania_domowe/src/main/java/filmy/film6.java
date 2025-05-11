package filmy;

public class film6 {
    public static void main(String[] args) {
        System.out.println("Int, typy prymitywne.");
        int a = 3;
        System.out.println("A: " + a);
        int b = 3;
        System.out.println("B: " + b);
        System.out.println("A == B: " + (a == b));
        System.out.println("Integer, typy referencyjne.");
        Integer A = 123;
        System.out.println("A: " + A);
        Integer B = 123;
        System.out.println("B:" + B);
        System.out.println("A == B: " + A.equals(B));
        System.out.println("String, typy referencyjne.");
        String s1 = "cat";
        System.out.println("s1: " + s1);
        String s2 = "cat";
        System.out.println("s2: " + s2);
        System.out.println("s1 == s2: " + (s1.equals(s2)));
    }
}
