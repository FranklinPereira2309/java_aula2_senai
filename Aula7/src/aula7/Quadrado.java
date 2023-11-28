package aula7;

public class Quadrado {
    
    public int lado;
    public int area;

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
            
    public int calcular(int l) {
        
        area =(l * l);
        return area;
    }

   
    
    
    
}
