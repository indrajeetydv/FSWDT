enum Months{
	JAN(10),FEB(16),MARCH(19);
	
	private int num;

	Months(int num){
		this.num=num;
	}

	//getter and setter methods
	public int getNum(){
		return num;
	}

	public void setNum(int num){
		this.num=num;
	}
}

class Years{
	public static void main(String[] args){
		Months[] months=Months.values();

		for(Months month:months){
			System.out.print(month.name()+"...");			
			System.out.println(month.getNum());
		}
	}
}