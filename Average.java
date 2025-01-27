package Day13;

import java.util.Scanner;

public class Average {
	class Inner{
		public double avg(double m1, double m2, double m3) {
			double average = (m1 + m2 + m3) / 3;
			return average;
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Sciece marks : ");
		double n1 = sc.nextDouble();
		System.out.println("Enter Biology marks : ");
		double n2 = sc.nextDouble();
		System.out.println("Enter Math marks : ");
		double n3 = sc.nextDouble();
		
		Average avg1 = new Average();
		Average.Inner inner = avg1.new Inner();
		double result =  inner.avg(n1, n2, n3);
		
		System.out.println("Average of marks is : " + result);
		
		
	}
}
