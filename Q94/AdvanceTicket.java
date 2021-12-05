package Q94;

public class AdvanceTicket extends Ticket {
    public int daysInAdvance;

    public AdvanceTicket(int number, int daysInAdvance) {
        super(number);
        this.daysInAdvance = daysInAdvance;
    }

    public double getPrice() {
        if (daysInAdvance >= 10) {
            return 30.00;
        } else {
            return 60.00;
        }
    }
}
