package ejercicio3_frase;

import java.util.Scanner;

public class Ejercicio3_Frase {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String phrase;
        
        System.out.print("Por favor introduce una frase: ");
        phrase = read.nextLine();
        
        System.out.println("Frase en mayúscula: " + phrase.toUpperCase());
        System.out.println("Frase en minúscula: " + phrase.toLowerCase());
    }
    
}
