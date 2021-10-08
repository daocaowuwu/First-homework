package oneandtwo;

import java.util.Scanner;

public class Two_4 {

	public static void main(String[] args) {
		final double PI=3.1415926;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number for radius: ");
		double radius=input.nextDouble();
		double area=radius*radius*PI;
		System.out.print("The area for the circle of radius "+radius+" is ");
		System.out.println(area);
	}

}
