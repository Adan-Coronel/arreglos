package collections.parte2.ej1;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import java.util.List;


public class Cine {

    private String nombre, direccion;
    private List<Pelicula> peliculas;
   

    public Cine(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.peliculas = new ArrayList<Pelicula>();

    }
// agregarPelicula(Pelicula):void  Recibe una Película y la agrega a la lista que posee el Cine.

    public void agregarPelicula(Pelicula pelicula) {
        peliculas.add(pelicula);
    }

//    listarTodo():void  Muestra por consola todas las Películas registradas en el Cine.
    public void listarTodo() {
        for (Pelicula aux : peliculas) {
            System.out.println(aux.getTitulo());
        }
    }

//    listarDuranMas(horas):void  Reciba una cantidad de horas y muestra por consola todas las
//películas que tengan una duración mayor a la recibida por parámetro.
    public void listarDuranMas(int min) {
        for (Pelicula duracion : peliculas) {
            if (duracion.getDuracion() > min) {
                System.out.println(duracion.getTitulo());
            }
        }
    }

//    listarMenorDuracionAMayorDuracion():void  Lista las Películas ordenadas de menor a mayor.
    public void listarMenorDuracionAMayorDuracion() {
Comparator<Pelicula> duracion = new Comparator<Pelicula>(){ //Devuelve 1, -1, 0 para ordenar lista de mayor a menor o de menor a mayor.
            @Override
            public int compare(Pelicula p1,Pelicula p2){
                return Integer.compare(p1.getDuracion(),p2.getDuracion());
            }
        };
        Collections.sort(peliculas, duracion);
        System.out.println("Lista ordenada");
        listarTodo();
    }
    
//    listarOrdenadasPorTituloAZ():void  Lista las Películas ordenadas alfabéticamente por el título.
    public void listaOrdenadasPorTituloAZ(){
       Comparator <Pelicula> orden=new Comparator<Pelicula>(){
           @Override
           public int compare(Pelicula p1, Pelicula p2){
               return p1.getTitulo().compareTo(p2.getTitulo());
           }     
    };
       Collections.sort(peliculas,orden);
       listarTodo();
}
    
//    listarOrdenadasPorDirectorAZ():void  Lista las Películas ordenadas alfabéticamente por el director.
    
    public void listarOrdenadasPorDirectorAZ(){
       Comparator <Pelicula> directors=new Comparator<Pelicula>(){
           @Override
           public int compare(Pelicula p1, Pelicula p2){
               return p1.getDirector().compareTo(p2.getDirector());
           }     
    };
       Collections.sort(peliculas,directors);
            for (Pelicula aux : peliculas) {
            System.out.println(aux.getDirector());
        }
}
}
