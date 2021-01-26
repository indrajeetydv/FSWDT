enum Month{
	JAN,FEB,MARCH
}

/*final class Month extends java.lang.Enum<Month> {
  public static final Month JAN;
  public static final Month FEB;
  public static final Month MARCH;
  public static Month[] values();
  public static Month valueOf(java.lang.String);
  private Month(String s,int i){
	super(s,i);
  }
  static {
	JAN=new Month("JAN",0);
	FEB=new Month("FEB",1);
	MARCH=new Month("MARCH",2);
  };
}*/

class Year{
	public static void main(String[] args){
		System.out.println(Month.JAN);
		System.out.println(Month.FEB);
		System.out.println(Month.MARCH);

		


	}
}