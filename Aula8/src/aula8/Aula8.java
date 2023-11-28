package aula8;

import java.util.Scanner;

public class Aula8 {
   
    public static void main(String[] args) {
        ControleTV ctv = new ControleTV();
        Scanner sc = new Scanner(System.in);
        int opcao;
        
        do{
             
            opcao = ctv.cabecalho(sc);
        
            switch(opcao) {
                case 1:
                    System.out.print("Digite o nível do volume (1-10): ");
                    System.out.println("\n--------------------------------");
                    int volMax = sc.nextInt();
                    ctv.aumentarVolume(volMax);
                    break;
                case 2:
                    System.out.print("Digite o nível do Volume (1-10): ");
                    System.out.println("\n--------------------------------");
                    int volMin = sc.nextInt();
                    ctv.diminuirVolume(volMin);
                    break;
                case 3:
                    System.out.println("Saindo...");
                    System.out.println("--------------------------------");
                    break;
                default:
                    System.out.println("Menu inválido!");
                    System.out.println("--------------------------------");
            }
        
        
        }while(opcao != 3);
        
        
        sc.close();
        
    }
    
}
