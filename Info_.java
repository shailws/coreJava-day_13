package Day13;

import java.util.Scanner;

public class Info_ {
	 static class One{
		 
		 static String name;
		 static int age;
		 
			public void getdata() {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter your name : ");
				 name = sc.nextLine();
				System.out.println("Enter your age : ");
				 age = sc.nextInt();
			}
			public void showdata() {
				System.out.println("Your name is : "+ name);
				System.out.println("Your name is : "+ age);
			}
	 }
	 public static void main(String args[]) {
		 Info_ out = new Info_();
		 Info_.One on = new  Info_.One();
		 on.getdata();
		 on.showdata();
		 
	 }
}
