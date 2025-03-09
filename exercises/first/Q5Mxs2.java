package first;

public class Q5Mxs2 {
    private final int numeroPedido;
    private String nomeCliente;
    private double valorTotal;

    public Q5Mxs2(int numeroPedido, String nomeCliente, double valorTotal) {
        if (numeroPedido <= 0) {
            throw new IllegalArgumentException(
                "Número do pedido deve ser positivo.");
        }
        if (nomeCliente == null || nomeCliente.trim().isEmpty()) {
            throw new IllegalArgumentException(
                "Nome do cliente não pode ser vazio ou nulo.");
        }
        if (valorTotal < 0) {
            throw new IllegalArgumentException(
                "O valor total não pode ser negativo.");
        }
        this.numeroPedido = numeroPedido;
        this.nomeCliente = nomeCliente;
        this.valorTotal = valorTotal;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        if (nomeCliente == null || nomeCliente.trim().isEmpty()) {
            throw new IllegalArgumentException(
                "Nome do cliente não pode ser vazio ou nulo.");
        }
        this.nomeCliente = nomeCliente;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        if (valorTotal < 0) {
            throw new IllegalArgumentException(
                "O valor total não pode ser negativo.");
        }
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return String.format(
            "Pedido {numeroPedido=%d, nomeCliente='%s', valorTotal=%.2f}",
            numeroPedido, nomeCliente, valorTotal);
    }

    public static void main(String[] args) {
        Q5Mxs2 pedido = new Q5Mxs2(1, "João Silva", 150.75);
        System.out.println(pedido);
    }
}
