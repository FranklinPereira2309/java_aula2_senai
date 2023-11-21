package aula2;


public class Caneta {
    public String marca;
    public String cor;
    public float ponta;
    protected int carga;
    private boolean tampada;
            
          
    
    public void status() {
        System.out.println("Uma caneta de marca: " + this.marca);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Cor: " + this.cor);
        System.out.println("Carga: " + this.carga);
        System.out.println("Esta tamapada? " + this.tampada);
    }
    
    protected void tampar() {
        this.tampada = true;
    }
    
    protected void destampar() {
        this.tampada = false;
    }
    
    public void escrever() {
        if(this.tampada == true) {
            System.out.println("Não é poss´vel escrever");
        }else {
            System.out.println("Está apta a escrever");
        }
    }
}
