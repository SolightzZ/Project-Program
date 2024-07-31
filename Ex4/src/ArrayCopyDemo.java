import java.util.Arrays;

public class ArrayCopyDemo {
    public static void main(String[] args) {
        int number[] = {5,10,35,55,80,70};
        int n1[] = number;
        int n2[] = (int[]) number.clone();
        int n3[] = new int[3];

        number[2] = 100;

        System.arraycopy(number, 3, n3,0,3);


        System.out.println("\nvalue from number[] : " + Arrays.toString(number));
        System.out.println("value from number[] : " + Arrays.toString(n1));
        System.out.println("value from number[] : " + Arrays.toString(n2));
        System.out.println("value from number[] : " + Arrays.toString(n3));

    }
}
