import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira um número inteiro positivo
        System.out.print("Digite um número inteiro positivo: ");
        int num = scanner.nextInt();

        // Assume que o número é primo inicialmente
        boolean ehPrimo = true;

        // Verifica se o número é menor ou igual a 1 (não é primo)
        if (num <= 1) {
            ehPrimo = false;
        } else {
            // Percorre os possíveis divisores do número até a raiz quadrada
            for (int i = 2; i <= Math.sqrt(num); i++) {
                // Se encontrarmos um divisor, o número não é primo
                if (num % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }
        }     
        
        // Exibe o resultado da verificação
        if (ehPrimo) {
            System.out.println(num + " é um número primo. ");
        } else {
            System.out.println(num + " não é um número primo.");
        }

        // Fecha o scanner para liberar recursos
        scanner.close();
    }
}