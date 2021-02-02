class MyThread implements Runnable{
	public void run(){
		for(int i=0;i<50;i++){
			System.out.println(i);
		}
	}
	public static void main(String[] args){
		MyThread mt=new MyThread();
		Thread t=new Thread(mt);
		System.out.println(Thread.currentThread().getName());
		System.out.println(t.getName());
		t.start();
	}
}