import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        System.out.println("Oi, tudo bem?");
        System.out.println("\nQuantos anos vc tem?");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if (i < 18) {
            System.out.println("Você é menor de idade.");
        } else {
            System.out.println("Você é maior de idade.");
        }
    }
}
