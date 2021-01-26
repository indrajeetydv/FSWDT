interface Vehical{
	void engine();
	void breaks();
}

abstract class Bus implements Vehical{
	public void breaks(){
		System.out.println("Bus has two breaks");
	}
	
}

class RedBus extends Bus{
	public void engine(){
		System.out.println("RedBus engine capacity is 40 Kmph.");
	}
}

class VolvoBus extends Bus{
	public void engine(){
		System.out.println("VolvoBus engine capacity is 110 Kmph.");
	}
}

class Driver{
	public static void main(String[] args){
		Vehical v;
		v=new RedBus();
		v.engine();//RedBus engine capacity is 40 Kmph.
		v.breaks();//Bus has two breaks

		v=new VolvoBus();
		v.engine();//VolvoBus engine capacity is 110 Kmph.
		v.breaks();//Bus has two breaks


	}
}