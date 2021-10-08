package oneandtwo;

import java.util.Scanner;

public class Two_3 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double number1=input.nextDouble();
		double number2=input.nextDouble();
		double number3=input.nextDouble();
		double averge;
		averge=(number1+number2+number3)/3;
		System.out.print("The averge of "+number1+" "+number2+" "+number3+" is "+averge);
		input.close();

	}

}