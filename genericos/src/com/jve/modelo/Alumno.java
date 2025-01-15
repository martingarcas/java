package com.jve.modelo;

import java.util.Comparator;
import java.util.Optional;

public class Alumno implements Comparable<Alumno> {

	private String nombre;
    private Optional<String> apellido;
    private int edad;

    public Alumno(String nombre, String apellido, int edad) {
        this.nombre     = nombre;
        this.apellido   = Optional.ofNullable(apellido);
        this.edad       = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Optional<String> getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = Optional.ofNullable(apellido);
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Alumno{" +
            "nombre='" + nombre + '\'' +
            ", apellido=" + apellido.orElse("No proporcionado") + 
            ", edad='" + edad + '\'' +
            '}';
    }

    // Natural order
    @Override
    public int compareTo(Alumno o) {

        int nombreComparar = this.nombre.compareTo(o.nombre);
        if (nombreComparar != 0) {
            return nombreComparar;
        }

        int apellidoComparar = this.apellido.orElse("").compareTo(o.apellido.orElse(""));
    
        if (apellidoComparar != 0) {
            return apellidoComparar;
        }

        return Integer.compare(this.edad, o.edad);
    }

    // Método estático para comparar por edad
    public static Comparator<Alumno> compararPorEdad = new Comparator<Alumno>() {
        @Override
        public int compare(Alumno a1, Alumno a2) {
            return Integer.compare(a1.getEdad(), a2.getEdad());
        }
    };

    @Override
    public boolean equals(Object obj) {

        Alumno alumno = (Alumno) obj;
        Integer edad = alumno.edad;

        return nombre.equals(alumno.nombre) &&
            apellido.equals(alumno.apellido) &&
            edad.equals(alumno.edad);
    }

}
