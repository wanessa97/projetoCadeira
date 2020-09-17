package poo;

public class POO {

    public static void main(String[] args) {
      
        Cadeira cad = new Cadeira("amarela", "dell");
        System.out.println(cad);
        
        Banco ban = new Banco("preto", "madeira");
        System.out.println(ban);
        ban.massagear();
        ban.dobravel();
        
        Cadeira escri = new CadeiraEscritorio("azul", "Brastemp");
        System.out.println(escri);
    }
    
}
