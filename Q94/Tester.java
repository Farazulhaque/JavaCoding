package Q94;

import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        Ticket walkupTicket = new WalkupTicket(7);
        System.out.println((int) walkupTicket.getPrice());

        StudentAdvanceTicket studentAdvanceTicket = new StudentAdvanceTicket(6, 10);
        System.out.println(studentAdvanceTicket.number);

        ArrayList<Ticket> tickets = new ArrayList<>();
        tickets.add(new WalkupTicket(3));
        tickets.add(new AdvanceTicket(10, 12));
        tickets.add(new AdvanceTicket(1, 1));
        tickets.add(new StudentAdvanceTicket(13, 12));
        tickets.add(new StudentAdvanceTicket(1, 1));
        double count = 0;
        double studentCount = 0;

        for (int i = 0; i < tickets.size(); i++) {
            Ticket ticket = tickets.get(i);
            if (ticket instanceof StudentAdvanceTicket) {
                if (((StudentAdvanceTicket) ticket).daysInAdvance < 10) {
                    studentCount = studentCount + (ticket.number * ticket.getPrice());
                    count = count + studentCount;
                }
            } else if (ticket instanceof AdvanceTicket) {
                if (((AdvanceTicket) ticket).daysInAdvance < 10) {
                    count = count + (ticket.number * ticket.getPrice());
                }
            } else {
                count = count + (ticket.number * ticket.getPrice());
            }
            System.out.println((int) (count));
            System.out.println((int) studentCount);
        }
    }
}
