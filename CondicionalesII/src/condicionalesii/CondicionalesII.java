package condicionalesii;

import java.util.Scanner;

public class CondicionalesII {

    public static void main(String[] args) {
        // TODO code application logic here

        //Exercise14
        //Recibir tres caracteres y realizar su sumatoria.
        //Si es mayor o igual a 100, "suma perfecta", si no, "imperfecta".
        //Se implementa lo necesario
        Scanner int14 = new Scanner(System.in);
        
        char caracter1, caracter2, caracter3;
        
        System.out.print("Ingrese el primer caracter: ");
        caracter1 = int14.next().charAt(0);
        System.out.print("Ingrese el segundo caracter");
        caracter2 = int14.next().charAt(0);
        System.out.print("Ingrese el tercer caracter");
        caracter3 = int14.next().charAt(0);
        
        if(caracter1 == caracter2 && caracter2 == caracter3){
            System.out.println("Suma perfecta");
        }
        else{
            System.out.println("Suma imperfecta.");
        }

    }
}
