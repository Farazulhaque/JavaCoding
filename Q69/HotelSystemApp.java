package Q69;

import java.util.Scanner;

class Room {
    String roomType;
    int noOfBed;
    double price;
    int noOfRoom;

    public Room() {
        this.roomType = "";
        this.noOfBed = 0;
        this.price = 0;
        this.noOfRoom = 0;
    }

    public Room(String roomType, int noOfBed, double price, int noOfRoom) {
        this.roomType = roomType;
        this.noOfBed = noOfBed;
        this.price = price;
        this.noOfRoom = noOfRoom;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNoOfBed() {
        return noOfBed;
    }

    public void setNoOfBed(int noOfBed) {
        this.noOfBed = noOfBed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNoOfRoom() {
        return noOfRoom;
    }

    public void setNoOfRoom(int noOfRoom) {
        this.noOfRoom = noOfRoom;
    }

    public double calculatePrice() {
        if (noOfBed == 1) {
            roomType = "Single";
            price = 150;
        } else if (noOfBed == 2) {
            roomType = "Double";
            price = 300;
        } else if (noOfBed == 4) {
            roomType = "Family";
            price = 500;
        } else if (noOfBed == 6) {
            roomType = "Suite";
            price = 800;
        }
        double totalPrice = price * noOfRoom;
        return totalPrice;
    }

}

public class HotelSystemApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Room r1 = new Room();
        System.out.println("Welcome to Hotel System");

        int again = 1;
        while (again == 1) {

            System.out.print("Enter no of beds: ");
            int noOfBed = sc.nextInt();

            System.out.print("How many room? ");
            int noOfRoom = sc.nextInt();

            r1.setNoOfBed(noOfBed);
            r1.setNoOfRoom(noOfRoom);

            double totalPrice = r1.calculatePrice();

            System.out.println(noOfRoom + " " + r1.roomType + " Room, the total price is " + totalPrice);
            System.out.print("Would you like to book another room (1: Yes, 0: No)? ");
            again = sc.nextInt();
            System.out.println();
        }
        System.out.println("Thank you...");
        sc.close();
    }
}
