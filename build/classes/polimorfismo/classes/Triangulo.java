package polimorfismo.classes;

public class Triangulo extends Figura {
    
    private double base, altura;
    
    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public Double area(){
        return (base * altura)/2;
    }
}
