import java.util.Arrays;

public class CountNumbersInArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 2, 3, 1};
        int count = countNumbers(numbers);
        System.out.println("Count of numbers in array: " + count);
    }

    public static int countNumbers(int[] array) {
        return array.length;
    }
}