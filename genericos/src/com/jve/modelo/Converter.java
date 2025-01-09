package com.jve.modelo;

@FunctionalInterface
public interface Converter<T,R> {

	public R convert(T source);

}
