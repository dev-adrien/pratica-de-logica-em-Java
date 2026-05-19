public class Aluno {
    private final String nome;
    private final double nota;

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }

    public void aprovado() {
        if (getNota() >= 7) {
            System.out.println("Aluno " + getNome() + " aprovado com nota " + getNota());
        } else {
            System.out.println("Aluno " + getNome() + " reprovado com nota " + getNota());
        }
    }

    public String conceito() {
        if (getNota() >= 9) {
            return "A";
        } else if (getNota() >= 7 && getNota() < 9) {
            return "B";
        } else if (getNota() < 7) {
            return "C";
        }
        return "";
    }

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Felipe", 6.9);
        aluno1.aprovado();
        System.out.println("Nota: " + aluno1.conceito());
    }
}
