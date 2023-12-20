public class Coins {
	public static void main(String[] args) {
		
		int coins_num = Integer.parseInt(args[0]);
		int cents_num = (coins_num % 25);
		int quarters_num = ((coins_num - cents_num)/25);

		System.out.println("Use " + quarters_num + " quarters and " + cents_num + " cents" );
		
	}
}