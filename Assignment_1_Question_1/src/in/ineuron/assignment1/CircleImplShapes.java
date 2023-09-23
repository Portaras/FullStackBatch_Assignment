package in.ineuron.assignment1;

import java.util.Scanner;

public class CircleImplShapes implements IShapes {
	Scanner scanner = null;
	public static final double pi = 3.14;
	double radius = 0.0;

	@Override
	public void findArea() {
		scanner = new Scanner(System.in);
		System.out.print("Please enter the radius to find the Area of circle : ");
		radius = scanner.nextDouble();
		double area = pi * (radius * radius);
		System.out.println("Area of circle is : " + area);

	}

	@Override
	public void findPerimeter() {
		scanner = new Scanner(System.in);
		if (radius == 0.0) {
			System.out.print("Please enter the radius to find the perimeter of circle : ");
			radius = scanner.nextDouble();
		}
		double perimeter = 2 * pi * radius;

		System.out.println("Perimeter of circle is : " + perimeter);

	}

}
