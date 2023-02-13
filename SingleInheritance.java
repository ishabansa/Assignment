package inheritance;

public class SingleInheritance {  //main class
	public static void main(String[] args) {
		SIChild child = new SIChild();   //create a object of child class
		child.display();
		child.salary();
		}}
class SIParent { //parent class
	void salary() {  //parent class user defined method
		System.out.println("show the salary");
	}
}
class SIChild extends SIParent {  //child class
	void display() {  //child class user defined method
		System.out.println("display the result");
	}
}
