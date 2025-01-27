package Day13;

public class Common {
	
 static class One{
	 public  void staticClass() {
		 System.out.println("This is static class message");
	 }
 }
 class Two{
	 public  void simpleClass() {
		 System.out.println("This is simple class message");
	 }
 }
 
 public static void main(String args[]) {
	 Common.One one = new  Common.One();
	 one.staticClass();
	 
	Common common = new Common();
	Common.Two two = common.new Two();
	two.simpleClass();
 }
 
}
