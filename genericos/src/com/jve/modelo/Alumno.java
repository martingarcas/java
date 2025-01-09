package com.jve.modelo;

public class Alumno implements Comparable<Alumno> {

	private String nombre;
    private String apellido;

    public Alumno(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Alumno{" +
               "nombre='" + nombre + '\'' +
               ", apellido=" + apellido +
               '}';
    }

	@Override
	public int compareTo(Alumno o) {
		
		int nombreComparar = this.nombre.compareTo(o.nombre);
		if (nombreComparar != 0) {
			return nombreComparar;
		}
		
		return this.apellido.compareTo(o.apellido);
	}

}
