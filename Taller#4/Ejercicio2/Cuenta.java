package Ejercicio2;

import javax.swing.JOptionPane;

public class Cuenta {
    int ncuenta;
    String nombre;
    double saldo, monto, saldototal, saldototal2;            //ATRIBUTOS
    char consignando, retirando;

    public int getNcuenta() {
        return ncuenta;
    }

    public void setNcuenta(int ncuenta) {
        this.ncuenta = ncuenta;
    }

    public String getNombre() {
        return nombre;
    }
                                                            //GETTER Y SETTER
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
   
                                                            //METODOS
   public void consignar(){
       saldototal = saldo; 
       consignando = JOptionPane.showInputDialog("DESEA USTED CONSIGNAR? [S/N]").charAt(0);
        if(consignando == 'S' || consignando == 's'){
            this.monto = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL MONTO A CONSIGNAR EN SU CUENTA: "));
            JOptionPane.showMessageDialog(null, "SE HA CONSIGNADO EL MONTO EXITOSAMENTE");
            saldototal = saldo+monto;
            JOptionPane.showMessageDialog(null, "SALDO TOTAL: "+(saldototal));
        } 
    }
    
    public void retirar(){
        saldototal2 = saldototal;
        retirando = JOptionPane.showInputDialog("DESEA USTED RETIRAR? [S/N]").charAt(0);
        if(retirando == 'S' || retirando == 's'){
            this.monto = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL MONTO A RETIRAR: "));
            JOptionPane.showMessageDialog(null, "SE HA RETIRADO EL MONTO DE SU CUENTA EXITOSAMENTE");
            saldototal2 = saldototal - monto;
        }
           
            JOptionPane.showMessageDialog(null, "SALDO TOTAL: "+(saldototal2));
            JOptionPane.showMessageDialog(null, "GRACIAS POR USAR NUESTROS SERVICIOS!");
    
    }
    
}
