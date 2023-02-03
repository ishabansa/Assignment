//write a java program to convert minutes into a number of years and days.
package Assignment;
import java.util.Scanner;

public class Convert {
	public static void main(String[] args) {
		Scanner input= new Scanner (System.in);
		System.out.println("Input the number of minutes : ");
		int min = input.nextInt();  
		//here the min will convert in the year
		int years= (int)(min/(60*24*365));
		//and minute will convert in the day
		int days =(int)(min/60/24)%365;
		System.out.println(min + " minutes : "+ years + " years and "+ days + " days ");
	}

}
