class Add{
	/*int x,y;

	synchronized void add(int x,int y){
		this.x=x;
		this.y=y;

		int result=this.x+this.y;
		System.out.println(Thread.currentThread().getName()+" result: "+result);
	}*/

	synchronized void print1To10(){
		for(int i=1;i<=10;i++){
			System.out.println(i+"\t");
			/*try{
				Thread.sleep(1000);
			}catch(InterruptedException ie){
				ie.printStackTrace();
			}*/
		}
	}

	synchronized void print10To1(){
		for(int i=10;i>0;i--){
			System.out.println(i+"\t");
			/*try{
				Thread.sleep(1000);
			}catch(InterruptedException ie){
				ie.printStackTrace();
			}*/
		}
	}
}

class Thread1 extends Thread{
	Add a;
	Thread1(Add a){
		this.a=a;
	}

	public void run(){
		a.print1To10();
	}
}


class Thread2 extends Thread{
	Add a;
	Thread2(Add a){
		this.a=a;
	}
	public void run(){
		a.print10To1();
	}
}

public class AddTestDemo{
	public static void main(String[] args){
		Add a =new Add();
		new Thread1(a).start();
		new Thread2(a).start();


	}
}