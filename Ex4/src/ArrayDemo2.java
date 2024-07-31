/*
    ✨ นายปณิธิ จ่าเหม
    📂 66040233122
*/

import java.util.Scanner;

public class ArrayDemo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number[] = new double[5];
        double sum = 0, average;

        for (int i = 0; i < number.length; i++) {
            System.out.print("Enter number no." + (i + 1) + " => ");
            number[i] = scanner.nextDouble();
        }

        System.out.println("\n✦ ------------- ⋆⋅☆⋅⋆ ------------- ✦");
        System.out.println("       No.             Number ");
        System.out.println("✦ ------------- ⋆⋅☆⋅⋆ ------------- ✦");
        for (int i = 0; i < number.length; i++) {
            System.out.printf("      %2d            %10.2f\n", i + 1, number[i]);
            sum += number[i];
        }

        average = sum / number.length;

        System.out.println("✦ ------------- ⋆⋅☆⋅⋆ ------------- ✦");
        System.out.printf("     Sum:     %16.2f\n", sum);
        System.out.printf("     Average: %16.2f\n", average);
        System.out.println("✦ ------------- ⋆⋅☆⋅⋆ ------------- ✦ ");

        scanner.close();
    }
}
