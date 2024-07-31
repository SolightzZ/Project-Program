import java.util.Arrays;

public class ArraySortDemo {
    public static void main(String[] args) {
        int[] number = {51, 34, 78, 90, 20, 15, 88};

        System.out.println("Array number before sort : " + Arrays.toString(number));
        System.out.println();
        Arrays.sort(number);
        System.out.println("Array number after sort : " + Arrays.toString(number));

        System.out.println("Index of 78 is : "+ Arrays.binarySearch(number, 78));
        System.out.println("Index of 80 is : "+ Arrays.binarySearch(number, 80));

    }
}
