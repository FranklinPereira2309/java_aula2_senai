package aula2;


public class Caneta {
    String marca;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status() {
        System.out.println("Uma caneta de marca: " + this.marca);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Cor: " + this.cor);
        System.out.println("Carga: " + this.carga);
        System.out.println("Esta tamapada? " + this.tampada);
    }
    
    void tampar() {
        this.tampada = true;
    }
    
    void destampar() {
        this.tampada = false;
    }
    
    void escrever() {
        if(this.tampada == true) {
            System.out.println("Não é poss´vel escrever");
        }else {
            System.out.println("Está apta a escrever");
        }
    }
}
