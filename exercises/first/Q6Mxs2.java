package first;

public class Q6Mxs2 {
    private String numeroPlaca;
    private String nomeDono;
    private String modelo;
    private String fabricante;
    private double valorMercado;

    public Q6Mxs2(String numeroPlaca, String nomeDono, String modelo,
        String fabricante, double valorMercado) {
        if (numeroPlaca == null || numeroPlaca.trim().isEmpty()) {
            throw new IllegalArgumentException(
                "Número da placa não pode ser vazio ou nulo.");
        }
        if (nomeDono == null || nomeDono.trim().isEmpty()) {
            throw new IllegalArgumentException(
                "Nome do dono não pode ser vazio ou nulo.");
        }
        if (modelo == null || modelo.trim().isEmpty()) {
            throw new IllegalArgumentException(
                "Modelo não pode ser vazio ou nulo.");
        }
        if (fabricante == null || fabricante.trim().isEmpty()) {
            throw new IllegalArgumentException(
                "Fabricante não pode ser vazio ou nulo.");
        }
        if (valorMercado < 0) {
            throw new IllegalArgumentException(
                "O valor de mercado não pode ser negativo.");
        }
        this.numeroPlaca = numeroPlaca;
        this.nomeDono = nomeDono;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.valorMercado = valorMercado;
    }

    public String getNumeroPlaca() {
        return numeroPlaca;
    }

    public String getNomeDono() {
        return nomeDono;
    }

    public void setNomeDono(String nomeDono) {
        if (nomeDono == null || nomeDono.trim().isEmpty()) {
            throw new IllegalArgumentException(
                "Nome do dono não pode ser vazio ou nulo.");
        }
        this.nomeDono = nomeDono;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo == null || modelo.trim().isEmpty()) {
            throw new IllegalArgumentException(
                "Modelo não pode ser vazio ou nulo.");
        }
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        if (fabricante == null || fabricante.trim().isEmpty()) {
            throw new IllegalArgumentException(
                "Fabricante não pode ser vazio ou nulo.");
        }
        this.fabricante = fabricante;
    }

    public double getValorMercado() {
        return valorMercado;
    }

    public void setValorMercado(double valorMercado) {
        if (valorMercado < 0) {
            throw new IllegalArgumentException(
                "O valor de mercado não pode ser negativo.");
        }
        this.valorMercado = valorMercado;
    }

    @Override
    public String toString() {
        return String.format(
            "Veículo {numeroPlaca='%s', nomeDono='%s', modelo='%s', "
                + "fabricante='%s', valorMercado=%.2f}",
            numeroPlaca, nomeDono, modelo, fabricante, valorMercado);
    }

    public static void main(String[] args) {
        Q6Mxs2 veiculo =
            new Q6Mxs2("ABC-1234", "João Silva", "Gol", "Volkswagen", 15000.00);
        System.out.println(veiculo);
    }
}
