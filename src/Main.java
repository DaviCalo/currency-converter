import converter.Converter;
import network.ApiConnection;
import network.Currency;
import view.Choose;
import view.Symbol;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        ApiConnection api = new ApiConnection();

        boolean execute = true;

        while(execute){
            Choose.main(null);
            int busca = Integer.parseInt(leitura.nextLine());
            String fromCurrency;
            String toCurrency;
            double amount;
            Currency response;
            Converter converter;

            switch (busca){
                case 1:
                    fromCurrency = Symbol.UNITED_STATES_DOLLAR;
                    toCurrency = Symbol.ARGENTINE_PESO;

                    Choose.setAmount();
                    amount = Double.parseDouble(leitura.nextLine());

                    response = api.networkApi(fromCurrency);
                    converter = new Converter(response);
                    converter.currencyConverter(toCurrency, amount);
                    break;

                case 2:
                    fromCurrency = Symbol.ARGENTINE_PESO;
                    toCurrency = Symbol.UNITED_STATES_DOLLAR;

                    Choose.setAmount();
                    amount = Double.parseDouble(leitura.nextLine());

                    response = api.networkApi(fromCurrency);
                    converter = new Converter(response);
                    converter.currencyConverter(toCurrency, amount);
                    break;

                case 3:
                    fromCurrency = Symbol.UNITED_STATES_DOLLAR;
                    toCurrency = Symbol.BRAZILIAN_REAL;

                    System.out.println("\nDigite o valor a ser convertido:");
                    System.out.print("-->");
                    amount = Double.parseDouble(leitura.nextLine());

                    response = api.networkApi(fromCurrency);
                    converter = new Converter(response);
                    converter.currencyConverter(toCurrency, amount);
                    break;

                case 4:
                    fromCurrency = Symbol.BRAZILIAN_REAL;
                    toCurrency = Symbol.UNITED_STATES_DOLLAR;

                    Choose.setAmount();
                    amount = Double.parseDouble(leitura.nextLine());

                    response = api.networkApi(fromCurrency);
                    converter = new Converter(response);
                    converter.currencyConverter(toCurrency, amount);
                    break;

                case 5:
                    fromCurrency = Symbol.UNITED_STATES_DOLLAR;
                    toCurrency = Symbol.COLOMBIAN_PESO;

                    Choose.setAmount();
                    amount = Double.parseDouble(leitura.nextLine());

                    response = api.networkApi(fromCurrency);
                    converter = new Converter(response);
                    converter.currencyConverter(toCurrency, amount);
                    break;

                case 6:
                    fromCurrency = Symbol.COLOMBIAN_PESO;
                    toCurrency = Symbol.UNITED_STATES_DOLLAR;

                    Choose.setAmount();
                    amount = Double.parseDouble(leitura.nextLine());

                    response = api.networkApi(fromCurrency);
                    converter = new Converter(response);
                    converter.currencyConverter(toCurrency, amount);
                    break;

                case 7:
                    execute = false;
                    break;

                default:
                    System.out.println("\nVocê digitou uma opção Inválida");
            }
        }
    }
}