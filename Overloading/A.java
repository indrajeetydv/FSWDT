class Example1{}
class Sample1 extends Example1{}

class A{
	 void m1(Example1 e){
	 	System.out.println("Example-1 arg");
	 }

	 void m1(Sample1 s){
	 	System.out.println("Sample-1 arg");
	 }

	 public static void main(String args[]){
	 	A a=new A();
	 	a.m1(new Example1());//Example-1 arg
	 	a.m1(new Sample1());//Sample-1 arg
	 	//a.m1("abc");//CTE
	 	a.m1(null);//Sample-1 arg


	 	Example1 e1=new Example1();
	 	Example1 e2=new Sample1();
	 	Sample1 s1=new Sample1();
	 	Example1 e3=null;
	 	Sample1 s2=null;

	 	a.m1(e1); //Example-1 arg
	 	a.m1(e2);//  Example-1 arg
	 	a.m1(s1);// Sample-1 arg
	 	a.m1(e3);// Example-1 arg
	 	a.m1(s2);//Sample-1 arg

	 }
}

//overriding - inheritance relation: Superclass subclass
//overloading- within a class
// hiding: inheritance relation: Superclass subclass but method should be static
// Example1 e=null;
// Sample1 s=null;