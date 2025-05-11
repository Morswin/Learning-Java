package Lab01;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ZLab10 {
    public static void main(String[] args) throws IOException {
        File file = new File("dane.txt");
        Scanner input = new Scanner(file);
        while (input.hasNext()) {
            String[] s = (input.nextLine()).split(" ");
            String name = s[0];
            String surename = s[1];
            Integer hours = Integer.valueOf(s[2]);
            Double wage = Double.valueOf(s[3]);
            System.out.printf("%s %s %.2f\n", name, surename, hours * wage);
        }
    }
}
