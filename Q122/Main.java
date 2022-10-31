package Q122;

public class Main {
	public static void main(String[] args) {
		// Math.random() * ( Max - Min )
		int prize = (int) (Math.random() * ( 10 - 1 + 1 ));
		int x = (int) (Math.random() * ( 10 - 1 + 1 ));
		while(prize != x)
		{
			String s1 = "";
			System.out.println(s1.charAt(x));\
			System.out.println(s1);
			for(int y = 0; y < 4; y++)
			{
			if wayOut[x][y] >=0	
				System.out.println(direction[y]);
			} //omit next
			System.out.println("Which direction would you like to go? ");
			choice = input.next();
			if(choice == direction[x]){
				choice = wayOut[0][0];
			}
			if(choice == 0)
			x = choice;
		}		
	}
}
