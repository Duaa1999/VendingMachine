package assignment;

public interface SnacksVendingMachineInterface {
	
	public void displaySnackVendingMachineItems();
	public void selectSnackNumber(int item);
	public void validateIfSnackIsavailable(int selectedItem);
	public void displayInsertMoney(int selectedPayMethod);
	public int insertMoneyIntoMachine(int selectedPayMethod, int[] money);
	public void calculateChangeAmountMoney(int changeAmount);
	public void displayReturnMoneyMessage();

}
