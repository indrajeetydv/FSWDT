/*enum Animal{
	DOG
}*/

enum Animal{
	DOG{
		public String toString(){
			return "dog";
		}
	}
}

public class AnimalTest{
	public static void main(String[] args){
		//System.out.println(Animal.DOG.toString()==Animal.DOG.name());
		System.out.println(Animal.DOG);//dog
		System.out.println(Animal.DOG.name());//DOG
	}
}

