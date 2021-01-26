public class OverloadingTest{
	int add(int a,int b){
		return a+b;
	}
	int add(int a,int b,int c){
		return a+b+c;
	}
	int add(int a,int b,int c,int d){
		return a+b+c+d;
	}
	int add(int a,int b,int c,int d,int f){
		return a+b+c+d+f;
	}

	public static void main(String[] args){
		OverloadingTest test=new OverloadingTest();
		System.out.println(test.add(10,20));
		System.out.println(test.add(10,20,30));
		System.out.println(test.add(10,20,30,40));
		System.out.println(test.add(10,20,30,40,50));

	}
}

