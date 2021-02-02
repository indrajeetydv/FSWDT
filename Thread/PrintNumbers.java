class PrintNumbers{

	void print1To10(){
		for(int i=1;i<=10;i++){
			System.out.println(i+"\t");
			try{
				Thread.sleep(1000);
			}catch(InterruptedException ie){
				ie.printStackTrace();
			}
		}
	}

	void print10To1(){
		for(int i=10;i>0;i--){
			System.out.println(i+"\t");
			try{
				Thread.sleep(1000);
			}catch(InterruptedException ie){
				ie.printStackTrace();
			}
		}
	}

}


