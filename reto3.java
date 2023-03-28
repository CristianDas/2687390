
import java.util.Scanner;

public class reto3 {
    public static void main(String[]args){

    Scanner lectura =new Scanner(System.in);
    int moneda, suerte;
    System.out.println(" puedes elegir si quieres cara escoge el numero 1... y si deseas sello escoge 2....");
moneda=lectura.nextInt();

switch (moneda) {
    case 1:
        System.out.println("eligo cara");
    break;

case 2:
        System.out.println("eligio sello");
break;
    }
suerte=((int)(Math.random()*2+1) );
switch (suerte) {
    case 1:
    System.out.println("el juego eligio cara");
    break;

    case 2:
    System.out.println("el juego escogio sello");
    break;

}
lectura.close();    
    }
}
