package second.q4mxs2;

public class Programa {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();

        pilha.adicionar("Primeiro");
        pilha.adicionar("Segundo");
        pilha.adicionar("Terceiro");

        while (!pilha.estáVazia()) {
            Object objetoRetirado = pilha.retirar();
            System.out.println("Objeto retirado: " + objetoRetirado);
        }
    }
}
