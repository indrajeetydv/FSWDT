public class CurrentThreadDemo{
	public static void main(String[] args){
		System.out.println("\n Main method");

		Thread t=Thread.currentThread();
		System.out.println("\nOriginal name and priority");
		System.out.println(t.getName());//[main]
		System.out.println(t.getPriority());//5

		t.setName("XXYY");
		t.setPriority(7);
		System.out.println("\nModified name and priority");
		System.out.println(t.getName());//[main]
		System.out.println(t.getPriority());//5
	}
}