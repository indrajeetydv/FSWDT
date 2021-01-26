enum Course{
	C,CPP,JAVA,DOTNET,Angular,React,Vue
}

class IETTechnology{
	public static void main(String[] args){
		Course[] courses=Course.values();

		for(Course course:courses){
			System.out.println(course.name());
			System.out.println("...");
			System.out.println(course.ordinal());
		}

	}
}