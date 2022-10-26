package assignment;

public enum Snack {
	TWIXYY(1,50), LIOONS(2,50), LAYS(3,20), 
	GALAXY(4,40), BUBBLY(5,30), DORETUZ(6,20), 
	SA3EED(7,10), KITKAT(8,60), SNICKERS(9,10);
	
	private int selectedNumber, price;
	
	Snack(int selectedNumber, int price){
		this.selectedNumber = selectedNumber;
		this.price = price;
	}
	
	public int getSelectedNumber(){
        return this.selectedNumber;
    }

    public int getPrice(){
        return this.price;
    }
    
   public static Snack getSnackValues(int selectedSnackNumber)
   {
		for(Snack snack : Snack.values())
			if(snack.getSelectedNumber() == selectedSnackNumber)
				return snack;
		return null;
				
		
			
		
   }
	

}
