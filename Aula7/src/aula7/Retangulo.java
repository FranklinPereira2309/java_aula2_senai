
package aula7;


public class Retangulo {
    private int base;
    private int altura;
    private int area;
    private int perimetro;

    public int getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(int perimetro) {
        this.perimetro = perimetro;
    }
    
        
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }
    
    public int calcularArea(int a, int b) {
        area = (a * b);
        return area;
    }
    
    public int calcularPerimetro(int a , int b) {
        perimetro = 2 * (a + b);
        return perimetro;
    }
}
