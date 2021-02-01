public class ThreadDemo extends Thread{
	public void run(){
		for(int i=0;i<=5;i++){

			System.out.println(i+" ");
		}
	}

	public static void main(String args[]) throws InterruptedException{
		ThreadDemo td=new ThreadDemo();
		td.start();

		
		ThreadDemo td1=new ThreadDemo();
		Thread.sleep(10000);
		td1.start();


		ThreadDemo td2=new ThreadDemo();
		Thread.sleep(20000);
		td2.start();



	}
}