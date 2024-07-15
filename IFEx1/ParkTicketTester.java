/*
        Name: นายปณิธฺิ จ่าเหม
        No. ุ66040233122
 */
import java.util.Scanner;

    public class ParkTicketTester {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\n------------------------------");
            System.out.print("Enter date (1/2/3/4/5/6/7) => ");
            int dayEntry = scanner.nextInt();
            System.out.print("Enter time (A/B/C) => ");
            String timeEntry = scanner.next();
            System.out.print("Number of Adult => ");
            int numAdult = scanner.nextInt();
            System.out.print("Number of Children => ");
            int numChild = scanner.nextInt();

            ParkTicket ticket = new ParkTicket(dayEntry, timeEntry, numAdult, numChild);
            System.out.println("------------------------------");
            int totalPrice = ticket.computeTotal();
            System.out.println("\nTotal Price = " + totalPrice + " baht");
            System.out.println("------------------------------");

            scanner.close();
    }
}