package first;

public class Q7Mxs2 {
    private int numeroCandidato;
    private String nome;
    private int votos;

    public Q7Mxs2(int numeroCandidato, String nome) {
        if (numeroCandidato <= 0) {
            throw new IllegalArgumentException(
                "Número do candidato deve ser positivo.");
        }
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException(
                "Nome do candidato não pode ser vazio ou nulo.");
        }
        this.numeroCandidato = numeroCandidato;
        this.nome = nome;
        this.votos = 0;
    }

    public int getNumeroCandidato() {
        return numeroCandidato;
    }

    public String getNome() {
        return nome;
    }

    public int getVotos() {
        return votos;
    }

    public void incrementarVotos() {
        votos++;
    }

    public static void main(String[] args) {
        Q7Mxs2 candidato = new Q7Mxs2(1, "Fulano");
        candidato.incrementarVotos();
        candidato.incrementarVotos();
        System.out.println(candidato.getVotos());
    }
}
