public class MultiThreadsThreadedModel extends Thread{
	static PrintNumbers pn=new PrintNumbers();

	public void run(){
		pn.print1To10();
	}

	public static void main(String[] args){


		MultiThreadsThreadedModel mt=new MultiThreadsThreadedModel();
		long time1=System.currentTimeMillis();
		mt.start();
		System.out.println();
		pn.print10To1();
		long time2=System.currentTimeMillis();

		System.out.println("Time taken to complete both tasks "+((time2-time1)/1000)+"secs");

	}
}