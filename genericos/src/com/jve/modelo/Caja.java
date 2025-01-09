package com.jve.modelo;

public class Caja<T> {

	private T content;

	public Caja() {
		content = null;
	}

	public Caja(T content) {
		this.content = content;
	}

	public T getContenido() {
		return this.content;
	}

	public void setContenido(T content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Caja{" +
			"content=" + content +
			'}';
	}

}
