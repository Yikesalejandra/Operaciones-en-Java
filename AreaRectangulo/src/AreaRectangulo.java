/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author monts
 */
public class AreaRectangulo {
        public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario la base y la altura del rectángulo
        System.out.print("Ingrese la base del rectángulo: ");
        double base = scanner.nextDouble();
        
        System.out.print("Ingrese la altura del rectángulo: ");
        double altura = scanner.nextDouble();
        
        // Calcular el área
        double area = base * altura;
        
        // Mostrar el resultado
        System.out.println("El área del rectángulo es: " + area);
        
        // Cerrar el scanner
        scanner.close();
    }
}
    