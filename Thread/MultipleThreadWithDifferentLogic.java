class AddThread extends Thread{
	public void run(){
		for(int i=1;i<=10;i++){
			System.out.println(i);
		}
	}
}

class SubThread extends Thread{
	public void run(){
		for(int i=10;i>0;i--){
			System.out.println(i);
		}
	}
}



public class MultipleThreadWithDifferentLogic{
	public static void main(String[] args){
		System.out.println("main thread started");
		AddThread at=new AddThread();
		at.start();
		SubThread st=new SubThread();
		st.start();
		System.out.println("main thread exited");


	}
}