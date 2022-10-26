package assignment;

public class SnacksVendingMachineImplementation implements SnacksVendingMachineInterface {

	
	private int selectedSnackNumber, total, delta;
	int [] returnMoney = new int[6]; //10c, 20c, 50c, 1$=100c, 20$=2000c, 50$=5000c

	@Override
	public void displaySnackVendingMachineItems() {
		
		for(Snack snack : Snack.values())
		{	
			System.out.print(snack.getSelectedNumber() + "-" + snack.name()+"  ");
			if(snack.getSelectedNumber() % 3 == 0)
				System.out.println();		
		}
		System.out.println("Please Enter Your favorite snack");

	}

	@Override
	public void selectSnackNumber(int selectedSnackNumber) {
		this.selectedSnackNumber = selectedSnackNumber;
		
	}

	@Override
	public void validateIfSnackIsavailable(int selectedSnackNumber) {
		boolean availableSnack = false;
		for(Snack snack : Snack.values())
			if(snack.getSelectedNumber() == selectedSnackNumber)
				{
				 availableSnack = true;
				 System.out.println(snack.name() +" is available and the "
				 		+ "Price is " + snack.getPrice());
				}
		if(!availableSnack) {
			System.out.println("not available snack");
			System.exit(1);
//			throw new IllegalArgumentException("not available snack");
		}
		
	}

	@Override
	public void displayInsertMoney(int selectedPayMethod) {
		if(selectedPayMethod==1)
			System.out.println("Please insert your amount with these values"
					+ " (10c/20c/50c/1$): and plz in this formate"
					+ "for example 1 2 3 0 \n mean we have one coin from 10c"
					+ "and 2 coin from 20c and 3 coin from 50c and 0 coin from 1$");
		else if(selectedPayMethod==2)
			System.out.println("Please insert your amount with these values"
					+ " (20$ / 50$): and plz in this formate"
					+ "for example 1 2 mean \n we have one from 20$"
					+ "and 2 from 50$");
		else
			{System.out.println("this method of pay not exist");
			System.exit(1);}
		
	}

	@Override
	public int insertMoneyIntoMachine(int selectedPayMethod, int[] money) {
		//the length of money to make sure that you are placed in the existing categories
		if(selectedPayMethod == 1 && money.length == 4)
			return insertCoins(money);
		if(selectedPayMethod == 2 && money.length == 2)
			return insertDollarCoins(money);
		else
			{
			System.out.println("You must enter money from the existing category");
			System.exit(1);
			return -1;
			}
				
	}
	
	public int insertCoins(int[] coins) {
		Snack snack = Snack.getSnackValues(selectedSnackNumber);
		CoinBundle coin = new CoinBundle(coins);
	    total = coin.getTheTotalCoins();
		if(total < snack.getPrice())
			{
			System.out.println("The coins less than the price of snack");
			System.exit(1);
			//throw new IllegalArgumentException("The coins less than the price of snack");
			}
		delta = total - snack.getPrice();
		return delta;		
				
	}
	
	
	public int insertDollarCoins(int[] dollars) {
		Snack snack = Snack.getSnackValues(selectedSnackNumber);
		DollarCoinBundle dollarsCoins = new DollarCoinBundle(dollars);
	    total = dollarsCoins.getTheTotalDollarCoins();
	    if(total < snack.getPrice())
		{
		System.out.println("The coins less than the price of snack");
		System.exit(1);
		//throw new IllegalArgumentException("The coins less than the price of snack");
		}
		delta = total - snack.getPrice();
		return delta;		
	}
	
	
	public void calculateChangeAmountMoney(int changeAmount) {
		CalculatorInterface calculator = new CalculatorImplentation();
		returnMoney = calculator.calculateChangeMoney(changeAmount);
		
	}


	@Override
	public void displayReturnMoneyMessage() {
		System.out.println();
        System.out.println("Your Origin mount is :"+ total +"cents and the change is "
        		+delta + "cents splitted as follows: ");
        System.out.println("    50$=5000c : "+ returnMoney[5]);
        System.out.println("    20$=2000c : "+ returnMoney[4]);
        System.out.println("    1$=100c : "+ returnMoney[3]);
        System.out.println("    50 cents coins: "+ returnMoney[2]);
        System.out.println("    20 cents coins: "+ returnMoney[1]);
        System.out.println("    10 cents coins: "+ returnMoney[0]);
		
	}
	

}
