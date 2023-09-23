package in.ineuron.assignment1;

import java.util.Scanner;

public class TriangleImplShapes implements IShapes {
	Scanner scanner = null;

	@Override
	public void findArea() {

		scanner = new Scanner(System.in);
		System.out.print("Please enter the breadth of the triange : ");
		double breadth = scanner.nextDouble();
		System.out.print("Please enter the height of the triange : ");
		double height = scanner.nextDouble();
		double area = breadth * height * (0.5);
		System.out.println("Area of triangle is : " + area);

	}

	@Override
	public void findPerimeter() {
		scanner = new Scanner(System.in);
		System.out.print("Please enter the sidee A value of the triange : ");
		double a = scanner.nextDouble();
		System.out.print("Please enter the sidee B value of the triange : ");
		double b = scanner.nextDouble();
		System.out.print("Please enter the sidee C value of the triange : ");
		double c = scanner.nextDouble();
		double perimeter = a + b + c;
		System.out.println("Perimeter of triangle is : " + perimeter);

	}

}
