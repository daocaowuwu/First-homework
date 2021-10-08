package oneandtwo;

import java.util.Scanner;

public class Two_8 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number for amount: ");
		double amount=input.nextDouble();
		double tax=amount*0.06;
		System.out.println("Sales tax is $"+(int)(tax*100)/100.0);  //取两位小数，若要最后一位》=5时向上取小数则tax*100+0.5
		

	}

}
