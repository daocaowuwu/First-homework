package oneandtwo;

import java.util.Scanner;

public class Two_8 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number for amount: ");
		double amount=input.nextDouble();
		double tax=amount*0.06;
		System.out.println("Sales tax is $"+(int)(tax*100)/100.0);  //ȡ��λС������Ҫ���һλ��=5ʱ����ȡС����tax*100+0.5
		

	}

}
