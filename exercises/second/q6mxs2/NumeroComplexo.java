package second.q6mxs2;

public class NumeroComplexo {
    private final double real;
    private final double imaginario;

    public NumeroComplexo(double real, double imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }

    public NumeroComplexo adicionar(NumeroComplexo c) {
        return new NumeroComplexo(this.real + c.real, this.imaginario + c.imaginario);
    }

    public NumeroComplexo subtrair(NumeroComplexo c) {
        return new NumeroComplexo(this.real - c.real, this.imaginario - c.imaginario);
    }

    public NumeroComplexo multiplicar(NumeroComplexo c) {
        double novoReal = this.real * c.real - this.imaginario * c.imaginario;
        double novoImaginario = this.real * c.imaginario + this.imaginario * c.real;
        return new NumeroComplexo(novoReal, novoImaginario);
    }

    @Override
    public String toString() {
        if (imaginario >= 0) {
            return String.format("%.2f + %.2fi", real, imaginario);
        } else {
            return String.format("%.2f - %.2fi", real, -imaginario);
        }
    }

    public static void main(String[] args) {
        NumeroComplexo z = new NumeroComplexo(3, 2);
        NumeroComplexo w = new NumeroComplexo(1, -4);

        System.out.println("Soma: " + z.adicionar(w));
        System.out.println("Subtração: " + z.subtrair(w));
        System.out.println("Multiplicação: " + z.multiplicar(w));
    }
}
