package Ejercicio3;

public class PruebaVentas {
    public static void main(String [] args){
        Ventas result = new Ventas(0, 0);
        
        result.datosVentas();
        result.imprimirVentas();
        result.setProm(0);
        result.setMay(0);
        result.setMen(0);
        result.promedio();
        result.setTotal(0);
        result.ventamayor();
        result.ventamenor();
        result.total();
    }
}