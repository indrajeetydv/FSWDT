class Example2{}
class Sample2 extends Example2{}
class Test{}

class A1{
	 void m1(Example2 e){
	 	System.out.println("Example-2 arg");
	 }

	 void m1(Sample2 s){
	 	System.out.println("Sample-2 arg");
	 }

	 void m1(Test t){
	 	System.out.println("Test arg");
	 }



	 public static void main(String args[]){
	 	A1 a=new A1();
	 	a.m1(new Example2());//Example-2 arg
	 	a.m1(new Sample2());//Sample-2 arg
	 	a.m1(new Test());//Test arg"
	 	a.m1((Example2)null);//Example-2 arg
	 	a.m1((Sample2)null);//Sample-2 arg
	 	//a.m1(null);//ambigous error


	 	

	 }
}
