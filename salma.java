import java.util.Scanner;


public class salma {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n1, n2, soma;

        System.out.println( "informe o valor do primeiro número:");
        n1 = input.nextInt();

        System.out.println ("Informe o valor do segundo número:");
        n2 = input.nextInt();

        soma = n1 + n2;

        System.out.printf("Seu primeiro número foi =" + n1);
        System.out.printf(" \n Seu primeiro número foi =" + n2);
        System.out.printf(" \n Seu primeiro número foi = " + soma + "\n");
    }



}
