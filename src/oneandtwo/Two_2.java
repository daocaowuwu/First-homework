package oneandtwo;

import java.util.Scanner; //导入Scanner类

public class Two_2 {

	public static void main(String[] args) {
		double radius;
		double area;
		//radius=20;
		Scanner input=new Scanner(System.in);//创建一个Scanner类
		radius=input.nextDouble();  //用户输入
	area=radius*radius*3.14159;
	System.out.println("The area for the circle of radius "+radius+" is "+area);
	input.close();

	}

}
