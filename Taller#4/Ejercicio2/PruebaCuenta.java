package Ejercicio2;

import javax.swing.JOptionPane;

public class PruebaCuenta {
    public static void main(String[] args){
        
        Cuenta cuenta1 = new Cuenta();
        
            cuenta1.setNcuenta(Integer.parseInt(JOptionPane.showInputDialog("DIGITE SU NUMERO DE CUENTA: ")));
            cuenta1.setNombre(JOptionPane.showInputDialog("DIGITE SU NOMBRE: "));
            cuenta1.setSaldo(Double.parseDouble(JOptionPane.showInputDialog("DIGITE SU SALDO: ")));
        
        
                cuenta1.consignar();
                cuenta1.retirar();
        
                
        
    }
}
