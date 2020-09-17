package poo;

public class CadeiraEscritorio extends Cadeira{

      

    @Override
    public void massagear() {
       System.out.println("Não possuo esta função");
    }
    
    public void girar(){
        
       System.out.println("Sou uma cadeira giratoria");
    }
    
    
    public CadeiraEscritorio(String cor, String marca) {
        super(cor, marca);
    }
    
    
    
}
