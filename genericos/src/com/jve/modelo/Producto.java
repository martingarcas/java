package com.jve.modelo;

public class Producto implements Comparable<Producto> {

	private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
               "nombre='" + nombre + '\'' +
               ", precio=" + precio +
               '}';
    }

	@Override
	public int compareTo(Producto o) {
		
		int nombreComparar = this.nombre.compareTo(o.nombre);
		if (nombreComparar != 0) {
			return nombreComparar;
		}
		
		return Double.compare(this.precio, o.precio);
	}

}
