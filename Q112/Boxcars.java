package Q112;

public class Boxcars {
	public static void main(String[] args) {
		int dice1 = 0;
		int dice2 = 0;
		dice1 = 1 + (int) (Math.random() * 6);
		dice2 = 1 + (int) (Math.random() * 6);
		System.out.println("Rolled " + dice1 + ", " + dice2);
		int attempt = 1;
		while (dice1 != 6 || dice2 != 6) {
			dice1 = 1 + (int) (Math.random() * 6);
			dice2 = 1 + (int) (Math.random() * 6);
			System.out.println("Rolled " + dice1 + ", " + dice2);
			attempt++;
		}
		System.out.print("It took " + attempt + " attempts to roll a 12");
	}
}