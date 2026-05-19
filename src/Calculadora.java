public class Calculadora {

    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        System.out.println(
                "\nSoma: " + somar(a, b) +
                "\nSubtrair: " + subtrair(a, b) +
                "\nMultiplicar: " + multiplicar(a, b) +
                "\nDividir: " + dividir(a, b) +
                "\nDividir por 0: " + dividir(a, 0)
        );

    }

    public static double somar(double a, double b) {
        return a + b;
    }

    public static double subtrair(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if  (b != 0) {
            return a / b;
        } else {
            return Double.NaN ;
        }
    }
}
