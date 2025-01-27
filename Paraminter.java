package Day13;

import java.util.Scanner;

public class Paraminter {
static class Rectangle{
	public static double parameter(double length, double width) {
		double peri = 2*(length + width);
		return peri;
	}
}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter lenght of rectangle : ");
		double n1 = sc.nextDouble();
		System.out.println("Enter width of rectangle : ");
		double n2 = sc.nextDouble();
		Paraminter.Rectangle rec = new Paraminter.Rectangle();
		double result = rec.parameter(n1,n2);
		
		System.out.println("Parameter of rectangle is : " + result);
	}
}
