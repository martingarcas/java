package com.jve.dto;

import com.jve.modelo.Alumno;
import com.jve.modelo.Converter;

public class AlumnoToDTOConverter implements Converter<Alumno, AlumnoDTO> {

    @Override
    public AlumnoDTO convert(Alumno alumno) {
        String nombreCompleto = alumno.getNombre() + " " + alumno.getApellido();
        return new AlumnoDTO(nombreCompleto);
    }
}
