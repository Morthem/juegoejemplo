package juegoejemplo;

public class JuegoEjemplo {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Auto ford = new Auto("rojo", 10,5);
        Auto nissan =new Auto("Amarillo",15,20);
        Escena escena1=new Escena(ford);
        Escena escena2=new Escena(nissan);
        escena1.jugar();
        escena2.jugar();

      
      
        
        
        
    }
    
}
