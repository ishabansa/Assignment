//example of using default & parameterized constructor (same code)
package method;

public class DefaultParaCons {
	DefaultParaCons(){  //creating a default constructer 
		System.out.println("Default & parameterized constructor");
	}
	int sub;
	DefaultParaCons(int a,int b){   
		//parameterized constructor created subtract of 2 no
		sub=a-b;
	}
	void show() {
		System.out.println("subtraction is: "+sub);
	}
	public static void main(String[]args) {  //main method
		DefaultParaCons c=new DefaultParaCons();   //calling a default constructor
		DefaultParaCons obj=new DefaultParaCons(80,70);
		obj.show();
	}

}
