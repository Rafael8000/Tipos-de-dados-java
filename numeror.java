import java.util.Scanner;




public class numeror {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numero;

        System.out.println("manda um número ai:");
        numero = input.nextInt();

        if (numero > 0 ){
            System.out.print("positivo\n");
             
    }
    else if(numero < 0){
System.out.print("negativo\n");
    }
    else{
        System.out.print("é apenas zero \n");
    }
    }
}