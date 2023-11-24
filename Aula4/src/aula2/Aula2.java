package aula2;

public class Aula2 {
   
    public static void main(String[] args) {
        /*
       Caneta c1 = new Caneta();
       
       c1.setModelo("Bic");
       System.out.println("Modelo é: "+c1.getModelo());
       
       c1.setPonta(0.7f);
       System.out.println(c1.getPonta());*/
       
        Caneta c2 = new Caneta("Bic",1.0f); 
        System.out.println("Modelo: " + c2.getModelo());
        System.out.println("Ponta: " + c2.getPonta());
        
       
        
        
    }
    
}
