class Unaryop2{
public static void main(String ...args){
int a=4;
int b=2;
//postfix & prefix for increment
System.out.println(a++);
System.out.println(++a);
//postfix & prefix for decrement
System.out.println(a--);
System.out.println(--a);

System.out.println(a++ + ++b);
System.out.println(b++ + ++a);

System.out.println(++b + b++);
System.out.println(a++ + ++a);

}}