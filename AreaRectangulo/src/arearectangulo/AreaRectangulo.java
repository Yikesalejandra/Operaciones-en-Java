/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosjava; 

/**
 *
 * @author monts
 */
public class AreaRectangulo {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingresa el largo del rectángulo: ");
        double largo = input.nextDouble();
        
        System.out.print("Ingresa el ancho del rectángulo: ");
        double ancho = input.nextDouble();
        
        double area = largo * ancho;
        
        System.out.println("El área del rectángulo es: " + area);
    }
}


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
