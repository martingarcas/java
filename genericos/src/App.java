//import com.jve.modelo.Caja;
//package com.jve;
import java.util.Random;

import com.jve.modelo.Lista;
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
    }
}
