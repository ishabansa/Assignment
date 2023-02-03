//write a java program that accepts two integers from the user and then integer, the maximum(the larger of the two integers)
//the minimum(smaller of the two integers)
package Assignment;
import java.util.Scanner;
public class IntLarSma {
	public static void main(String[] args) {
		int n1,n2;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first integer :"); 
		n1 = sc.nextInt();
	    System.out.print("Enter second integer :"); 
	    n2 = sc.nextInt();
		if(n1>n2) {
			System.out.println("Maximum number is:"+n1);
			}
		else {
			System.out.println("Maximum number is:"+n2);	}
		if(n1<n2) {
			System.out.println("Minimun number is:"+n1);
			}
		else {
			System.out.println("Minimum number is:"+n2);
			}
	}
}
