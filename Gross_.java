package Day13;

import java.util.Scanner;

public class Gross_ {
	public static void gross(double sal){
		double bonus = (40.0/100)*sal;
		double gsal = sal + bonus;
		System.out.println("Gross salary is : " + gsal);
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter basic salary : ");
		double salary = sc.nextDouble();
		gross(salary);
	}
}
