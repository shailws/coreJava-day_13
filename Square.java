package Day13;

import java.util.Scanner;

public class Square {
	public static double side;
	public static double area;
	
	static {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter side of square : ");
		side = sc.nextDouble();
		area = side * side;
	}
	
	public static void main(String args[]) {
		System.out.println("Area of square : " + area);
	}
}
