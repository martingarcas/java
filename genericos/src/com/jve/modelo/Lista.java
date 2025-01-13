package com.jve.modelo;

import java.util.Arrays;
import java.util.Iterator;

public class Lista<T extends Object & Comparable<T>> implements Iterable<T> {

	private T[] elementos;
	private int tamaño;
	private static final int CAPACIDAD_INICIAL = 10;
	private int i;

	public Lista() {

        elementos = (T[]) new Comparable[CAPACIDAD_INICIAL];
		tamaño = 0;
	}

	public void agregar(T elemento) {

		if (tamaño == elementos.length) {
			elementos = Arrays.copyOf(elementos, tamaño * 2);
		}

		elementos[tamaño++] = elemento;
	}

	public T obtener(int indice) {

		if (indice >= 0 && indice < tamaño) {
			return elementos[indice];
		} else {
			throw new IndexOutOfBoundsException("Índice fuera de rango");
		}
	}

	public void eliminar(int indice) {

		if (indice >= 0 && indice < tamaño) {
			System.arraycopy(elementos, indice + 1, elementos, indice, tamaño - indice - 1);
			elementos[--tamaño] = null;
		} else {
			throw new IndexOutOfBoundsException("Índice fuera de rango");
		}
	}

	public int tamaño() {
		return tamaño;
	}

	
	public T buscar(T elemento) {
		boolean encontrado = false;
		T elementoEncontrado = null;
		for (int i = 0; i < tamaño && !encontrado; i++) {

			if (elementos[i].compareTo(elemento) == 0) {
				elementoEncontrado = elementos[i];
				encontrado = true;
			}
		}
		
		return elementoEncontrado;
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append("[");

		for (int i = 0; i < tamaño; i++) {

			sb.append(elementos[i]);
			if (i < tamaño - 1) {
				sb.append(", ");
			}
		}
		
		sb.append("]");
		return sb.toString();
	}

	@Override
	public Iterator<T> iterator() {

		i = 0;
		Iterator<T> it = new Iterator<T>() {

			@Override
			public boolean hasNext() {
				return i != tamaño;
			}

			@Override
			public T next() {
				return elementos[i++];
			}
		};
		return it;
	}

}
