package aula2;

import java.util.Scanner;

public class Aula2 {
   
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a marca: ");
        c1.marca = sc.nextLine();
        System.out.println("Digite a cor");
        c1.cor = sc.nextLine();
        System.out.println("Digite a ponta");
        c1.ponta = sc.nextFloat();
        
        System.out.println("Digite a carga: ");
        c1.carga = sc.nextInt();
        c1.tampar();
        c1.status();
        c1.escrever();
        
        //c1.escrever();
    }
    
}
