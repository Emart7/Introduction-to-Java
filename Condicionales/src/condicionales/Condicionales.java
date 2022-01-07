package condicionales;

import java.util.Scanner;


public class Condicionales {

    public static void main(String[] args) {
        // TODO code application logic here
        
        //Implement switch
        
        Scanner entrada2 = new Scanner(System.in);
        
        char camino;
        
        System.out.println("Elija su camino preferido: ");
        camino = entrada2.next().charAt(0);
        
        switch(camino){
        case 'A':
            System.out.println("Elegistes el camino A.");
            break;
        case 'B':
            System.out.println("Elegiste el camino B.");
            break;
        case 'C':
            System.out.println("Elegiste el camino C.");
            
        default:
            System.out.println("No elegiste ningun camino.");
        
        }
       
        
    }
    
}
