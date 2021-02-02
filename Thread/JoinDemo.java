public class JoinDemo extends Thread{
	public void run(){
		for(int i=1;i<=10;i++){
			System.out.println(getName()+":"+i);

		}
	}

	public static void main(String[] args) throws  InterruptedException{
		System.out.println("main is started");

		JoinDemo jd=new JoinDemo();
		jd.setName("Child-1");
		jd.start();


		JoinDemo jd1=new JoinDemo();
		jd1.setName("Child-2");
		


		jd.join();
		jd1.start();
		jd1.join();

		System.out.println("main is exited");


	}
}