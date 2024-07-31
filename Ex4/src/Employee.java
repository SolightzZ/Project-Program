/*
    ✨ นายปณิธิ จ่าเหม
    📂 66040233122
*/
public class Employee {

    private String id;
    private String name;
    private int age;
    private double salary;

    // ประกาศ Constructor
    public Employee() {}

    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Employee(String id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void setId(String id) {     this.id = id;   }
    public void setName(String name) {  this.name = name;   }
    public void setAge(int age) {   this.age = age; }
    public void setSalary(double salary) {  this.salary = salary;   }

    public String getId()   {return id;}
    public String getName() {return name;}
    public int getAge() {return age;}
    public double getSalary()   {return salary;}

    public void getInfo() {
        System.out.println("\n    Employee id: " + id);
        System.out.println("    Employee name: " + name);
        System.out.println("    Age: " + age);
        System.out.println("    Salary: " + salary);
        System.out.println("✦ ------------- ⋆⋅☆⋅⋆ ------------- ✦");
    }
}
