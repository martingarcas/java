package com.jve.dto;

public class AlumnoDTO implements Comparable<AlumnoDTO>{

    private String nombreCompleto;

    public AlumnoDTO(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    @Override
    public int compareTo(AlumnoDTO o) {
        return this.nombreCompleto.compareTo(o.nombreCompleto);
    }

}
