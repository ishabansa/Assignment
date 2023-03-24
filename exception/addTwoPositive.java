package Exception_handling;

import java.util.Scanner;

		
	public class addTwoPositive{
		
		public static int addTwoPositive(int a, int b) throws ArithmeticException {
		    if (a <= 0 || b <= 0) {
		        throw new ArithmeticException("Non-positive integer sent");
		    }
		    return a + b;
		}
		public static void main(String[] args) {
		    int a = 5;
		    int b = 2;
		    try {
		        int sum = addTwoPositive(a, b);
		        System.out.println("The sum of " + a + " and " + b + " is " + sum);
		    } catch (ArithmeticException e) {
		        System.out.println("Error: " + e);
		    }
		}


}