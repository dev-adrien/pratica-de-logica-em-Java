import java.sql.SQLOutput;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        System.out.println(
                "1 – Cadastrar\n" +
                "2 – Consultar\n" +
                "3 – Atualizar\n" +
                "4 – Excluir");
        int n = input.nextInt();
        switch (n) {
            case 1:
                System.out.println("Você selecionou [Cadastrar]!");
                break;
            case 2:
                System.out.println("Você selecionou [Consultar]!");
                break;
            case 3:
                System.out.println("Você selecionou [Atualizar]!");
                break;
            case 4:
                System.out.println("Você selecionou [Excluir]!");
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
}
