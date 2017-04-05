/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lpoo.s04desafio;

/**
 *
 * @author Hugo'
 */
import java.util.Scanner;
public class LpooS04desafio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    System.out.println("Bienvenido a la Aplicacion");
      System.out.println();
      
      Scanner tem = new Scanner (System.in);
      
      String nom1,nom2,nom3;
      int cant1,cant2,cant3;
      double subtotal, precio1,precio2,precio3;
      
      System.out.print("Ingrese el primer producto:     ");
      nom1 = tem.next();
      System.out.print("Cantidad del primer producto:    ");
      cant1 = tem.nextInt();
      System.out.print("Ingrese el precio del primer producto:      ");
      precio1 = tem.nextFloat();
      System.out.print("Ingrese el segundo producto:     ");
       nom2 = tem.next();
      System.out.print("Ingrese cantidad del segundo producto:    ");
      cant2 = tem.nextInt();
      System.out.print("Ingrese precio del segundo producto:      ");
      precio2 = tem.nextFloat();
      System.out.print("Ingrese el tercer producto:     ");
       nom3 = tem.next();
      System.out.print("Ingrese cantidad del tercer producto:    ");
      cant3 = tem.nextInt();
      System.out.print("Ingrese precio del tercer producto:      ");
      precio3 = tem.nextFloat();
      
subtotal = precio1+precio2+precio3 * cant1+cant2+cant3;
      double impuesto = subtotal * 0.10;
      double total = subtotal + impuesto;
      
        String mens0 = "EL SUBTOTAL ES:   " + subtotal + "\n";
        String mens1 = "EL IMPUESTO ES:   " + impuesto + "\n";
        String mens2 = "total Factura:     " + total + "\n" ;
       
        System.out.println(mens0);
        System.out.println(mens1);  
        System.out.println(mens2);

    }
    
}
