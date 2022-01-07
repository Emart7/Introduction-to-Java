package ventanas_emergentes;

import javax.swing.JOptionPane;

public class Ventanas_Emergentes {

    public static void main(String[] args) {
        // TODO code application logic here
        
        //Create variables
        
        int numero_Entero;
        double numero_Decimal;
        float numero_Flotante;
        String cadena;
        char caracter;
        
        //casting y message out
        numero_Entero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entero: "));
        numero_Decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite un numero decimal: "));
        numero_Flotante = Float.parseFloat(JOptionPane.showInputDialog("Digite un numero flotante: "));
        cadena = JOptionPane.showInputDialog("Digite una cadena de texto: ");
        caracter = JOptionPane.showInputDialog("Digite un caracter").charAt(0);
        
        //Salida
        JOptionPane.showMessageDialog(null, "El numero entero es " + numero_Entero);
        JOptionPane.showMessageDialog(null, "El numero numero_Decimal es " + numero_Decimal);
        JOptionPane.showMessageDialog(null, "El numero numero_Flotante es " + numero_Flotante);
        JOptionPane.showMessageDialog(null, "El numero cadena es " + cadena);
        JOptionPane.showMessageDialog(null, "El numero caracter es " + caracter);
        
        
    }
    
}
