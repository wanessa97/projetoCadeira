package poo;

public class Banco extends Cadeira{

    @Override
    public void massagear() {
        System.out.println("Sou somente um banco"); 
    }

   public void dobravel() {
       
       System.out.println("Posso ser inclinado.");
   }
    
    
    public Banco(String cor, String marca) {
        super(cor, marca);
    }
 
    
}
