package p1;
public class A {
	private int a=10;
	int b=20;
	protected int c=30;
	public int d=40;

	public static void main(String[] args){
		A ex=new A();
		System.out.println("a: "+ex.a);
		System.out.println("b: "+ex.b);
		System.out.println("c: "+ex.c);
		System.out.println("d: "+ex.d);
	}
}