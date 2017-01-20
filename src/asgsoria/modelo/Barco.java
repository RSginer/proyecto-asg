
package asgsoria.modelo;

/**
 *
 * @author alvaro
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
    
   
  
}
