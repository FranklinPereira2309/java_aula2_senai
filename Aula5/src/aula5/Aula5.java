package aula5;

public class Aula5 {
   
    public static void main(String[] args) {
        /*
       Caneta c1 = new Caneta();
       
       c1.setModelo("Bic");
       System.out.println("Modelo é: "+c1.getModelo());
       
       c1.setPonta(0.7f);
       System.out.println(c1.getPonta());*/
       
        Aluno primeiro = new Aluno("Franklin", "1234567", 46);
        System.out.println("Nome: " +primeiro.getNome());
        System.out.println("Matricula: " + primeiro.getMatricula());
        System.out.println("Idade: " + primeiro.getIdade()); 
       
        
        
       
        
        
    }
    
}
