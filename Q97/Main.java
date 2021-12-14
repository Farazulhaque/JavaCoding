package Q97;

abstract class Plant {
    void smell() {
        System.out.println("nothing");
    }
}

class Flower extends Plant {
    void smell() {
        System.out.println("good");
    }
}

class Fruit extends Plant {
    void smell() {
        System.out.println("yummy");
    }
}

class Lily extends Plant {
    void smell() {
        System.out.println("nice");
    }
}

class Rose extends Plant {
    void smell() {
        System.out.println("sweet");
    }
}

public class Main {
    public static void main(String[] args) {
        Plant[] p = new Plant[3];
        p[0] = new Rose();
        p[1] = new Lily();
        p[2] = new Fruit();

        for (Plant plant : p) {
            plant.smell();
        }
        System.out.println("-------");
        Plant plant;
        new Flower().smell();
        // System.out.println("-------");
        // Cannot instantiate the type Plant
        // Plant plant = new Plant();
        // Cannot make a static reference to the non-static method smell()
        // Plant.smell();
        System.out.println("-------");
        Plant f = (Plant) (new Fruit());
        f.smell();

        System.out.println("-------");
        // Flower cannot be cast to Fruit
        // Plant f = new Flower();
        // ((Fruit) f).smell();

        System.out.println("-------");
        // Rose cannot be cast to class Flower
        // Plant f = new Rose();
        // ((Flower) f).smell();
    }
}