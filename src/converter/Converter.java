package converter;

import network.Currency;

import java.util.Map;

public class Converter {
    private final String fromCurrency;
    private final Map<String, Double> conversion_rates;

    public Converter(Currency currency) {
        this.fromCurrency = currency.base_code();
        this.conversion_rates = currency.conversion_rates();
    }

    public void currencyConverter(String toCurrency, double amount){
        Double exchange = conversion_rates.get(toCurrency);
        double calcule = amount * exchange;
        System.out.println();
        System.out.printf("%s %s é equivalente a %s %s%n", amount, this.fromCurrency, calcule, toCurrency);
    }


    public String getFromCurrency() {
        return fromCurrency;
    }

    public Map<String, Double> getConversion_rates() {
        return conversion_rates;
    }
}
