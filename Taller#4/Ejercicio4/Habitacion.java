package Ejercicio4;

public class Habitacion {
                                             //ATRIBUTOS
    float a;
    float b;
    float h;
    float m;
    float medpared;
    
                                              //METODO CONSTRUCTOR
    public Habitacion(float a, float b, float h){
        this.a = a;
        this.b = b;
        this.h = h;
    }
    
                                              //METODOS
    public void piso(){
        m = b * h;
    }
    
    public void paredes(){
        medpared = (b * h) * a;
    }
}