package polimorfismo.classes;

public class Circulo extends Figura {
    
    private double raio;
    
    public Circulo(double raio){
        this.raio = raio;
    }
    
    @Override
    public Double area(){
        return 3.14*Math.pow(raio, 2);
    }
}
