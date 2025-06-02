/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author monts
 */
import java.util.Scanner;

public class IndiceMasaCorporal {
        public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese su peso en kilogramos
        System.out.print("Ingrese su peso en kilogramos: ");
        double peso = scanner.nextDouble();
        
        // Solicitar al usuario que ingrese su altura en metros
        System.out.print("Ingrese su altura en metros: ");
        double altura = scanner.nextDouble();

        // Calcular el IMC
        double imc = peso / (altura * altura);
        
        // Mostrar el resultado
        System.out.printf("Su Índice de Masa Corporal (IMC) es: %.2f%n", imc);
        
        // Determinar la categoría de IMC
        if (imc < 18.5) {
            System.out.println("Categoría: Peso bajo");
        } else if (imc >= 18.5 && imc < 24.9) {
            System.out.println("Categoría: Peso normal");
        } else if (imc >= 25 && imc < 29.9) {
            System.out.println("Categoría: Sobrepeso");
        } else {
            System.out.println("Categoría: Obesidad");
        }
        
        // Cerrar el scanner
        scanner.close();
    }
}