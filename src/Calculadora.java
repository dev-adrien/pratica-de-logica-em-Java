import java.util.Scanner;

public class Calculadora {

    private double a;
    private double b;

    public final String result = "\n======= Resultado ========\n";

    public Calculadora(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Calculadora() {}

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public static void main(String[] args) {
        System.out.println("==== Calculadora Simples ====");
        Scanner sc = new Scanner(System.in);
        Calculadora calc = new Calculadora();
        System.out.println("Digite o primerio valor: ");
        calc.setA(sc.nextDouble());
        System.out.print("Digite a operação: " +
                "\n 1 - Somar" +
                "\n 2 - Subtrair" +
                "\n 3 - Multiplicar" +
                "\n 4 - Dividir\n");
        int op = sc.nextInt();
        System.out.println("Digite o segundo valor: ");
        calc.setB(sc.nextDouble());

        System.out.println(calc.result);
        switch (op) {
            case 1 -> calc.somar(calc.getA(), calc.getB());
            case 2 -> calc.subtrair(calc.getA(), calc.getB());
            case 3 -> calc.multiplicar(calc.getA(), calc.getB());
            case 4 -> calc.dividir(calc.getA(), calc.getB());
            default -> System.out.println("Operação inválida!");
        }
    }

    public void somar(double a, double b) {

        System.out.println(a + b);
    }

    public void subtrair(double a, double b) {
        System.out.println(a - b);
    }

    public void multiplicar(double a, double b) {
        System.out.println(a * b);
    }

    public void dividir(double a, double b) {
        if  (b != 0) {
            System.out.println(a / b);
        } else {
            System.out.println("Não é possível dividir por zero!");
        }
    }
}
