/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author monts
 */
import java.util.Scanner;

public class PromedioNumeros {
        public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese tres números
        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();
        
        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();
        
        System.out.print("Ingrese el tercer número: ");
        double numero3 = scanner.nextDouble();

        // Calcular el promedio
        double promedio = (numero1 + numero2 + numero3) / 3;
        
        // Mostrar el resultado
        System.out.println("El promedio de los tres números es: " + promedio);
        
        // Cerrar el scanner
        scanner.close();
    }
}