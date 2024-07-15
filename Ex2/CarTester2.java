import java.util.Scanner;

public class CarTester2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Car c1 = new Car();
        System.out.print("Enter car brand => ");
        c1.setBrand(input.nextLine());
        System.out.print("Enter car model => ");
        c1.setModel(input.nextLine());
        System.out.print("Enter car year => ");
        c1.setYear(input.nextInt());

        c1.showCarInfo();
    }
}
