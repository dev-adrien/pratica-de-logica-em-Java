public class ContaBancaria {
    private final String numero;
    private double saldo;

    public ContaBancaria(String numero) {
        this.numero = numero;
        this.saldo = 0.0;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        setSaldo(getSaldo() + valor);
    }

    public void sacar(double valor) {
        if (getSaldo() >= valor) {
            setSaldo(getSaldo() - valor);
            System.out.println("Saque de " + valor + " realizado com sucesso");
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual: " + getSaldo());
    }

    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("12345");
        conta1.depositar(1000);
        conta1.consultarSaldo();
        conta1.sacar(200);
        conta1.consultarSaldo();
        conta1.sacar(1000);
    }
}
