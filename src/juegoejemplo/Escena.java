
package juegoejemplo;

import java.util.Scanner;

public class Escena {
    private Auto auto;
    private Pared pared;
    
    public Escena(Auto auto){
           this.auto=auto;
           this.pared=new Pared();
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }
    
    public void jugar(){
    
        Scanner scanner = new Scanner(System.in);
        char userChar = ' ';
        

        while (userChar != 'e') {
            System.out.println("Auto: "+auto.getPosX()+" "+auto.getPosY());
            userChar = scanner.next().charAt(0);
            //mover el auto
            switch (userChar) {
                case 'w':
                    auto.moverArriba();
                    break;
                case 's':
                    auto.moverAbajo();
                    break;
                case 'a':
                    auto.moverIzquierda();
                    break;
                case 'd':
                    auto.moverDerecha();
                    break;
                default:
                    break;
            }
            
            if (auto.getPosX() >= pared.getPosX() && auto.getPosX() <= pared.getPosX()+5 && auto.getPosY() >= pared.getPosY() && auto.getPosY() <= pared.getPosY()+5 ){
                auto.setChocado(true);
            }
        }
        
        scanner.close();
        //Utilizando Scanner
        //A ---Izquierda
        //S---Abajo
        //D--Derecha
        //W---Para arriba
        //E..Salir del juego
        //si el auto choca con la pared, el auto queda chocado.
    }
    
}
