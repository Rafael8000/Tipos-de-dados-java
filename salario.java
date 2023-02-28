import java.util.Scanner;




public class salario {
    

public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    double salarioatual;
    double salarionovo;

    System.out.println("informe seu salario:");
    salarioatual = input.nextDouble();

    if (salarioatual>= 1000 && salarioatual < 2000){
        salarionovo =  salarioatual * 1.15;
         System.out.print("Salário novo:" + salarionovo);
}

else if(salarioatual >= 2000 && salarioatual < 3000){
    salarionovo =  salarioatual * 1.10;
    System.out.print("Salário novo:" + salarionovo);
}
else{
    salarionovo = salarioatual * 1.05;
    System.out.print("salário novo\n" + salarionovo);
}
}
}
