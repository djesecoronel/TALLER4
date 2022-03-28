package Ejercicio5;

public class Triangulo {
                                                                                //ATTTRIBUTOS Y VARIABLES
    float b, h;
    float iguales, diferentes, angiguales, vertice, area, longtd, peri;
    
                                                                                //CONSTRUCTOR
    public Triangulo(int iguales, int diferentes, int angiguales) {
        this.iguales = iguales;
        this.diferentes = diferentes;
        this.angiguales = angiguales;
    }
    
                                                                                //SETTER Y GETTER
    public float getBase() {
        return b;
    }

    public void setBase(float b) {
        this.b = b;
    }

    public float getAltura() {
        return h;
    }

    public void setAltura(float h) {
        this.h = h;
    }
    
                                                                                //METODOS
    public void Area(){
        area = (b * h) / 2;
        System.out.println("AREA DEL TRIANGULO: "+area);
    }
    
    public void Longitud(){
        longtd = iguales * 2;
        System.out.println("LONGITUD DEL TRIANGULO: "+longtd);
    }
    
    public void Perimetro(){
        peri = (iguales * 2) + diferentes;
        System.out.println("PERIMETRO DEL TRIANGULO: "+peri);
    }

    public void imprimirAngulo(){
        vertice = (iguales * 2) - 180;
        System.out.println("ANGULO DEL VERTICE: "+vertice);
    }
}