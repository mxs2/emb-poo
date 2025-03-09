package second;

public class Q1Mxs2 {
    private String especie;
    private int idade;
    private boolean vacinado;
    private double preco;
    private String descricao;

    public Q1Mxs2(String especie, int idade, boolean vacinado, double preco, String descricao) {
        if (especie == null || especie.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Espécie não pode ser vazia ou nula.");
        }
        if (idade < 0) {
            throw new IllegalArgumentException(
                    "Idade não pode ser negativa.");
        }
        if (preco < 0) {
            throw new IllegalArgumentException(
                    "Preço não pode ser negativo.");
        }
        this.especie = especie;
        this.idade = idade;
        this.vacinado = vacinado;
        this.preco = preco;
        this.descricao = descricao;
    }

    public String getEspecie() {
        return especie;
    }

    public int getIdade() {
        return idade;
    }

    public boolean isVacinado() {
        return vacinado;
    }

    public double getPreco() {
        return preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public static void main(String[] args) {
        Q1Mxs2 animal = new Q1Mxs2("Cachorro", 5, true, 1000.0, "Vira-lata");
        System.out.println("Espécie: " + animal.getEspecie());
        System.out.println("Idade: " + animal.getIdade());
        System.out.println("Vacinado: " + animal.isVacinado());
        System.out.println("Preço: " + animal.getPreco());
        System.out.println("Descrição: " + animal.getDescricao());
    }
}
