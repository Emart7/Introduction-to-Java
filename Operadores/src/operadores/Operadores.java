package operadores;

import java.util.Scanner;

public class Operadores {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        int numero1;
        int numero2;
        
        int numero3 = 7;        
        numero3 = numero3 + 3;
        
        //Concadenar
        String cadena = "Hola me llamo Euler";
        cadena = cadena + " y soy de Valledupar";
        cadena += " y vivo en Convencion";
        
        System.out.println(cadena);
        System.out.println(numero3);
        
        System.out.print("Digite el numero 1: ");
        numero1 = entrada.nextInt();
        
        System.out.print("Digite el numero 2: ");
        numero2 = entrada.nextInt();
        
        System.out.println(" ");
        
        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;
        int division = numero1 / numero2;        
      
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicacion es: " + multiplicacion);
        System.out.println("La division es: " + division);
        
        
    }
    
}
