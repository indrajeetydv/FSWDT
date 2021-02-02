public class SingleThreadedModel{
	public static void main(String[] args){
		PrintNumbers pn=new PrintNumbers();
		long time1=System.currentTimeMillis();
		pn.print1To10();
		System.out.println();

		pn.print10To1();
		long time2=System.currentTimeMillis();

		System.out.println("Time taken to complete both tasks "+((time2-time1)/1000)+"secs");




	}
}