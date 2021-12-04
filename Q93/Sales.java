package Q93;

import java.util.Scanner;

public class Sales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int salary = 1200;
        int bonus;
        System.out.println("Masukkan nama penjual: ");
        String name = sc.next();
        System.out.println("Masukkan jumlah jualan bulan ini: ");
        int sales = sc.nextInt();
        if (sales > 1000) {
            System.out.println("Yeay..dpt Bonus RM200");
            bonus = 200;
        } else {
            System.out.println("Yeay..dpt Bonus RM100");
            bonus = 100;
        }
        System.out.println("Name: " + name);
        System.out.println("Gaji bulan ini termasuk bonus adalah: " + (salary + bonus));
        sc.close();
    }
}
