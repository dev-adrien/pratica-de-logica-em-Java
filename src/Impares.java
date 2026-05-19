import java.util.Scanner;

public class Impares {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um intervalo:");
        System.out.println("Inicio:");
        int inicio = input.nextInt();
        System.out.println("Fim:");
        int fim = input.nextInt();

        System.out.println("Números ímpares entre " + inicio + " e " + fim + ": ");
        while (inicio <= fim) {
            if (inicio % 2 != 0) {
                System.out.print(inicio + " ");
            }
            inicio++;
        }
    }
}
