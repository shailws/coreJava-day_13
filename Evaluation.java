package Day13;

class Eval{
	static int num1 = 10;
	static int num2 = 20;
	static {
		System.out.println("Addition = " + num1 + num2);
		System.out.println("Subtraction = " + (num1 - num2));
		System.out.println("Multiplication = " + num1 * num2);
		System.out.println("Division = " + num1 / num2);
		System.out.println("Modulus = " + num1 % num2);
	}
}
public class Evaluation {
	public static void main(String args[]) {
		Eval ev = new Eval();
	}
}

