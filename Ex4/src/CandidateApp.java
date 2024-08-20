/*
        ✨ นายปณิธิ จ่าเหม
        📂 66040233122
 */
import java.util.Scanner;

public class CandidateApp {
    public static void main(String[] args) {
        Candidate[][] candidates = new Candidate[7][7];
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("\n✦ --------- ⋆⋅ Menu ⋅⋆ ---------- ✦");
            System.out.println("    1 : Add Candidate");
            System.out.println("    2 : Display examination seat plan.");
            System.out.println("    3 : Search Candidate.");
            System.out.println("    4 : Exit program.");
            System.out.print(" Select menu choice => ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1: addCandidate(candidates, scanner); break;
                case 2: displaySeatingChart(candidates); break;
                case 3: searchCandidate(candidates, scanner); break;
                case 4: System.out.println("Exiting..."); break;
                default: System.out.println("    Invalid option.");
            }
        } while (option != 4);
        scanner.close();
    }

    private static void addCandidate(Candidate[][] candidates, Scanner scanner) {
        System.out.println("Enter candidate data....");
        System.out.print("    Enter ID => ");
        String id = scanner.nextLine();
        System.out.print("    Enter Name => ");
        String name = scanner.nextLine();
        System.out.print("    Enter Major => ");
        String major = scanner.nextLine();

        for (int i = 0; i < candidates.length; i++) {
            for (int j = 0; j < candidates[i].length; j++) {
                if (candidates[i][j] != null && candidates[i][j].getId().equals(id)) {
                    System.out.println("-----------------------------");
                    System.out.println("    Enter Duplicate ID!!");
                    System.out.println("-----------------------------\n");
                    return;
                }
            }
        }
        for (int i = 0; i < candidates.length; i++) {
            for (int j = 0; j < candidates[i].length; j++) {
                if (candidates[i][j] == null) {
                    candidates[i][j] = new Candidate(id, name, major);
                    System.out.println("-----------------------------");
                    System.out.println("    Add Candidate completed");
                    System.out.println("-----------------------------\n");
                    return;
                }
            }
        }System.out.println("There is no more space to add.");
    }

    private static void displaySeatingChart(Candidate[][] candidates) {
        System.out.println("\n✦ ------------------------------- ⋆⋅☆⋅⋆ ------------------------------------ ✦");
        for (int col = 0; col < candidates[0].length; col++) {
            System.out.printf("       %-4d", col + 1);
        }System.out.println("\n✦ ------------------------------- ⋆⋅☆⋅⋆ ------------------------------------ ✦");

        for (int i = 0; i < candidates.length; i++) {
            System.out.printf("  %-1d  :\t", i + 1);

            for (int j = 0; j < candidates[i].length; j++) {
                if (candidates[i][j] == null) {
                    System.out.printf("%-10s", "NULL");
                } else {
                    System.out.printf("%-10s", candidates[i][j].getName() + "(" + candidates[i][j].getId() + ")");
                }
            }System.out.println();
        }System.out.println("✦ -------------------------------------------------------------------------- ✦");
    }

    private static void searchCandidate(Candidate[][] candidates, Scanner scanner) {
        System.out.println("\n******** Find Candidate detail ************");
        System.out.print("    Enter Candidate ID to find ==> ");
        String id = scanner.nextLine();

        boolean found = false;
        for (int i = 0; i < candidates.length; i++) {
            for (int j = 0; j < candidates[i].length; j++) {
                if (candidates[i][j] != null && candidates[i][j].getId().equals(id)) {
                    System.out.println("----------------------------");
                    candidates[i][j].displayCandidate(    );
                    System.out.println("----------------------------\n");
                    found = true;
                    break;
                }
            }if (found) break;
        }
        if (!found) {
            System.out.println("    -----------------------------");
            System.out.println("        No Candidate found!!");
            System.out.println("    -----------------------------\n");
        }
    }
}