package oneandtwo;

import java.util.Scanner;

public class Two_5 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter an integer for seconds: ");
		int seconds=input.nextInt();
		int minutes=seconds/60;
		int remain=seconds%60;
		System.out.println(seconds+" is "+minutes+" minutes "+remain+" seconds ");

	}

}
