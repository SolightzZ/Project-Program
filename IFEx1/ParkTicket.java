/*
        Name: นายปณิธฺิ จ่าเหม
        No. ุ66040233122
 */
    public class ParkTicket {
        private int dayEntry;
        private String timeEntry;
        private int numAdult;
        private int numChild;

    public ParkTicket(int dayEntry, String timeEntry, int numAdult, int numChild) {
        this.dayEntry = dayEntry;
        this.timeEntry = timeEntry;
        this.numAdult = numAdult;
        this.numChild = numChild;
    }

    public int computeTotal() {
        int ticketPrice = 0;

        if (dayEntry >= 1 && dayEntry <= 5) {
            if (numAdult > 0) {
                ticketPrice += numAdult * 250;
            }
            if (numChild > 0) {
                ticketPrice += numChild * 150;
            }
        } else if (dayEntry == 6 || dayEntry == 7)
            {
            if (timeEntry.equals("A")) {
                if (numAdult > 0) {
                    ticketPrice += numAdult * 300;
                }
                if (numChild > 0) {
                    ticketPrice += numChild * 180;
                }
            } else if (timeEntry.equals("B")) {
                if (numAdult > 0) {
                    ticketPrice += numAdult * 350;
                }
                if (numChild > 0) {
                    ticketPrice += numChild * 250;
                }
            } else if (timeEntry.equals("C")) {
                if (numAdult > 0) {
                    ticketPrice += numAdult * 400;
                }
                if (numChild > 0) {
                    ticketPrice += numChild * 300;
                }
            }
        }
        return ticketPrice;
    }
}