enum Country2{
	US("DOLLAR"), RUSSIA("RUBLE"), INDIA("RUPEE");
    private String currency;
 
    private Country2(String currency) {
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

public class ListCurrency2{
	public static void main(String args[]){

        /*Country country = Country.INDIA;
      switch (country) {
          case INDIA:
              System.out.println("Currency of INDIA: " + country.getCurrency());
              break;
          case RUSSIA:
              System.out.println("Currency of RUSSIA: " + country.getCurrency());
              break;
          case US:
              System.out.println("Currency of US: " + country.getCurrency());
              break;
      }*/

		for(Country2 country:Country2.values()){
			switch (country) {
                  case INDIA:
                      System.out.println("Currency of INDIA: " + country.getCurrency());
                      break;
                  case RUSSIA:
                      System.out.println("Currency of RUSSIA: " + country.getCurrency());
                      break;
                  case US:
                      System.out.println("Currency of US: " + country.getCurrency());
                      break;
              }
		}

        //using terniary operator
        String country_name = null;
        Country2 country = country_name != null ? Country2.INDIA : Country2.RUSSIA;
        System.out.println("Country : " + country.name());
        System.out.println("Currency : " + country.getCurrency());
	}
}