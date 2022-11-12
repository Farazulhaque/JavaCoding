package Q128;

public class Main {
	public static double calculateAverage(int[] intArr) {
		double avg = 0.0;
		int sum = 0;
		for (int i = 0; i < intArr.length; i++) {
			sum += intArr[i];
		}
		avg = sum / intArr.length;
		return avg;
	}

	public static double calculateAverage(double[] doubleArr) {
		double avg = 0.0;
		double sum = 0;
		for (int i = 0; i < doubleArr.length; i++) {
			sum += doubleArr[i];
		}
		avg = sum / doubleArr.length;
		return avg;
	}

	public static double calculateAverage(String[] stringArr) {
		double avg = 0.0;
		double sum = 0;
		for (int i = 0; i < stringArr.length; i++) {
			sum += Double.parseDouble(stringArr[i]);
		}
		avg = sum / stringArr.length;
		return avg;
	}

	public static void main(String[] args) {
		int[] intArr1 = { 1, 2, 3, 4, 5 };
		System.out.println(calculateAverage(intArr1));
		int[] intArr2 = { 1, 2, 3, 4, 5, 6, 7, 8 };
		System.out.println(calculateAverage(intArr2));

		double[] doubleArr1 = { 1.5, 2.1, 3.6, 4.8, 5.5 };
		System.out.println(calculateAverage(doubleArr1));
		double[] doubleArr2 = { 1.5, 2.1, 3.6, 4.8, 5.5, 6.1, 7.0, 8.9 };
		System.out.println(calculateAverage(doubleArr2));

		String[] stringArr1 = { "1.0", "2.5", "3.1", "4.1", "5.4" };
		System.out.println(calculateAverage(stringArr1));
		String[] stringArr2 = { "1.0", "2.5", "3.1", "4.1", "5.4", "6.7", "7.1", "8.9" };
		System.out.println(calculateAverage(stringArr2));

	}
}
