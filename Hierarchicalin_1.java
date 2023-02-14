package inheritance;
class welcome { //parent class A
	void hello() {
		System.out.println("welcome");
	}
}
class world extends welcome { //child class 1
	void A() {
		System.out.println("hello");
	}
}
class well_done extends welcome{ //child class 2
	void B() {
		System.out.println("world");
	}
}
public class Hierarchicalin_1 {
	public static void main(String[] args) {
		well_done b = new well_done();
		b.hello();
		b.B();
		world c = new world ();
		c.hello();
		c.A();
		}

}
