package inheritance;

public class MultilevelInheritance {
            //main class
	public static void main(String[] args) {
		SIChild2 child = new SIChild2();  //create a object of child class
		child.display();
		child.show();
		child.print();
		}
}
class SIParent1{ //parent class
	void show() { //parent class user defined method
		System.out.println("show the salary");
	}
}
//child class of SIParent & parent class of SIChild2
class SIChild1 extends SIParent1{
	void display() {  //child class user defined method
		System.out.println("display the name");
	}
}
class SIChild2 extends SIChild1 {  //child class
	void print() {  //child class user defined method
		System.out.println("print the output");
	}
}