/*
    รหัสนักษา : 66040233122
    ชื่อ-นามสกุล : นายปณฺิธิ จ่าเหม
 */
import java.util.Scanner;

public class Forgender {
    public static void main(String[] args) {
        char gender;
        int Male = 0, Female = 0, Other = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("------ For Gender ------\n");
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter gender (M/F): ");
            gender = scanner.next().charAt(0);

            if (gender == 'M' || gender == 'm') {
                Male++;
            } else if (gender == 'F' || gender == 'f') {
                Female++;
            } else {
                Other++;
            }
        }

        System.out.println("++++++++++++ For Gender +++++++++++\n");
        System.out.println("    Gender          Number");
        System.out.println("--------------------------------------");
        System.out.println("    Male            " + Male);
        System.out.println("    Female          " + Female);
        System.out.println("    Other           " + Other);
        System.out.println("---------------------------------------");
    }
}
