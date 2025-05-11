package Lab01;

public class ZLab09 {
    public static void main(String[] args) {
        String s = "Jan Nowak 150 25,3";
        s = s.replace(",", ".");
        String[] strings = s.split(" ");
        String s1 = strings[0];
        String s2 = strings[1];
        Integer a = Integer.valueOf(strings[2]);
        double b = Double.valueOf(strings[3]);
        System.out.printf("%s %s %.2f\n", s2, s1, a * b);
    }
}
