package poo;

import java.util.Objects;

public class Cadeira {
    
    public String cor;
    String marca;

    public String getMarca() {
        return marca;
    }
        
  
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public void massagear() {
        
        System.out.println("O modo massagem foi ligado.");
                
    }

    public Cadeira(String cor, String marca) {
        this.cor = cor;
        this.marca = marca;
        
        //lembrar do set
    }

    @Override
    public String toString() {
        return "Cadeira{" + "cor=" + cor + ", marca=" + marca + '}';
    }
    
    
    
    
}
