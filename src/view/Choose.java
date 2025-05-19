package view;

public class Choose {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("******************** Conversor de moeda *********************");
        System.out.println("1. Dólar => Peso Argentino");
        System.out.println("2. Peso Argentino => Dólar");
        System.out.println("3. Dólar => Real Brasileiro");
        System.out.println("4. Real Brasileiro => Dólar");
        System.out.println("5. Dólar => Peso Colombiano");
        System.out.println("6. Peso Colombiano => Dólar");
        System.out.println("7. Sair");
        System.out.println();
        System.out.println("Escolha uma das opções acima para a conversão:");
        System.out.print("-->");
    }

    public static void setAmount(){
        System.out.println("\nDigite o valor a ser convertido:");
        System.out.print("-->");
    }
}
