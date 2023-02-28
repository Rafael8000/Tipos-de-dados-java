import java.util.Scanner;



public class Atividade {
 
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int idade;
        String nome;

        System.out.println("Qual é sua idade?:");
        idade = input.nextInt();

        System.out.println("Qual é seu nome?:");
        nome = input.next();

    if (idade >= 0 &&  idade <= 12){
        System.out.print("criança\n");
        System.out.print("\n"+ nome );
    }
else if (idade >= 13 &&  idade <= 17){
    System.out.print("adolescente\n");
    System.out.print("\n"+ nome );    
}
else if (idade >= 18 &&  idade <= 59){
    System.out.print("adulto\n");
    System.out.print("\n"+ nome ); 
    }
else{
    System.out.print("idoso \n");
    System.out.print("\n"+ nome );
}
    }
}
