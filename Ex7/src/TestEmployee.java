/*
        ✨ นายปณิธิ จ่าเหม
        📂 66040233122
 */


import java.util.Scanner;

public class TestEmployee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee[] employees = new Employee[5];

        for (int i = 0; i < employees.length; i++) {
            System.out.println("\n✦ ---------------- ⋆⋅☆⋅⋆ ---------------- ✦");
            System.out.print("Employee ID : ");
            String id = scanner.nextLine();
            System.out.print("Employee name : ");
            String name = scanner.nextLine();
            System.out.print("Age : ");
            int age = scanner.nextInt();
            System.out.print("Salary : ");
            double salary = scanner.nextDouble();
            scanner.nextLine();

            employees[i] = new Employee(id, name, age, salary);
            employees[i].increSalary();
        }

        System.out.println("\n\tNo.\tID\t\tName\t\t\tAge\t\tOld Salary\t\tNew Salary");
        System.out.println(" ✦ --------------------------- ⋆⋅☆⋅⋆ --------------------------------- ✦");
        for (int i = 0; i < employees.length; i++) {
            System.out.printf("\t%d.\t%s\t\t%s\t\t\t\t%d\t\t%.2f\t\t%.2f\n",
                    i + 1,
                    employees[i].id,
                    employees[i].name,
                    employees[i].age,
                    employees[i].oldSalary(),
                    employees[i].newSalary);
        }
        scanner.close();
    }
}

