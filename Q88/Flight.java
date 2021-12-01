package Q88;

abstract class CombatAircraft {
    String model;
    double weight;
    String maxSpeed;
    String weapon;

    public CombatAircraft() {
        this.weight = 0;
        this.model = "";
        this.maxSpeed = "";
        this.weapon = "";
    }

    public abstract void attack();
}

class JetFighter extends CombatAircraft {
    double maxAltitude;

    public JetFighter(String m, double wt, String sp, String w, double maxAlt) {
        model = m;
        weight = wt;
        maxSpeed = sp;
        weapon = w;
        maxAltitude = maxAlt;
    }

    @Override
    public void attack() {
        System.out.println(model + " began the attack right below " + maxAltitude + " feet");

    }

}

class StarFighter extends CombatAircraft {
    String shieldType;

    public StarFighter(String m, double wt, String sp, String w, String stype) {
        model = m;
        weight = wt;
        maxSpeed = sp;
        weapon = w;
        shieldType = stype;
    }

    @Override
    public void attack() {
        System.out.println(model + " hax fired a " + weapon + " and the " + shieldType + " is still on. ");

    }
}

public class Flight {
    public static void main(String[] args) {
        JetFighter jf = new JetFighter("F-35", 29900, "Mach 1.6", "missle", 50000);
        StarFighter sf = new StarFighter("X-Wing", 39900, "1,050kph", "laser cannon", "Particle Shield");

        jf.attack();
        sf.attack();
    }
}
