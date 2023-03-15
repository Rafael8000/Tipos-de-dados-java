import java.util.Scanner;


public class Semana {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dia;
    
        System.out.println("informe o dia:");
        dia = input.nextInt();
        
        
         if ( dia == 1 ){
            System.out.println( "Domingo");
         }
         else if( dia == 2){
         System.out.println("Segunda feira");
        }
        else if( dia == 3){
            System.out.println("Terça feira");
           }
           else if( dia == 4){
            System.out.println("Quarta feira");
           }
           else if( dia == 5){
            System.out.println("Quinta feira");
           }
           else if( dia == 6){
            System.out.println("Sexta feira");
           }
           else if( dia == 7){
            System.out.println("Sábado");
           }
        }
    }

