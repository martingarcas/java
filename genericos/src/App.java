//import com.jve.modelo.Caja;
//package com.jve;
import java.util.Random;

import com.jve.dto.AlumnoDTO;
import com.jve.dto.AlumnoToDTOConverter;
import com.jve.modelo.Alumno;
import com.jve.modelo.Converter;
import com.jve.modelo.Convertidor;
import com.jve.modelo.Lista;
import com.jve.modelo.Pila;
import com.jve.modelo.Producto;

public class App {
    public static void main(String[] args) throws Exception {

        /*Caja<Double> caja1 = new Caja<Double>(2.5);
        Caja<String> caja2 = new Caja<>("hola");
        double res = caja1.getContenido();
        System.out.println(res);
        System.out.println(caja2);
        System.out.println(caja2.getContenido());*/

        /*Random r = new Random();
        Lista<Integer> lista = new Lista<>();
        for (int i = 0; i < 10; i++) {
            lista.agregar(r.nextInt(100));
        }

        System.out.println(lista);*/

        System.out.println("------------------------------------------");

        Lista<Producto> listaDeProductos = new Lista<>();

        Producto p1 = new Producto("Laptop", 799.99);
        Producto p2 = new Producto("Smartphone", 599.99);
        Producto p3 = new Producto("Tablet", 399.99);
        Producto p4 = new Producto("Smartwatch", 149.99);

        listaDeProductos.agregar(p1);
        listaDeProductos.agregar(p2);
        listaDeProductos.agregar(p3);
        listaDeProductos.agregar(p4);

        Producto encontrado = listaDeProductos.buscar(new Producto("Tablet", 399.99));
        System.out.println(encontrado);

        System.out.println(listaDeProductos);

        System.out.println("------------------------------------------");

        /*Alumno alumno = new Alumno("Martín", "Calderón"); //Creo el objeto alumno

        Converter<Alumno, AlumnoDTO> alumnoConverter = new AlumnoToDTOConverter(); //Creo el conversor del alumno

        AlumnoDTO alumnoDTO = alumnoConverter.convert(alumno); //Convertimos el alumno en un alumnoDTO para obtener el nombrecompleto

        System.out.println("Nombre Completo: " + alumnoDTO.getNombreCompleto()); //Mostramos el nombrecompleto por consola*/

        System.out.println("------------------------------------------");
        // Crear una lista de alumnos
        Lista<Alumno> listaDeAlumnos = new Lista<>();
        listaDeAlumnos.agregar(new Alumno("Martín", "Calderón"));
        listaDeAlumnos.agregar(new Alumno("Ana", "Gómez"));
        listaDeAlumnos.agregar(new Alumno("Carlos", "Pérez"));

        //Método 1
        // Crear el conversor de Alumno a AlumnoDTO
        /*AlumnoToDTOConverter alumnoConverter = new AlumnoToDTOConverter();

        // Convertir la lista de alumnos a lista de AlumnoDTO
        Lista<AlumnoDTO> listaDeAlumnosDTO = Convertidor.convertirLista(listaDeAlumnos, alumnoConverter);

        // Imprimir la lista de AlumnoDTOs
        for (AlumnoDTO alumnoDTO : listaDeAlumnosDTO) {
            System.out.println(alumnoDTO.getNombreCompleto());
        }*/

        //Método 2
        // Crear el conversor de Alumno a AlumnoDTO
        AlumnoToDTOConverter alumnoConverter = new AlumnoToDTOConverter();

        // Convertir la lista de alumnos a lista de AlumnoDTO usando el nuevo método
        Lista<AlumnoDTO> listaDeAlumnosDTO = alumnoConverter.convertirLista(listaDeAlumnos);

        // Imprimir la lista de AlumnoDTOs
        for (AlumnoDTO alumnoDTO : listaDeAlumnosDTO) {
            System.out.println(alumnoDTO.getNombreCompleto());
        }

        System.out.println("------------------------------------------");

        // Crear una pila de tipo Alumno
        Pila<Alumno> pilaDeAlumnos = new Pila<>();

        System.out.println("Tamaño de la pila antes de agregar alumnos: " + pilaDeAlumnos.size());

        Alumno alumnoPila1 = new Alumno("Daniel", "García");
        Alumno alumnoPila2 = new Alumno("Fernando", "Gómez");
        Alumno alumnoPila3 = new Alumno("Luis", "Martínez");
        
        pilaDeAlumnos.push(alumnoPila1);
        pilaDeAlumnos.push(alumnoPila2);
        pilaDeAlumnos.push(alumnoPila3);

        // Mostrar el tamaño de la pila
        System.out.println("Tamaño de la pila después de agregar alumnos: " + pilaDeAlumnos.size());

        // Ver el último alumno agregado (sin quitarlo)
        System.out.println("Último alumno (peep): " + pilaDeAlumnos.peep());

        // Eliminar el último alumno (pop)
        System.out.println("Eliminando último alumno...");
        Alumno eliminado = pilaDeAlumnos.pop();
        System.out.println("Alumno eliminado: " + eliminado);

        // Ver el tamaño después de un pop
        System.out.println("Tamaño de la pila después de eliminar un alumno: " + pilaDeAlumnos.size());

        // Comprobar si la pila está vacía
        System.out.println("¿Está la pila vacía? " + pilaDeAlumnos.empty());

        // Limpiar la pila (vaciarla)
        System.out.println("Limpiando la pila...");
        pilaDeAlumnos.clear();

        // Comprobar el tamaño después de limpiar
        System.out.println("Tamaño de la pila después de limpiarla: " + pilaDeAlumnos.size());

        // Comprobar si la pila está vacía después de limpiar
        System.out.println("¿Está la pila vacía después de limpiarla? " + pilaDeAlumnos.empty());
    }
}
