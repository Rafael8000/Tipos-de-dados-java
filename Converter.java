import java.util.Scanner;


public class Converter {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Double metros, centimetro;

    System.out.println("informe os metros:");
    metros = input.nextDouble();
    
     centimetro = metros *100;
     
     System.out.println("os metros em centimetros são:" + centimetro);
}

}

