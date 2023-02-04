//write a java program to break an integer into a sequence of individual digits.
package Assignment;
import java.util.*;

public class IndividualDigit {
	public static void main(String[] args) {
		//getting the number from user
				Scanner sc=new Scanner(System.in);
				System.out.print("Enter the integer number : ");
				int num=sc.nextInt();
		        int temp=num;
		        int num1=0;
		        int count=0;
		        
		        while(temp>0)
		        {
			          count++;
		            temp=temp/10;
	         	}
		temp=num;
		while(temp>0)
		{
			num1=temp/(int)Math.pow(10,count-1);
			System.out.print(num1 + " ");
			temp=temp%(int)Math.pow(10,count-1);
			--count;
		}
		}
	}
