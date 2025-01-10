package com.jve.modelo;

public class Convertidor {

	public static <T, R> R convertir(T source, Converter<T, R> converter) {
		return converter.convert(source);
	}

	public static <T extends Comparable<T>, R extends Comparable<R>> Lista<R> convertirLista(Lista<T> lista, Converter<T, R> converter) {

        Lista<R> resultado = new Lista<>();
        for (T elemento : lista) {
            resultado.agregar(converter.convert(elemento));
        }
        return resultado;
    }

}
