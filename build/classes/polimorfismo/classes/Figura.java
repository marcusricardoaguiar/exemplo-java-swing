package polimorfismo.classes;

public abstract class Figura {
    
    private String nome;
    
    public Figura(){
        
    }
    
    public abstract Double area();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
