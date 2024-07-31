/*
    รหัสนักศึกษา : 66040233122
    ชื่อ-นามสกุล : นายปณฺิธิ จ่าเหม
 */

import java.util.Scanner;

public class whlieGender {
    public static void main(String[] args) {
        char gender = ' ';
        int Male = 0, Female = 0, all = 0, Other = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("------ Whlie Gender ------\n");
        while (true) {
            System.out.print("Enter gender (M/F) Or Stop (-) =>   ");
            gender = scanner.next().charAt(0);

            if (gender == '-') {
                break;
            }

            if (gender == 'M' || gender == 'm') {
                Male++;
            } else if (gender == 'F' || gender == 'f') {
                Female++;
            } else {
                Other++;
            }
            all++;
        }
        System.out.println("\n +++++++++++++ Whlie Gender +++++++++++++++ \n");
        System.out.println("    Gender            Number");
        System.out.println("--------------------------------------");
        System.out.println("    Male                " + Male);
        System.out.println("    Female              " + Female);
        System.out.println("    Other               " + Other);
        System.out.println("    All                 " + all);
        System.out.println("---------------------------------------");
    }
}
