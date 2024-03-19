package collections.parte2.ej1;

import java.util.Scanner;

public class ArreglosExtra1 {

    public static void main(String[] args) {
        Cine cinemax = new Cine("Roma SRL", "Rivadavia 325");
        Scanner Leer = new Scanner(System.in);
        String respuesta;
        do {
            System.out.println("Ingrees el titulo de la pelicula");
            String titulo = Leer.nextLine();
            System.out.println("Ingrese el nombre del director");
            String director = Leer.nextLine();
            System.out.println("Ingrese la duracion de la pelicula");
            int duracion = Leer.nextInt();
            Pelicula aleatoria = new Pelicula(titulo, director, duracion);
            cinemax.agregarPelicula(aleatoria);
            System.out.println("desea continuar?");
            Leer.nextLine();
            respuesta = Leer.nextLine();
        } while (respuesta.equalsIgnoreCase("si"));
        System.out.println("");
        System.out.println("lista completa");
        System.out.println("");
          cinemax.listarTodo();
          System.out.println(" ");
          System.out.println("lista de mayot duracion");
          System.out.println(" ");
          cinemax.listarMenorDuracionAMayorDuracion();
          System.out.println(" ");
          System.out.println("lista ordenada de la A a la Z");
          System.out.println(" ");
          cinemax.listaOrdenadasPorTituloAZ();
          System.out.println("");
          System.out.println("lista ordenada de directores de la A a la Z");
          System.out.println("");
          cinemax.listarOrdenadasPorDirectorAZ();
//        System.out.println(" ");
//        System.out.println("las pelicualas que duran mas de 120 min son ");
//        System.out.println(" ");
//        cinemax.listarDuranMas(130);
    }
}
