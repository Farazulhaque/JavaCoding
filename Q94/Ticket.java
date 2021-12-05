package Q94;

public class Ticket {
    public int number;

    public Ticket(int number) {
        this.number = number;
    }

    public double getPrice() {
        return 55.0;
    }

    public String toString() {
        return "Number of tickets: " + this.number + ", Price per ticket: " + this.getPrice();
    }
}
