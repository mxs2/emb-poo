package first;

public class Q4Mxs2 {
    public static void main(String[] args) {
        System.out.println("Soma: " + adicionar(2, 3));
        System.out.println("Média: " + media(new double[] {1, 2, 3, 4, 5}));
        System.out.println("É primo: " + ePrimo(7));
    }

    public static double adicionar(double a, double b) {
        return a + b;
    }

    public static double media(double[] valores) {
        double soma = 0;
        for (double valor : valores) {
            soma += valor;
        }
        return soma / valores.length;
    }

    public static boolean ePrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
