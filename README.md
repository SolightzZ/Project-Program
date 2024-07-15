# Project-Program
Java language 

public class Book {
    private String isbn;
    private String title;
    private String author;
    private double price;

    public Book() {
    }

    public Book(String isbn, String title, String author, double price) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void setIsbn(String isbn) {this.isbn = isbn;}
    public void setTitle(String title) {this.title = title;}
    public void setAuthor(String author) {this.author = author;}
    public void setPrice(double price) {this.price = price;}

    public String getIsbn() {return isbn;}
    public String getTitle() {return title;}
    public String getAuthor() {return author;}
    public double getPrice() {return price;}
}

public class Book_Tester {
    public static void main(String[] args) {
        // Create book1 using the default constructor and setter methods
        Book book1 = new Book();
        book1.setIsbn("001");
        book1.setTitle("Java Programming");
        book1.setAuthor("ปณฺิธิ จ่าเหม");
        book1.setPrice(100.0);

        // Create book2 using the parameterized constructor
        Book book2 = new Book("002", "Basic C++", "นายน้อย", 150.0);

        // Print details of book1 and book2
        System.out.println("\n-------------------- Book ---------------------------");
        System.out.println("ISBN\tTitle\t\t\t\tAuthor\t\t\tPrice");
        System.out.println(book1.getIsbn() + "\t\t" + book1.getTitle() + "\t" + book1.getAuthor() + "\t\t" + book1.getPrice());
        System.out.println(book2.getIsbn() + "\t\t" + book2.getTitle() + "\t\t\t" + book2.getAuthor() + "\t\t\t" + book2.getPrice());

        double totalPrice = book1.getPrice() + book2.getPrice();

        System.out.println("Total Price\t\t\t\t\t\t\t\t\t" + totalPrice);
        System.out.println("------------------------------------------------------");
    }
}

<?xml version="1.0" encoding="UTF-8"?>
<module type="GENERAL_MODULE" version="4">
  <component name="NewModuleRootManager" inherit-compiler-output="true">
    <exclude-output />
    <content url="file://$MODULE_DIR$">
      <sourceFolder url="file://$MODULE_DIR$" isTestSource="false" />
    </content>
    <orderEntry type="inheritedJdk" />
    <orderEntry type="sourceFolder" forTests="false" />
  </component>
</module>


public class Car {
    String brand;
    String model;
    private int year;

    //Constructor Aeclaration
    // สร้าง Constructor ตัวบนสุดหรือตัวแรกจะทำให้ การรันโค้ดนั้นมาก่อน
    // การสร้าง Overloading

    public  Car(){
        brand = "N/A";
        model = "N/A";
        year = 0;

    }
    //Constructor Overloading
    public Car(String b){
        brand = b;
        model = "N/A";
        year = 0;
    }

    public Car(String b, String m){
        brand = b;
        model = m;
        year = 0;
    }
    public Car(String b, String m, int  y ){
        brand = b;
        model = m;
        year = y;
    }

    // loop
    public void showCarInfo(){
        System.out.println("\n++++ Car Info ++++");
        System.out.println("-----------------");
        System.out.println("brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Year : " + year);
    }

    // Get set Method
    public void setBrand(String brand ){
        this.brand = brand ;
    }
   public void setModel(String model){
        this.model = model;
   }
    public void setYear(int year){
        this.year = year;
    }

    public String setBrand(){return brand;}
    public String setModel(){return model;}
    public int setYear(){return year;}

    public static void main(String[] args) {
        // สร้าง Object
        //Car c1 = new Car();
        //Car c2 = new Car();
        //c1 = new Car();

        Car c1, c2;
        c1 = new Car();
        c2 = new Car("Toyota : ", "Cross : ", 2022);


        /*
        c1.brand = "Mazda";
        c1.model = "Mazda3";
        c1.year = 2018;

        c2.brand = "Toyota";
        c2.model = "Cross";
        c2.year = 2022;
        */


        c1.showCarInfo();

        c2.showCarInfo();



    }
}

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