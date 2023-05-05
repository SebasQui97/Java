package ejercicio4_gradosf;

import java.util.Scanner;

public class Ejercicio4_GradosF {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double degreesC, Fdegrees;
        
        System.out.print("¿Cuáles son los grados centígrados a convertir?: ");
        degreesC = read.nextDouble();
        
        Fdegrees = ((degreesC*9)/5)+32;
        
        System.out.println("Los grados en farenheit son: " + Fdegrees);
    }
    
}
