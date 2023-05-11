/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calcularmedia;

/**
 *
 * @author rider
 */
import java.util.Scanner;

public class CalcularMedia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double numero, suma = 0, media;
        int contador = 0;
        do {
            System.out.print("Ingresa un número real (ingresa 0 para salir): ");
            numero = input.nextDouble();
            if(numero != 0) {
                suma += numero;
                contador++;
            }
        } while(numero != 0);
        if(contador == 0) {
            System.out.println("No se ingresaron números para calcular la media.");
        } else {
            media = suma / contador;
            System.out.println("La media de los números ingresados es: " + media);
        }
    }
}
