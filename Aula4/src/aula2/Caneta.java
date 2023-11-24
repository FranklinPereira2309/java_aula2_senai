package aula2;

public class Caneta {
    public String modelo;
    private float ponta;
    
    /*public Caneta() {
        this.setModelo("Compacto");
        this.setPonta(0.7f);
        
    }*/
    public Caneta(String _modelo, float _ponta) {
        this.modelo = _modelo;
        this.ponta = _ponta;
    }
    
    public void status() {
        
    }
    
    public String getModelo(){
        return this.modelo;
    } 
    
    public void setModelo(String _mod) {
        this.modelo = _mod;
    }
    
    public void setPonta(float p) {
        this.ponta = p;
    }
    
    public float getPonta() {
        return this.ponta;
        
    }
    
    
            
    
    
    
}
