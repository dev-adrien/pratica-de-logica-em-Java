public class Retangulo {
    private final int largura;
    private final int altura;

    Retangulo(int largura, int altura){
        this.largura = largura;
        this.altura = altura;
    }

    public int getLargura() {
        return largura;
    }

    public int getAltura() {
        return altura;
    }

    public void calcularArea() {
        System.out.println("Área do retângulo: " + (getLargura() * getAltura()));
    }

    public void calcularPerimetro() {
        System.out.println("Perímetro do retângulo: " + (2 * (getLargura() + getAltura())));
    }

    public static void main(String[] args) {
        Retangulo r1 = new Retangulo(5, 3);
        r1.calcularArea();
        r1.calcularPerimetro();
    }
}
