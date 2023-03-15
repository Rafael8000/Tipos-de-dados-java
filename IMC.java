import java.util.Scanner;




public class IMC {
    

public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    double altura;
    double peso;
    double IMC;

    System.out.println("informe sua altura:");
    altura = input.nextDouble();

    System.out.println("informe sua peso:");
    peso = input.nextDouble();

    IMC =  peso / (altura * altura); 
    if (IMC >= 18.5){
         System.out.print("Abaixo do peso" + IMC);
         if( IMC <= 18.5 )
         {
         System.out.print( "Abaixo do Peso");
         }
         else if( IMC <=18.5  && IMC <=24.9){
             System.out.print(  "Peso Normal");
         }
         else if( IMC >=25.0 && IMC <= 29.9){
             System.out.print(  "Sobrepeso");
         }
         else if( IMC >=30.0 && IMC <= 34.9){
             System.out.print(  "Obesidade grau 1");
         }
         else if( IMC >=35.0 && IMC <= 39.9){
             System.out.print(  "Obesidade grau 2");
         } else{
         System.out.print(  "Obesidade grau 3");
         }
 
 
     }         
 }
 
        }


