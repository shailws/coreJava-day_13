package Day13;

public class Called {
	
	public static void staticMethod() {
		System.out.println("This is static method");
	}
	public void nonaStaticMethod() {
		System.out.println("This is non static method");
	}
	
	public static void main(String args[]) {
		
		staticMethod();
		
		Called c = new Called();
		c.nonaStaticMethod();
	}
}
