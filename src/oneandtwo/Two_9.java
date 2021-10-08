package oneandtwo;

import java.util.Scanner;

public class Two_9 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out .print("Enter annual interest rate :");
		double annualinterestrate=input.nextDouble();
		double monthlyinterestrate=annualinterestrate/1200;
		System.out.print("Enter number of years as an integer :");
		int numberofyears=input.nextInt();
		System.out.print("Enter loan amount :");
		double loanamount=input.nextDouble();
		double monthlypayment=loanamount*monthlyinterestrate/(1-1/Math.pow(1+monthlyinterestrate, numberofyears*12));
		double totalpayment=monthlypayment*numberofyears*12;
		System.out.println("The monthly payment is $"+(int)(monthlypayment*100)/100.0);
		System.out.println("The total payment is $"+(int)(totalpayment*100)/100.0);

	}

}
