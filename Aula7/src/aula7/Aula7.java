package aula7;

import java.util.Scanner;

public class Aula7 {
   
    public static void main(String[] args) {
        Retangulo ret1 = new Retangulo();
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a base do retangulo: ");
        int base = scanner.nextInt();
        ret1.setBase(base);
        System.out.println("Digite a altura do retangulo: ");
        int altura = scanner.nextInt();
        ret1.setAltura(altura);
        
        ret1.calcularArea(ret1.getBase(), ret1.getAltura());
        ret1.calcularPerimetro(ret1.getBase(),ret1.getAltura());
        
        System.out.println("O Base do Retangulo digitado eh: " + ret1.getBase());
        System.out.println("O Altura do Retangulo digitado eh: " + ret1.getAltura());
        System.out.println("A Area do Retangulo eh: " + ret1.getArea() + "m2");
        System.out.println("O Perímetro eh: " + ret1.getPerimetro() + "m2");
        
        
        
        
        
        
        
        
        
    }
    
}
