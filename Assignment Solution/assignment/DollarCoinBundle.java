package assignment;

public class DollarCoinBundle {
	
	    public int number2000cCoins; // equal 20$
	    public int number5000cCoins; // equal 50$

	    public DollarCoinBundle(int[] insertedCoins) {
	        this.number2000cCoins = insertedCoins[0];
	        this.number5000cCoins = insertedCoins[1];
	        
	    }
	    
	    public int getTheTotalDollarCoins() {
	    	int totalCoins = 0;
	    	totalCoins += number2000cCoins*2000;
	    	totalCoins += number5000cCoins*5000;   	
	    	return totalCoins;
	    	
	    }
	    

}
