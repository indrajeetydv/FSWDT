package p2;

import static p1.Example1.*;

public class Sample1{
	public static void main(String[] args){
		//accessing static members without using classname
		System.out.println(a);
		m1();

		//accessing static members with classname
		System.out.println(p1.Example1.a);
		p1.Example1.m1();

		//accessing non-static members
		p1.Example1 e=new p1.Example1();
		System.out.println(e.x);
		e.m2();
	}
}