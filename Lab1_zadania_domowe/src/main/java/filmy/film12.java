package filmy;

public class film12 {
    public static void main(String[] args) {
        int[] numbers = {10, 11, 12, 13, 14, 15};
        int numbersLength = numbers.length;
        // Pętla while
        int index = 0;
        while (index < numbersLength) {
            System.out.println(numbers[index]);
            index++;
        }
        // Pętla do while
        index = 0;
        do {
            System.out.println(numbers[index]);
            index++;
        } while (index < numbersLength);
    }
}
