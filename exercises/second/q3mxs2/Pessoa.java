package second.q3mxs2;

public class Pessoa {
    private String nome;
    private int idade;
    private double altura;
    private double peso;
    private char sexo;

    public Pessoa(String nome, int idade, double altura, double peso, char sexo) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser vazio ou nulo.");
        }
        if (idade < 0) {
            throw new IllegalArgumentException("Idade não pode ser negativa.");
        }
        if (altura <= 0) {
            throw new IllegalArgumentException("Altura deve ser positiva.");
        }
        if (peso <= 0) {
            throw new IllegalArgumentException("Peso deve ser positivo.");
        }
        if (sexo != 'M' && sexo != 'F') {
            throw new IllegalArgumentException("Sexo deve ser 'M' ou 'F'.");
        }
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.sexo = sexo;
    }

    public double calcularIMC() {
        return peso / (altura * altura);
    }

    @Override
    public String toString() {
        double imc = calcularIMC();
        String categoria;

        if (imc <= 18.5) {
            categoria = "Abaixo do peso normal";
        } else if (imc <= 25) {
            categoria = "Peso Normal";
        } else if (imc <= 30) {
            categoria = "Acima do peso normal";
        } else {
            categoria = "Obesidade";
        }

        return "Nome: " + nome + ", Idade: " + idade + ", Altura: " + altura +
                ", Peso: " + peso + ", Sexo: " + sexo + ", IMC: " + String.format("%.2f", imc) +
                " - Categoria: " + categoria;
    }
}
