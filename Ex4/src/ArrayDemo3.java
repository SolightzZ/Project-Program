/*
    ✨ นายปณิธิ จ่าเหม
    📂 66040233122
*/
import java.util.Scanner;

public class ArrayDemo3 {
    public static void main(String[] args) {

        Employee emp[] = new Employee[3];

        emp[0] = new Employee();
        emp[1] = new Employee("E001", "Sompong", 30, 50000);
        emp[2] = new Employee("E002", "Somsri", 25, 60000);

        for (int i = 0; i < emp.length; i++) {
            emp[i].getInfo();
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter employee no.1 name => ");
        emp[0].setName(scanner.nextLine());

        for (int i = 0; i < emp.length; i++) {
            emp[i].getInfo();
        }
        scanner.close();
    }
}
