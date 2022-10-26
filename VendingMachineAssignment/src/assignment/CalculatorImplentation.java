package assignment;

public class CalculatorImplentation implements CalculatorInterface {


	public int[] calculateChangeMoney(int amountMoneyToReturn) {
		int [] returnMoney = new int[6]; //10c, 20c, 50c, 1$=100c, 20$=2000c, 50$=5000c
		
        int remainingAmount = amountMoneyToReturn;
        
        returnMoney[5] = remainingAmount / Coin.FIVE_THOUSAND_CENTS.getCoinVlaue();
        remainingAmount = remainingAmount % Coin.FIVE_THOUSAND_CENTS.getCoinVlaue();

        returnMoney[4] = remainingAmount / Coin.TWO_THOUSAND_CENTS.getCoinVlaue();
        remainingAmount = remainingAmount % Coin.TWO_THOUSAND_CENTS.getCoinVlaue();
        
        returnMoney[3] = remainingAmount / Coin.HUNDRED_CENTS.getCoinVlaue();
        remainingAmount = remainingAmount % Coin.HUNDRED_CENTS.getCoinVlaue();

        returnMoney[2] = remainingAmount / Coin.FIFTY_CENTS.getCoinVlaue();
        remainingAmount = remainingAmount % Coin.FIFTY_CENTS.getCoinVlaue();

        returnMoney[1] = remainingAmount / Coin.TWENTY_CENTS.getCoinVlaue();
        remainingAmount = remainingAmount % Coin.TWENTY_CENTS.getCoinVlaue();

        returnMoney[0] = remainingAmount / Coin.TEN_CENTS.getCoinVlaue();
        remainingAmount = remainingAmount % Coin.TEN_CENTS.getCoinVlaue();
        
		return returnMoney;
	}


}
