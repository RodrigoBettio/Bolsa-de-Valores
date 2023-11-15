package ControleDados;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Stack;
import java.util.function.Consumer;

public class ArvoreBinaria<T> implements Iterable<T> {
    private Node<T> raiz;
    private final Comparator<T> comparador;

    public ArvoreBinaria(Comparator<T> comparador) {
        this.raiz = null;
        this.comparador = comparador;
    }

    public void add(T valor) {
        if (valor == null) {
            throw new IllegalArgumentException("Valor não pode ser nulo.");
        }
        raiz = adicionar(raiz, valor);
    }

    private Node<T> adicionar(Node<T> no, T valor) {
        if (no == null) {
            return new Node<>(valor);
        }

        int comp = comparador.compare(valor, no.valor);
        if (comp < 0) {
            no.esquerda = adicionar(no.esquerda, valor);
        } else if (comp > 0) {
            no.direita = adicionar(no.direita, valor);
        }
        return no;
    }

    public boolean buscar(T valor) {
        return buscar(raiz, valor);
    }

    private boolean buscar(Node<T> no, T valor) {
        if (no == null) {
            return false;
        }

        int comp = comparador.compare(valor, no.valor);
        if (comp == 0) {
            return true;
        } else if (comp < 0) {
            return buscar(no.esquerda, valor);
        } else {
            return buscar(no.direita, valor);
        }
    }

    public void remover(T valor) {
        raiz = remover(raiz, valor);
    }

    private Node<T> remover(Node<T> no, T valor) {
        if (no == null) {
            return null;
        }

        int comp = comparador.compare(valor, no.valor);
        if (comp < 0) {
            no.esquerda = remover(no.esquerda, valor);
        } else if (comp > 0) {
            no.direita = remover(no.direita, valor);
        } else {
            if (no.esquerda == null) {
                return no.direita;
            } else if (no.direita == null) {
                return no.esquerda;
            }
            no.valor = menorValor(no.direita);
            no.direita = remover(no.direita, no.valor);
        }
        return no;
    }

    private T menorValor(Node<T> no) {
        T valor = no.valor;
        while (no.esquerda != null) {
            valor = no.esquerda.valor;
            no = no.esquerda;
        }
        return valor;
    }

    @Override
    public Iterator<T> iterator() {
        return new ArvoreIterator();
    }

    @Override
    public String toString() {
        return toString(raiz, 0);
    }

    private String toString(Node<T> no, int profundidade) {
        if (no == null) {
            return "";
        }

        StringBuilder builder = new StringBuilder();
        String prefixo = "  ".repeat(profundidade);
        builder.append(prefixo).append(no.valor).append("\n");
        builder.append(toString(no.esquerda, profundidade + 1));
        builder.append(toString(no.direita, profundidade + 1));

        return builder.toString();
    }

    private class ArvoreIterator implements Iterator<T> {
        private Stack<Node<T>> pilha;
        private Node<T> noAtual;

        public ArvoreIterator() {
            pilha = new Stack<>();
            noAtual = raiz;
        }

        @Override
        public boolean hasNext() {
            return !pilha.isEmpty() || noAtual != null;
        }

        @Override
        public T next() {
            while (noAtual != null) {
                pilha.push(noAtual);
                noAtual = noAtual.esquerda;
            }

            if (!hasNext()) {
                throw new NoSuchElementException();
            }

            Node<T> no = pilha.pop();
            noAtual = no.direita;

            return no.valor;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override
        public void forEachRemaining(Consumer<? super T> action) {
            Objects.requireNonNull(action);
            while (hasNext()) {
                action.accept(next());
            }
        }
    }

    private class Node<E> {
        private E valor;
        private Node<E> esquerda;
        private Node<E> direita;

        public Node(E valor) {
            this.valor = valor;
            this.esquerda = null;
            this.direita = null;
        }
    }
}
