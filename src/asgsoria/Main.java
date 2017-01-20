/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asgsoria;

import asgsoria.modelo.Barco;
import asgsoria.modelo.Jugador;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Rubén
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jugador jugadorRojo = new Jugador(1, "Jugador Rojo");
        Jugador jugadorAzul = new Jugador(2, "Jugador azul");
        Scanner scanner = new Scanner(System.in);
        String respuestaUsuario = null;
        do {
            System.out.println("------------------------------------------");
            System.out.println("|   MENU HUNDE LA FLOTA by AsgSoria =) !  |");
            System.out.println("------------------------------------------");
            System.out.println("1. Jugar");
            System.out.println("2. Salir");
            System.out.print("Introduce tu seleccion: ");
            respuestaUsuario = scanner.nextLine();
            switch (respuestaUsuario) {
                case "1": {
                    jugar(jugadorRojo, jugadorAzul);
                    break;
                }
            }
        } while (!respuestaUsuario.equals("2"));

    }

    private static void jugar(Jugador jugadorRojo, Jugador jugadorAzul) {
        Barco mapaJugadorRojo[] = {null, null, null, null, null};
        Barco mapaJugadorAzul[] = {null, null, null, null, null};
        boolean haGanado = false;
        String disparo = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("HOLA JUGADOR ROJO");
        System.out.println("Introduce la posicion donde quieres poner tu barco: ");
        String respuestaUsuario = scanner.nextLine();
        mapaJugadorRojo[Integer.parseInt(respuestaUsuario)] = new Barco();
        System.out.println("HOLA JUGADOR AZUL");
        System.out.println("Introduce la posicion donde quieres poner tu barco: ");
        respuestaUsuario = scanner.nextLine();
        mapaJugadorAzul[Integer.parseInt(respuestaUsuario)] = new Barco();
        do {
            System.out.println("DISPARO JUGADOR ROJO");
            System.out.println("Introduce la posicion donde quires disparar: ");
            disparo = scanner.nextLine();
            if (mapaJugadorAzul[Integer.parseInt(disparo)] instanceof Barco) {
                haGanado = true;
                  System.out.println("HA GANADO EL JUGADOR ROJO !");
            } else {
                System.out.println("AGUA !");
                System.out.println("DISPARO JUGADOR AZUL");
                System.out.println("Introduce la posicion donde quires disparar: ");
                disparo = scanner.nextLine();
                if (mapaJugadorRojo[Integer.parseInt(disparo)] instanceof Barco) {
                    haGanado = true;
                    System.out.println("HA GANADO EL JUGADOR AZUL !");
                } else {
                    System.out.println("AGUA ! ");
                }
            }
        } while (!haGanado);
    }

}
