/*
        Name: นายปณิธฺิ จ่าเหม
        No. ุ66040233122
 */
import java.util.Scanner;

    public class BMI {
        private double weight;
        private double height;
        private double bmi;

    public BMI(double weight, double height) {
        this.weight = weight;
        this.height = height;
        this.bmi = 0.0;
    }

    public double computeBMI() {
        double heightInMeters = height / 100.0;
        bmi = weight / (heightInMeters * heightInMeters);
        return bmi;
    }

    public void showBody() {
        if (bmi < 20) {
            System.out.println("Your health status is Underweight");
        } else if (bmi >= 20 && bmi <= 25) {
            System.out.println("Your health status is Normal");
        } else {
            System.out.println("Your health status is Overweight");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n------------------------------");
        System.out.print("Enter your weight in kilograms => ");
        double weight = scanner.nextDouble();
        System.out.print("Enter your height in centimeters => ");
        double height = scanner.nextDouble();
        System.out.println(" ");

        BMI person = new BMI(weight, height);
        double personBMI = person.computeBMI();
        System.out.printf("Your BMI is %.6f\n", personBMI);
        person.showBody();
        scanner.close();
        System.out.println("------------------------------");
    }
}
