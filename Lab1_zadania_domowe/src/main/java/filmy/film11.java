package filmy;

import java.util.ArrayList;
import java.util.Arrays;

public class film11 {
    public static void main(String[] args) {
        int[] array1;
//        int array2[];
        int[] array3 = new int[10];
        array3[0] = 5;
        int[] array4 = {5, 6, 7};
        double[] array5 = new double[]{1.0, 2.0, 3.0};
        System.out.println(array5[2]);
        int[][] array6 = new int[5][5];
        int[][] array7 = {
                {1, 2, 3},
                {4, 5, 6}
        };

        Arrays.sort(array5);
        System.out.println(Arrays.toString(array5));

        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(1);
        arrayList1.add(2);
        System.out.println(arrayList1.get(0));
        arrayList1.remove(0);
        System.out.println(arrayList1.get(0));
    }
}
