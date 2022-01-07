package entradadedatos;

import java.util.Scanner;

public class EntradaDeDatos {

    public static void main(String[] args) {
        // TODO code application logic here
        
        
        //Entrada de datos Scanner
        Scanner teclado = new Scanner(System.in);
        
        
        //Creamos las variables para guardar os datos que se ingresan
        int edad;
        String nombre;
        float altura;        
        
        System.out.println("Digite su edad: ");
        edad = teclado.nextInt();   // nextInt de entero    
        
        System.out.println("Digite su nombre: ");
        nombre = teclado.next(); // next apunta a caracteres
        
        System.out.println("Digite su altura: ");
        altura = teclado.nextFloat(); // apunta a decimales
        
        
        System.out.println("La edad es: " + edad);
        System.out.println("Su nombre es: " + nombre);
        System.out.println("Su altura es: " + altura);
        
    }
    
}
