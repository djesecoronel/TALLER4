package Ejercicio1;

public class Coche {
                                               //ATRIBUTOS
    String color;
    String marca;
    String modelo;
    int numcaballos;
    int numpuertas;
    String matricula;
                                               //METODOS

public Coche(String color, String marca, String modelo, int numcaballos, int numpuertas, String matricula){
       this.color = color;
       this.marca = marca;
       this.modelo = modelo;
       this.numcaballos = numcaballos;
       this.numpuertas = numpuertas;
       this.matricula = matricula;
}

public void ImprimirDatos(){
    System.out.println("");
    System.out.println("//////INFORMACION DEL COCHE//////");
    System.out.println("COLOR: "+color);
    System.out.println("MARCA: "+marca);
    System.out.println("MODELO: "+modelo);
    System.out.println("CABALLOS DE FUERZA: "+numcaballos);
    System.out.println("PUERTAS: "+numpuertas);
    System.out.println("MATRICULA: "+matricula);
    
}





}



