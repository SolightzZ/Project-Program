public class CarTester {
    public static void main(String[] args) {
       Car car1 = new Car();

        car1.setBrand("Nissan"); //car1.brand = "Nissan";
        car1.setModel("Click");
        car1.setYear(2024);

        System.out.println("Car Brand : " + car1.setBrand());
        System.out.println("Car Model : " + car1.setModel());
        System.out.println("Car Brand : " + car1.setYear());
    }
}
