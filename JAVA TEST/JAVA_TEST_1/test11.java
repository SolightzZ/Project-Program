import java.util.Scanner;

public class test11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name;
        double w, hc, hm, bmi;

        System.out.println("****** BMI Calculator ***********\n");

        System.out.print("Enter your name: ");
        name = in.nextLine();

        System.out.print("Enter your weight (kg): ");
        w = in.nextDouble();

        System.out.print("Enter your height (cm): ");
        hc = in.nextDouble();

        hm = hc / 100;
        bmi = w / Math.pow(hc, 2);

        System.out.println("\n--------------------------------------------");
        System.out.println(name + ", your Body Mass Index (BMI) is " + bmi);
    }
}
