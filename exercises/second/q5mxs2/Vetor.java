package second.q5mxs2;

import java.util.Objects;

public class Vetor {
    private final double a1, a2, a3;

    public Vetor(double a1, double a2, double a3) {
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
    }

    public static Vetor fromArray(double[] valores) {
        if (valores.length != 3) {
            throw new IllegalArgumentException("O vetor deve ter exatamente 3 elementos.");
        }
        return new Vetor(valores[0], valores[1], valores[2]);
    }

    public Vetor adicionar(Vetor v) {
        return new Vetor(this.a1 + v.a1, this.a2 + v.a2, this.a3 + v.a3);
    }

    public Vetor multiplicação_Escalar(double num) {
        return new Vetor(this.a1 * num, this.a2 * num, this.a3 * num);
    }

    public double produtoEscalar(Vetor v) {
        return this.a1 * v.a1 + this.a2 * v.a2 + this.a3 * v.a3;
    }

    public double getA1() {
        return a1;
    }

    public double getA2() {
        return a2;
    }

    public double getA3() {
        return a3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Vetor))
            return false;
        Vetor vetor = (Vetor) o;
        return Double.compare(vetor.a1, a1) == 0 &&
                Double.compare(vetor.a2, a2) == 0 &&
                Double.compare(vetor.a3, a3) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a1, a2, a3);
    }

    @Override
    public String toString() {
        return String.format("(%.2f, %.2f, %.2f)", a1, a2, a3);
    }

    public static void main(String[] args) {
        Vetor v1 = new Vetor(1, 2, 3);
        Vetor v2 = new Vetor(4, 5, 6);

        Vetor v3 = v1.adicionar(v2);
        System.out.println("Soma dos Vetores: " + v3);

        Vetor v4 = v1.multiplicação_Escalar(2);
        System.out.println("Vetor v1 multiplicado por escalar: " + v4);

        double produtoEscalar = v1.produtoEscalar(v2);
        System.out.println("Produto Escalar: " + produtoEscalar);
    }
}
