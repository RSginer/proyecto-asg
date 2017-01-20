/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asgsoria.modelo;

/**
 *
 * @author Rubén
 */
public class Barco {
    private int id;
    private String nombre;
    private int ancho;
    private int largo;
    private boolean estaMoviendose;
    private int velocidad;

    public Barco(){}

    public Barco(int id, String nombre, int ancho, int largo) {
        this.id = id;
        this.nombre = nombre;
        this.ancho = ancho;
        this.largo = largo;
    }
    
 
    
    public int getId() {
        return id;
    }
    
    public void zarparDelPuerto(int velocidad){
        this.velocidad = velocidad;
        this.estaMoviendose = true;
    }
    
    public void zarparDelPuerto(){
        this.velocidad = 10;
        this.estaMoviendose = true;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }
   
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    private int getLargo() {
        return largo;
    }
    
    public int calculaElAnchoPorElLargo(){
        return this.getAncho() * this.getLargo();
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }
    
   @Override
    public String toString(){
    return "ID: " + this.id + "\n NOMBRE: " + this.nombre + "\n ANCHO:" + this.ancho + "\n LARGO: " + this.largo;}
}
