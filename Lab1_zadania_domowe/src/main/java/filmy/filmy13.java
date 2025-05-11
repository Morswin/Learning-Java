package filmy;

public class filmy13 {
    public static void main(String[] args) {
        int[] numbers = {10, 11, 12, 13, 14, 15};
        // Pętla for
        for (int index = 0; index < numbers.length; index++) {
            System.out.println(numbers[index]);
        }
        // Pętla for each
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
