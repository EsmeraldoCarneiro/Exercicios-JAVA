import java.util.Scanner;

public class SomaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira o primeiro número inteiro
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        // Solicita ao usuário que insira o segundo número inteiro
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        // Calcula a soma dos números
        int soma = num1 + num2;

        // Exibe o resultado da soma
        System.out.println("A soma dos números é: " + soma);

        // Fecha o scanner para liberar recursos
        scanner.close();
    }
}
