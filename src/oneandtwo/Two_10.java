package oneandtwo;

import java.util.Scanner;

public class Two_10 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter an amount in double :");
		double amount=input.nextDouble();
		int remainingamount=(int)(amount*100);
		int numberofonedollars=remainingamount/100;
		remainingamount=remainingamount%100;
		int numberofquarters=remainingamount/25;
		remainingamount=remainingamount%25;
		int numberofdimes=remainingamount/10;
		remainingamount=remainingamount%10;
		int numberofnickels=remainingamount/5;
		remainingamount=remainingamount%5;
		int numberofpennies=remainingamount;
		System.out.println("Your amount "+amount+" consists of");
		System.out.println(" "+numberofonedollars+" dollars");
		System.out.println(" "+numberofquarters+" quarters");
		System.out.println(" "+numberofdimes+" dimes");
		System.out.println(" "+numberofnickels+" nickels");
		System.out.println(" "+numberofpennies+" pennies");
	}

}
