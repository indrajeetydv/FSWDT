enum Country{
	US{
		public String getCurrency(){
			return "DOLLAR";
		}
	},RUSSIA{
		public String getCurrency(){
			return "RUBLE";
		}
	},INDIA{
		public String getCurrency(){
			return "RUPEE";
		}
	},UK{
		public String getCurrency(){
			return "POUND";
		}
	};

	public abstract String getCurrency();
}

public class ListCurrency{
	public static void main(String args[]){
		for(Country country:Country.values()){
			System.out.println(country.getCurrency()+" is the currency of "+country.name());
		}
	}
}