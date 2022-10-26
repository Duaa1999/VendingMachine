package assignment;

public enum Coin {
	TEN_CENTS(10),  TWENTY_CENTS(20), FIFTY_CENTS(50), HUNDRED_CENTS(100) // = 1$
	, TWO_THOUSAND_CENTS(2000) // = 20$ = 20 * 100
	, FIVE_THOUSAND_CENTS(5000); // = 50$ = 50 * 100
	
	private int value;
	
	Coin(int value)
	{
		this.value = value;
	}
	
	public int getCoinVlaue() {
		return this.value;
	}
	
	
	public static int[] parseSelectedCoins(String selectedCoinsInString)
	{
		String [] coins = selectedCoinsInString.split(" ");
		int [] selectedCoins = new int[coins.length];
		for(int i=0; i< coins.length;i++) {
			selectedCoins[i] = Integer.parseInt(coins[i]);
		}
		
		return selectedCoins;
			
			
	}
	

}
