package Ganesh_lec_march;

public class MoneyTransfer {
	public static void main(String[] args) {

		int accntbalnce = 10000;
		int transferbalnce = 300000;

		if (accntbalnce >transferbalnce) {
			System.out.println("insufficint money . pls check your balance ");

			throw new InsufficientBalanceException();

		}
		else {
			System.out.println("money transfer succsesfuly");
		}
	}

}
