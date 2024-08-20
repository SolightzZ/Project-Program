/*
        ✨ นายปณิธิ จ่าเหม
        📂 66040233122
 */

class Employee {
    String id;
    String name;
    int age;
    double salary;
    double newSalary;
    double oldSalary;

    public Employee(String id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.newSalary = salary;
        this.oldSalary = salary;
    }

    public void increSalary() {
        if (salary <= 15000) {
            newSalary = salary * 1.07;
        } else {
            newSalary = salary * 1.04;
        }
    }

    public double oldSalary() {
        return oldSalary;
    }
}
