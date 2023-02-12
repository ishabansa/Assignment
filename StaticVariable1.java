package method;

public class StaticVariable1 {
	int age;
	int rollno;
	String name;
	float fee;
	static String college="IIMT";
	StaticVariable1(int age,int rollno,String name,float fee){
		this.age=age;
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;
		}
	void display() {
		System.out.println(age+rollno+" "+name+" "+fee+" "+college);
	}
	public class Assement{
		public static void main(String[] args) {
			StaticVariable1 s1=new
					StaticVariable1(23,111,"ISHA",5000);
			StaticVariable1 s2=new
					StaticVariable1(24,555,"YASHI",6000);
			s1.display();
			s2.display();
		}
	}

}
