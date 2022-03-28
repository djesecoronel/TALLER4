
package Ejercicio4;

public class PruebaHabitacion {
    public static void main(String [] args){
        
        Habitacion cuarto = new Habitacion(5.2f, 6.7f, 4.1f);
        
        System.out.println("///////-HABITACION-//////");
        System.out.println("");
        System.out.println("ALTURA: "+cuarto.a+" m");
        System.out.println("ANCHO: "+cuarto.b+" m");
        System.out.println("LARGO: "+cuarto.h+" m");
        
        
            cuarto.piso();
            cuarto.paredes();
        
            
        System.out.println("");
        System.out.println("CANTIDAD NECESARIA PARA ENCHAPAR DEL PISO: "+cuarto.m+" m²");
        System.out.println("CANTIDAD NECESARIA PARA TAPIZAR PAREDES: "+cuarto.medpared+" m²");
    }
}
