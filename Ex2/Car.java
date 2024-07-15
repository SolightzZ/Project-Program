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
