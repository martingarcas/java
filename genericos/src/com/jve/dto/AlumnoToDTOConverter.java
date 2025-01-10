package com.jve.dto;

import java.util.ArrayList;

import com.jve.modelo.Alumno;
import com.jve.modelo.Converter;
import com.jve.modelo.Lista;

public class AlumnoToDTOConverter implements Converter<Alumno, AlumnoDTO> {

    @Override
    public AlumnoDTO convert(Alumno alumno) {
        String nombreCompleto = alumno.getNombre() + " " + alumno.getApellido();
        return new AlumnoDTO(nombreCompleto);
    }

        // Método para convertir una lista de Alumno a AlumnoDTO
        public Lista<AlumnoDTO> convertirLista(Lista<Alumno> listaDeAlumnos) {
            Lista<AlumnoDTO> listaDeAlumnoDTOs = new Lista<>();
            for (Alumno alumno : listaDeAlumnos) {
                listaDeAlumnoDTOs.agregar(this.convert(alumno));  // Usa el método `convert` para convertir cada alumno
            }
            return listaDeAlumnoDTOs;
        }

}
