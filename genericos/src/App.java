//import com.jve.modelo.Caja;
//package com.jve;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;

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
        listaDeAlumnos.agregar(new Alumno("Martín", "Calderón", 27));
        listaDeAlumnos.agregar(new Alumno("Ana", "Gómez", 24));
        listaDeAlumnos.agregar(new Alumno("Carlos", "Pérez", 22));

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

        Alumno alumnoPila1 = new Alumno("Daniel", "García", 32);
        Alumno alumnoPila2 = new Alumno("Fernando", "Gómez", 20);
        Alumno alumnoPila3 = new Alumno("Luis", "Martínez", 44);
        
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

        
        System.out.println("------------------------------------------");

        // Alumno, nombre y edad, equals, dos alumnos son iguales si se llaman igual y tienen la misma edad. 
        // Alumno comparable natural order...además otro comparator por edad

        // Listado por nombre y edad (orden natural)
        List<Alumno> alumnos = new ArrayList<>();
        
        Alumno a1 = new Alumno("Juan", "Pérez", 16);
        Alumno a2 = new Alumno("Ana", "García", 18);
        Alumno a3 = new Alumno("Pepe", "Lopez", 22);
        Alumno a4 = new Alumno("Ana", "Martín", 17);
        Alumno a5 = new Alumno("Pepe", "Sánchez", 20);

        alumnos.add(a1);
        alumnos.add(a2);
        alumnos.add(a3);
        alumnos.add(a4);
        alumnos.add(a5);
        
        System.out.println("Orden natural:");
        alumnos.stream().sorted().forEach(System.out::println);
        System.out.println("------------------------------------------");

        //listado de los mayores de edad
        System.out.println("Listado de los mayores de edad:");
        alumnos.stream().filter(alumno -> alumno.getEdad() >= 18).forEach(System.out::println);
        System.out.println("------------------------------------------");

        //listado de los que empiezan por "a".
        System.out.println("Listado de los que empiezan por 'a':");
        alumnos.stream().filter(alumno -> alumno.getNombre().startsWith("A") || alumno.getNombre().startsWith("a")).forEach(System.out::println);
        System.out.println("------------------------------------------");

        // Listado ordenado por edad (ascendente)
        System.out.println("Listado ordenado por edad (ascendente):");
        alumnos.stream().sorted(Alumno.compararPorEdad).forEach(System.out::println);
        System.out.println("------------------------------------------");

        // Listado ordenado por edad inversa(descendente)
        System.out.println("Listado ordenado por edad (descendente):");
        alumnos.stream().sorted(Alumno.compararPorEdad.reversed()).forEach(System.out::println);
        System.out.println("------------------------------------------");

        // Cuantos alumnos son mayores de edad
        System.out.println("¿Cuántos alumnos son mayores de edad?:");
        System.out.println(alumnos.stream().filter(alumno -> alumno.getEdad() >= 18).count());
        System.out.println("------------------------------------------");

        // Hay algún alumno con 20 años?
        System.out.println("¿Hay algún alumno con 20 años?:");
        System.out.println(alumnos.stream().anyMatch(alumno -> alumno.getEdad() == 20));
        System.out.println("------------------------------------------");

        // Hay algún alumno mayor de edad?
        System.out.println("¿Hay algún alumno mayor de edad?:");
        System.out.println(alumnos.stream().anyMatch(alumno -> alumno.getEdad() >= 18));
        System.out.println("------------------------------------------");

        // Dame la edad de todos los alumnos que se llamen "Pepe" listado
        // La operación termina con un List Integer que contiene las edades de los alumnos que se llaman "Pepe"
        System.out.println("Edad de todos los alumnos que se llamen Pepe:");
        //alumnos.stream().filter(alumno -> alumno.getNombre().equals("Pepe")).map(Alumno::getEdad).collect(Collectors.toList()).forEach(System.out::println);
        List<Integer> edadesDePepe = alumnos.stream().filter(alumno -> alumno.getNombre().equals("Pepe")).map(Alumno::getEdad).collect(Collectors.toList());
        System.out.println(edadesDePepe);
        System.out.println("------------------------------------------");
    
        // método stream
        //Ejemplo de uso o de algo: List<String> lista = Arrays.asList(new Alumno());
        //lista.stream().map(Alumno::getEdad()).forEach(System.out::println);
        //https://oregoom.com/java/comparator/
    }
}
