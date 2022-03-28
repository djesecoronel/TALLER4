package Ejercicio6;

public class Mates {
    private int a;
    private int b;                                //ATRIBUTOS
    private int c;
   
    public Mates(int a, int b, int c){
        this.a=a;
        this.b=b;                                 //METODO CONSTRUCTOR
        this.c=c;
    }
    
  
    public int getA(){
        return this.a;
    }
    
    public int getB(){
        return this.b;
    }
                                                  //GETTER Y SETTER
    public int getC(){
        return this.c;
    }
    
    public void setA(int a){
        this.a = a;
    }
    
    public void setB(int b){
        this.b=b;
    }
                                                  //METODOS
    public void setC(int c){
        this.c=c;
    }
    
    public void ecuacion(int a, int b, int c,int x){
            System.out.println(a +"("+ x +"^2) + "+ b +"*" +x+ " + "+ c +" = 0");
        }
    public double resultadoecuacion(int x){
            double y = this.a * Math.pow(x, 2) + this.b*x + this.c;
            return y;
        
    }
}