import java.io.Closeable;
import java.io.IOException;

public enum ThreadStatesEnum  implements Closeable{
	START(10){
		@Override
		public String toString(){
			return "START implementation. Priority="+getPriority();
		}

		@Override
		public String getDetail() {
			return "START-THREAD";
		}
	},
	RUNNING(20){
		@Override
		public String getDetail() {
			return "RUNNING-THREAD";
		}
	},
	WAITING(30){
		@Override
		public String getDetail() {
			return "WAITING-THREAD";
		}
	},
	DEAD(40){
		@Override
		public String getDetail() {
			return "DEAD-THREAD";
		}
	};
	
	private int priority;
	
	public abstract String getDetail();
	//Enum constructors should always be private.
	private ThreadStatesEnum(int i){
		priority = i;
	}
	
	//Enum can have methods
	public int getPriority(){
		return this.priority;
	}
	
	public void setPriority(int p){
		this.priority = p;
	}
	
	//Enum can override functions
	@Override
	public String toString(){
		return "Default ThreadStatesConstructors implementation. Priority="+getPriority();
	}

	@Override
	public void close() throws IOException {
		System.out.println("Close of Enum");
	}

	public static void main(String args[]){
		ThreadStatesEnum[] threadStates=ThreadStatesEnum.values();
		
		for(ThreadStatesEnum threadState:threadStates){
			System.out.print(threadState.name()+"..."+threadState.getDetail()+"..."+threadState.toString()+"...");			
			System.out.println(threadState.getPriority());
		}


	}

}
