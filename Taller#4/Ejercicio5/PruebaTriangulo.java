package Ejercicio5;

public class PruebaTriangulo {
        public static void main(String [] args){
            
        Triangulo isoceles = new Triangulo(9, 7, 90);
        isoceles.setBase(5);
        isoceles.setAltura(10);
        
            System.out.println("//////DATOS DEL TRIANGULO//////");
        isoceles.Area();
        isoceles.Longitud();
        isoceles.Perimetro();
        isoceles.imprimirAngulo();
        
    }
}

