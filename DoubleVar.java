//that accepts 2 double variables and test if both strictly between 0 and 1 and otherwise false
package Assignment;
import java.util.*;
public class DoubleVar {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number :"); 
		double num1=sc.nextDouble();
		System.out.println("Enter the second number :"); 
		double num2=sc.nextDouble();
		System.out.println((num1>0 && num1<1)&&(num2>0 && num2<1));
	}

}
