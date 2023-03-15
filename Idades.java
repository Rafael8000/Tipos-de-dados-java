import java.util.Scanner;


public class Idades {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pessoa1, pessoa2;
        int idade1, idade2;
    
        System.out.println("informe seu nome:");
        pessoa1 = input.next();

        System.out.println("informe sua idade:");
        idade1 = input.nextInt();

        System.out.println("informe seu nome:");
        pessoa2 = input.next();

        System.out.println("informe sua idade:");
        idade2 = input.nextInt();
        
        
         if (idade1 > idade2){
            System.out.println( "a pessoa mais velha é:" + pessoa1);
            System.out.println("sua idade é:" +idade1);
         }
         else if( idade2 > idade1){
         System.out.println("a pessoa mais velha é" + pessoa2);
         System.out.println("sua idade é" + idade2 );
         
        }
    
        }
    
    }

