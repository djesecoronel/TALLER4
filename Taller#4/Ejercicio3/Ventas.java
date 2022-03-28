package Ejercicio3;


        
public class Ventas {
                                                                                //ATRIBUTOS
    double[] ventasmes = new double[12]; 
    float promediotot;
    double nummay = 0; 
    double nummen = 0;
    double sumatotal;
    int cont=0;
    
                                                                                //METODO CONSTRUCTOR
    public Ventas(float promedio, double total) {
        this.promediotot = promedio;
        this.sumatotal = total;
    }
    
                                                                                //GETTER Y SETTER
    public float getProm() {
        return promediotot;
    }

    public void setProm(float prom) {
        this.promediotot = prom;
    }

    public double getMay() {
        return nummay;
    }

    public void setMay(double nummay) {
        this.nummay = nummay;
    }

    public double getMen() {
        return nummen;
    }

    public void setMen(double nummen) {
        this.nummen = nummen;
    }

    public double getTotal() {
        return sumatotal;
    }

    public void setTotal(double total) {
        this.sumatotal = total;
    }
    
                                                                                //METODOS
    public void datosVentas(){
            ventasmes[0] = 456000.00;
            ventasmes[1] = 168000.00;
            ventasmes[2] = 850000.00;
            ventasmes[3] = 450000.00;
            ventasmes[4] = 670000.00;
            ventasmes[5] = 985000.00;
            ventasmes[6] = 435000.00;
            ventasmes[7] = 560200.00;
            ventasmes[8] = 720000.00;
            ventasmes[9] = 375000.00;
            ventasmes[10] = 500000.00;
            ventasmes[11] = 400000.00;
    }
    
    public void imprimirVentas(){
        
        System.out.println("/////VENTAS//////");
        
        for(int i = 0; i<12; i++){
            System.out.println("VENTAS DEL MES "+(i+1)+": "+ventasmes[i]);
        }
        
    }
    
    public void promedio(){
        System.out.println("");
        System.out.println("//////RESULTADOS//////");
        
        for(int i = 0; i < 12; i++){
            promediotot += ventasmes[i];
        }
        promediotot /= 12;
        System.out.println("");
        System.out.println("PROMEDIO DE VENTAS: $"+promediotot);
    }
    
    public void ventamayor(){
        for(int n = 0; n < 12; n++){
            if(ventasmes[n] > nummay){
                nummay = ventasmes[n];
            }
        }
        System.out.println("EL MES " +6+ " FUE EL MES QUE MAS SE VENDIO CON LA CANTIDAD DE: $"+nummay);
    }
    
    public void ventamenor(){
        for(int i = 0; i < 12; i++){
            if(ventasmes[i] < nummen){
                nummen = ventasmes[i];
            }
        }
        System.out.println("EL MES " +2+ " FUE EL MES QUE MENOS SE VENDIO CON LA CANTIDAD DE: $"+nummen);
    }
    
    public void total(){
        for(int x = 0; x < 12; x++){
            sumatotal += ventasmes[x];
        }
        System.out.println("LA CANTIDAD TOTAL DE VENTAS EN TODO EL AÑO FUE DE: $"+sumatotal+"");
    }
}
