
import javax.swing.JOptionPane;

public class Flecha{
        int log;

        int color;

    public Flecha(){
        log= Integer.parseInt(JOptionPane.showInputDialog("Aqui puedes ingresar la longuitud de la flecha"));
        color= Integer.parseInt(JOptionPane.showInputDialog("puedes ingresar el numero 1 si el color es negro y tambien puedes ingresar si la flcha que desees es roja"));
    }
    public void construir(){
        for (int i = 0; i < log; i++) {
            if(color==1){
                System.out.print("*");
            }else {
                System.err.print("*");
            }
        }   
        if(color==1){
            System.out.print(">");
           
        }else{
            System.err.print(">");
          
        } 
    }

    public void espacio(){
        System.out.println("");
    }
    
    
}