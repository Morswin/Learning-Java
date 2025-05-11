package Lab01;

import java.util.Scanner;

public class ZLab11 {
    public static final String[] days = {"niedziela", "poniedziałek", "wtorek", "środa", "czwartek", "piątek", "sobota"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Podaj datę w formacie dd.mm.rrrr:");
        String data = sc.next();
        String[] s = data.split("\\.");
        Integer d = Integer.valueOf(s[0]);
        Integer m = Integer.valueOf(s[1]);
        Integer y = Integer.valueOf(s[2]);
        int z, c;
        if (m.equals(1) || m.equals(2)) {
            z = y - 1;
            c = 0;
        }
        else {
            z = y;
            c = 2;
        }
        //dt=(23*m/9+d+4+y+z/4-z/100+z/400-c)%7
        int index = (23*m/9+d+4+y+z/4-z/100+z/400-c)%7;
        System.out.println("Tego dnia, dzień tygodnia to: " + days[index]);
    }
}
