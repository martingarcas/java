package com.jve.modelo;

import java.util.Arrays;

public class Pila<T extends Object & Comparable<T>> {

    private Lista<T> elementos;

    public Pila() {
        elementos = new Lista<>();
    }

    // Método para añadir un elemento a la pila
    public void push(T elemento) {
        elementos.agregar(elemento);
    }

    // Método para eliminar el último elemento de la pila, a su vez lo devolvemos para comprobarlo
    public T pop() {
        
        if (empty()) {
            throw new IllegalStateException("La pila está vacía");
        }

        T elemento = elementos.obtener(elementos.tamaño() - 1);
        elementos.eliminar(elementos.tamaño() - 1);
        return elemento;
    }

    // Método para limpiar/vaciar la pila
    public void clear() {

        while (!empty()) {
            pop();
        }
    }

    // Método para ver el último elemento pero sin eliminarlo
    public T peep() {

        if (empty()) {
            throw new IllegalStateException("La pila está vacía");
        }

        return elementos.obtener(elementos.tamaño() - 1);
    }

    // Método para obtener el tamaño de la pila
    public int size() {
        return elementos.tamaño();
    }

    // Método para comprobar si la pila está vacía
    public boolean empty() {
        return elementos.tamaño() == 0;
    }

    public Lista<T> convertirLista() {
        
        Lista<T> listaResultado = new Lista<>();
        for (T elemento : elementos) { // Recorremos la pila
            listaResultado.agregar(elemento);
        }

        return listaResultado;
    }

    // Método para ordenar los elementos de la pila TODO
    /*public void ordenar() {

        Lista<T> lista = convertirLista();
        T[] arregloLista = (T[]) new Comparable[lista.tamaño()];

        for (int i = 0; i < lista.tamaño(); i++) {
            arregloLista[i] = lista.obtener(i);
        }

        Arrays.sort(arregloLista);

        clear();

        for (T elemento : arregloLista) {
            push(elemento);
        }
    }*/

}
