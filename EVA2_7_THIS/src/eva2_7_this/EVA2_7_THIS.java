/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_7_this;

/**
 *
 * @author invitado
 */
public class EVA2_7_THIS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //aqui no se usa this porque es static
        
        imprimir();
        //no se ´puede usar en un contexto estatico
    }
    
    public void imprimir(){
        //aqui tambien se usa this
        
    }
    
}

//this es un apuntador interno dentro de la clase
// this es una referencia  a una instancia de una clase
//todos los objetos tienen this
//pueden usar this en cualquier clase
//this solo funciona internamente en la clase
class Persona{
    public String nombre;
    
    public Persona(String nombre) {
        this.nombre = nombre;
        //this.nombre es el atributo de la clase, nombre es la variable parametro declarado en el metodo
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
        
    }
    
    public void imprimirDatos(){
        System.out.println("EL nombre es: "+this.nombre);
    }


}
