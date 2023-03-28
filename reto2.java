import java.util.Scanner;

public class reto2 {
    public static void main(String[]args){
        int edad;
        int peso;
        int meses;
        int dosisvac;
        try (Scanner scanner = new Scanner (System.in)) {
            System.out.println("ingrese la edad del bebe");
             edad = scanner.nextInt();
             System.out.println("ingrese el peso del bebe: ");
             peso = scanner.nextInt(); 
           System.out.println("ingrese los meses ");
            meses = scanner.nextInt();
        } 
        dosisvac= ((meses * 10) / (peso + 10)) * 8;
         System.out.println("la edad del bebe es" + " " + edad + "la dosis que le debe dar al bebe es" + dosisvac);
        }
        }

