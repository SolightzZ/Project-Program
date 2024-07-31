/*
    ✨ นายปณิธิ จ่าเหม
    📂 66040233122
 */
import java.util.Scanner;

public class StudentGradeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentGrade[] students = new StudentGrade[1];

        for (int i = 0; i < students.length; i++) {
            System.out.println("✦ ------------- ⋆⋅☆⋅⋆ ------------- ✦");

            System.out.print("ID : ");
            String id = scanner.nextLine();

            System.out.print("Name : ");
            String name = scanner.nextLine();

            System.out.print("Midterm Score : ");
            int midterm = scanner.nextInt();

            System.out.print("Final Exam Score : ");
            int finalExam = scanner.nextInt();
            scanner.nextLine();

            students[i] = new StudentGrade(id, name);
            students[i].setScore(midterm, finalExam);
        }

        System.out.println("\n++++++++++++++ Student Grade Report +++++++++++++++++\n");
        System.out.println("-------------------------------------------------------");
        System.out.printf(" %-10s %-20s %-10s %-5s%n", "ID", "Name", "Score", "Grade");
        System.out.println("-------------------------------------------------------");
        for (StudentGrade student : students) {
            System.out.printf(" %-10s %-20s %-10d %-5s%n", student.getId(), student.getName(), student.getScore(), student.getGrade());
        }
        scanner.close();
    }
}
