import java.util.Scanner;



public class InserirObjeto {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int base, altura, area;
        System.out.println("informe o valor da base:");
        base = input.nextInt();
        System.out.println("informe o valor da altura:");
        altura = input.nextInt();

        area = base * altura;

        System.out.println("A area de um retangulo de base =" + base);
        System.out.println("\n A altura de um retangulo de base =" + altura);
        System.out.println("\n é =" + area + "\n");
        




    }
}
