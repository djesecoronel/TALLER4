package Ejercicio6;

import javax.swing.JOptionPane;

public class PruebaMates {
     public static void main(String[] args) {
        
        int x = Integer.parseInt(JOptionPane.showInputDialog("Digite el valor de x: "));

        
        Mates result = new Mates(2,5,3);
        
        result.ecuacion(2, 5, 3, x);
        System.out.printf("Y(%d) = %.2f%n", x, result.resultadoecuacion(x));
        
     
    }
}