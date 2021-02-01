public class ThreadDemo1 extends Thread{
	public void run(){
		for(int i=0;i<=5;i++){

			System.out.println(i+" ");
		}
	}

	public static void main(String args[]) {
		ThreadDemo1 td=new ThreadDemo1();
		td.run();

		
		ThreadDemo td1=new ThreadDemo();
		
		td1.run();


		ThreadDemo td2=new ThreadDemo();
		
		td2.run();

	}
}