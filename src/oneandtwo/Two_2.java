package oneandtwo;

import java.util.Scanner; //����Scanner��

public class Two_2 {

	public static void main(String[] args) {
		double radius;
		double area;
		//radius=20;
		Scanner input=new Scanner(System.in);//����һ��Scanner��
		radius=input.nextDouble();  //�û�����
	area=radius*radius*3.14159;
	System.out.println("The area for the circle of radius "+radius+" is "+area);
	input.close();

	}

}
