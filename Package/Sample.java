package p2;
import  p1.Example1;
import static p1.Example1.*;

public class Sample{
	public static void main(String[] args){
		//accessing static members without using classname
		System.out.println(a);
		m1();

		//accessing static members with classname
		System.out.println(Example1.a);
		Example1.m1();

		//accessing non-static members
		Example1 e=new Example1();
		System.out.println(e.x);
		e.m2();
	}
}