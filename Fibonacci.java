import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira o número de termos desejado
        System.out.print("Digite o número de termos da sequência Fibonacci: ");
        int n = scanner.nextInt();

        // Define os dois primeiros termos da sequência
        int primeiroTermo = 0;
        int segundoTermo = 1;

        // Exibe os primeiros dois termos
        System.out.print("Sequência de Fibonacci: " + primeiroTermo + " " + segundoTermo);

        // Gera os próximos termos da sequência usando um loop
        for (int i = 2; i < n; i++) {
            int proximoTermo = primeiroTermo + segundoTermo;
            System.out.print(" " + proximoTermo);

            // Atualiza os valores dos termos anteriores
            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;
        }

        // Fecha o scanner para liberar recursos
        scanner.close();
    }
    
}
