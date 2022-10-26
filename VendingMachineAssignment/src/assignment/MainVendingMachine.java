package assignment;

import java.util.Scanner;

public class MainVendingMachine {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		SnacksVendingMachineInterface snackMachine = 
				new SnacksVendingMachineImplementation();
		
		snackMachine.displaySnackVendingMachineItems();
		int selectedItem = scan.nextInt();
		snackMachine.validateIfSnackIsavailable(selectedItem);
		snackMachine.selectSnackNumber(selectedItem);
	
		int selectedPayMethod = selectPaymentMethod();
		snackMachine.displayInsertMoney(selectedPayMethod);
		scan.nextLine();
	    String selectedCoinsInString = scan.nextLine();
	    int[] money = Coin.parseSelectedCoins(selectedCoinsInString);
	    int changeAmount = snackMachine.insertMoneyIntoMachine(selectedPayMethod,
	    		money);
	    snackMachine.calculateChangeAmountMoney(changeAmount);
	    snackMachine.displayReturnMoneyMessage();
			
		System.out.println("Pick Your Snack Plz");
		System.exit(1);
		
		

	}
	public static int selectPaymentMethod(){
		Scanner scan = new Scanner(System.in);
		while(true) {
		System.out.println("How do you want to pay\n"
				+ "1-CoinSlot: There are four denominations: • 10c • 20c • 50c • $1:\n"
				+ "2-Notes Slot :20$ and 50$ only\n"
				+ "3-CardSlot : all cards accepted");
		int selectedPayMethod = scan.nextInt();
		if(selectedPayMethod == 3)
		{
			System.out.println("The transaction will done in bank thank u");
			System.exit(1);
		}
		if(selectedPayMethod == 1 || selectedPayMethod==2)
			return selectedPayMethod;
		
		}
		
	}
	
	
	

}
