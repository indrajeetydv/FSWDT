class MyThread1 extends Thread{
	
	MyThread1(){}

	MyThread1(String name){
		super(name);
	}

	public void run(){
		for(int i=0;i<5;i++){
			System.out.println(getName()+" i: "+i);
		}
	}
}

public class ThreadNameAndPriority{
	public static void main(String[] args){
		MyThread1 mt1=new MyThread1();
		MyThread1 mt2=new MyThread1("child");

		/*System.out.println("mt1 thread's intial name and priority");
		System.out.println(mt1.getName());//[Thread-0]
		System.out.println(mt1.getPriority());//5
	
		System.out.println();

		System.out.println("mt2 thread's intial name and priority");
		System.out.println(mt2.getName());//[child]
		System.out.println(mt2.getPriority());//5


		mt1.setName("child-1");
		mt1.setPriority(6);
		mt2.setPriority(9);


		System.out.println("mt1 thread's changed name and priority");
		System.out.println(mt1.getName());//[child-1]
		System.out.println(mt1.getPriority());//6

		System.out.println();
		System.out.println("mt2 thread's changed name and priority");
		System.out.println(mt2.getName());//[child]
		System.out.println(mt2.getPriority());//9*/
		mt1.setName("child-1");
		mt1.setPriority(6);//child-1
		mt2.setPriority(9);//child

		mt1.start();//6
		mt2.start();//9

//main-5
		for(int i=1;i<=10;i++){
			System.out.println("main i: "+i);
		}
	}
}