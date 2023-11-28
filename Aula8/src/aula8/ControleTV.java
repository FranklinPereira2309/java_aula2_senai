
package aula8;

import java.util.Scanner;

public class ControleTV {
    public int canal, volume = 1;

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

   public void aumentarVolume(int vol) {
       
       
       if(this.volume >= 0 && this.volume <= 10){
           this.volume += vol;
           System.out.println("Seu volume foi aumentado em " + this.volume);
           System.out.println("--------------------------------");
       }else if(this.volume == 10) {
           System.out.println("Você atingiu o Máximo de Som possível");
           System.out.println("--------------------------------");
       }else {
           System.out.println("Volume digitado inválido!");
           System.out.println("--------------------------------");
       }
       
       
   
     }
   
   public void diminuirVolume(int vol) {
       
       if(this.volume > 0 && this.volume <=10 ) {
           if(this.volume >= vol) {
                this.volume -= vol;
                System.out.println("Seu volume foi diminuído em " + this.volume);
                System.out.println("--------------------------------");
           }else {
               System.out.println("O valor é MAIOR do que o volume Atual.");
                            
           }
           
       }else if(vol == 0) {
           System.out.println("Mute!");
       }else if(this.volume < 0) {
           System.out.println("Você atingiu o Mínimo de Som possível");
           System.out.println("--------------------------------");
       }else {
           System.out.println("Volume digitado inválido!");
           System.out.println("--------------------------------");
       }
       
       
       
   }
   
    public int cabecalho(Scanner sc) {
            
            int opcao = 1;
            System.out.println("**********> Menu Controle <***********");
            System.out.println("******** Volume Atual: "+this.getVolume()+" vol *********");
            System.out.println(this.volume == 0 ? "Volume eh Mudo" : " ");
            System.out.println(this);
            System.out.println("1- Aumentar Volume");
            System.out.println("2 - Diminuir Volume");
            System.out.println("3 - Sair");
            System.out.print("Digite uma opção (1-3): ");
            System.out.println(" ");
            opcao = sc.nextInt();

            return opcao;
    }
       
       
    
    
    
}
