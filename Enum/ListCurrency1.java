enum Country1{
	US("DOLLAR"), RUSSIA("RUBLE"), INDIA("RUPEE");
    private String currency;
 
    private Country1(String currency) {
        this.currency = currency;
    }
 
    public String getCurrency() {
        return currency;
    }
 
    @Override
    public String toString() {
        return currency;
    }
}

public class ListCurrency1{
	public static void main(String args[]){
		for(Country1 country:Country1.values()){
			System.out.println(country.getCurrency()+" is the currency of "+country.name());
		}
	}
}