
import java.util.Scanner;
public class Fatorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("==== Calculadora de Fatorial ====");
        System.out.print("Digite um número inteiro positivo: ");
        int f = input.nextInt();
        System.out.println("=================================");
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result *= i;
        }
        System.out.println("Fatorial de " + f + ": " + result);
    }
}
