package Lab02;

import java.util.Scanner;

public class Zad4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean przerwijPetle = false;
        while (!przerwijPetle) {
            String dane = sc.next();
            try {
                Integer temp = Integer.parseInt(dane);
                if (temp == 0) {
                    throw new ArithmeticException("0 Nie ma odwrotnej");
                }
                System.out.println("Wynik: " + (1.0/temp));
                przerwijPetle = true;
            }
            catch (ArithmeticException e) {
                System.out.println("Próbowano uzyskać odwrotną do 0.");
            }
            catch (NumberFormatException e) {
                System.out.println("Nie da się tego sparsować");
            }
            catch (Exception e) {
                System.out.println("Coś poszło nie tak.");
            }
        }
    }
}
