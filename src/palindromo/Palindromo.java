/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package palindromo;

import java.util.Scanner;

/**
 *
 * @author egome
 */
public class Palindromo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner sc= new Scanner(System.in);
        System.out.print("Introduce una frase (puede tener puntos, comas y espacios): ");
        String cadena=sc.nextLine();
        
        cadena=cadena.replace(" ", "");
        cadena=cadena.replace(",", "");
        cadena=cadena.replace(".", "");
        System.out.print(cadena);
        int fin = cadena.length()-1;
        int ini=0;
        boolean espalin=true;
        
        while(ini < fin){
            if(cadena.charAt(ini)!=cadena.charAt(fin)){
                espalin=false;
            }
        ini++;
        fin--;
        }
        if(espalin)
            System.out.print("\nEs palindromo.");
        else
            System.out.print("\nNo es palindromo.");
       
        // TODO code application logic here
    }
    
}
