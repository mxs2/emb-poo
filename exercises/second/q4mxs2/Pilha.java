package second.q4mxs2;

import java.util.ArrayList;

public class Pilha {
    private ArrayList<Object> elementos;

    public Pilha() {
        elementos = new ArrayList<>();
    }

    public boolean adicionar(Object o) {
        elementos.add(o);
        return true;
    }

    public Object retirar() {
        if (estáVazia()) {
            throw new IllegalStateException("A pilha está vazia.");
        }
        return elementos.remove(elementos.size() - 1);
    }

    public boolean estáVazia() {
        return elementos.isEmpty();
    }
}
