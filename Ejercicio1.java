import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[]args){
int numero1;
int numero2;
int total;
String nombreUsuario;
try (Scanner scanner = new Scanner (System.in)) {
    System.out.println("ingrese el primer numero a sumar: ");
     numero1 = scanner.nextInt();
     System.out.println("ingrese el segundo numero a sumar: ");
     numero2 = scanner.nextInt();
     System.out.println("ingrese su usuario");
    nombreUsuario = scanner.next();
} 

total = numero1 + numero2;
 System.out.println("hola "+ nombreUsuario +  " ingresaste los numeros " + numero1 +" "+ numero2 +" y el resultado de la suma es  "  + total);
}
}