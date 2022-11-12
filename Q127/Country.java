package Q127;

public class Country implements Comparable<Country> {
	public String name;
	public int area;
	public int population;
	public Country[] neighbours;

	@Override
	public int compareTo(Country o) {
		if (population > o.population) {
			return 1;
		} else if (population == o.population) {
			return 0;
		} else {
			return -1;
		}
	}

	public static void main(String[] args) {
		Country A = new Country();
		// A.population = 500;
		A.population = 600;
		// A.population = 700;
		Country B = new Country();
		B.population = 600;

		int i = A.compareTo(B);
		if (i == 0) {
			System.out.println("A = B");
		} else if (i == 1) {
			System.out.println("A > B");
		} else {
			System.out.println("A < B");
		}
	}
}
