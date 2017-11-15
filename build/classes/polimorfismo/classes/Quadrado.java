package polimorfismo.classes;

public class Quadrado extends Figura {
    
    private double lado;
    
    public Quadrado(double lado){
        this.lado = lado;
    }
    
    @Override
    public Double area(){
        return Math.pow(lado, 2);
    }
}
