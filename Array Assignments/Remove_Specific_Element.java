//write a java program to remove a specific element from an array
package Assignment;
import java.util.*;
public class Remove_Specific_Element {
public static void main(String[] args) {
			// TODO Auto-generated method stub
				System.out.println("Enter the Lenght of Array");
				Scanner sc =new Scanner(System.in);
				int ln=sc.nextInt();
				int a[]=new int[ln];
				System.out.println("enter the element ");
				for(int i =0;i<ln;i++) {
					
					
					a[i]=sc.nextInt();
				
				}
				System.out.println("Element of Array is ");
				for(int i =0;i<ln;i++) {
					System.out.println(a[i]);
					
				}
				
				System.out.println("Enter the index value to be deleted ");
				int m=sc.nextInt();
				int b[]=new int[ln-1];  // new array to store value after deleted
				for(int i =0;i<ln;i++) {
					
					if(i<m) {
						b[i]=a[i];  // copy the value in second array
					}
					else if(i==m)
						continue;
					else {
						b[i-1]=a[i];
					}
				}
				
				System.out.println("After deletionArray is ");
				for(int i =0;i<ln;i++) {
					System.out.println(b[i]);	
		}

		}}
