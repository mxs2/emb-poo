package second;

public class Q2Mxs2 {
    private double base;
    private double altura;

    public Q2Mxs2(double base, double altura) {
        if (base <= 0) {
            throw new IllegalArgumentException("A base do retângulo deve ser positiva.");
        }
        if (altura <= 0) {
            throw new IllegalArgumentException("A altura do retângulo deve ser positiva.");
        }
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        if (base <= 0) {
            throw new IllegalArgumentException("A base do retângulo deve ser positiva.");
        }
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura <= 0) {
            throw new IllegalArgumentException("A altura do retângulo deve ser positiva.");
        }
        this.altura = altura;
    }

    public double calcularArea() {
        return base * altura;
    }

    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    @Override
    public String toString() {
        return String.format(
                "Retângulo {base=%.2f, altura=%.2f, área=%.2f, perímetro=%.2f}",
                base, altura, calcularArea(), calcularPerimetro());
    }

    public static void main(String[] args) {
        Q2Mxs2 retangulo = new Q2Mxs2(3, 4);
        System.out.println(retangulo);
    }
}
