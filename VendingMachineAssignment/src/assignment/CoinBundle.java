package assignment;

public class CoinBundle {
    public int number10cCoins;
    public int number20cCoins;
    public int number50cCoins;
    public int number100cCoins; // equal to 1$

    public CoinBundle(int[] insertedCoins) {
        this.number10cCoins = insertedCoins[0];
        this.number20cCoins = insertedCoins[1];
        this.number50cCoins = insertedCoins[2];
        this.number100cCoins = insertedCoins[3];
    }
    
    public int getTheTotalCoins() {
    	int totalCoins = 0;
    	totalCoins += number10cCoins*10;
    	totalCoins += number20cCoins*20;
    	totalCoins += number50cCoins*50;
    	totalCoins += number100cCoins*100;
    	
    	return totalCoins;
    	
    }
    
}