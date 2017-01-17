/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asgsoria;

import asgsoria.modelo.Barco;
import asgsoria.modelo.Jugador;
/**
 *
 * @author Rubén
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Barco barco = new Barco(1,"barco de alvaro",3,2);
        barco.setAncho(10);
        Jugador alvaro = new Jugador(1, "Alvaro");
        System.out.println(alvaro.getNombre());
    }
    
}
