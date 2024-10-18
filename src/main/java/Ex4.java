import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        int number;

        System.out.println("Introduz um número e eu digo-te " +
                "se está no intervalo [10, 20] " +
                "ou é par.");

        System.out.print("Número?: ");

        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();

        if(number >= 10 && number <= 20) {
            System.out.println("Válido!");
        } else {
           if(number % 2 == 0) {
               System.out.println("Válido!");
           } else {
               System.out.println("Inválido!");
           }
        }

        /*
        // alternativa:
        if(number >= 10 && number <= 20) {
            System.out.println("Válido!");
        } else if(number % 2 == 0) {
           System.out.println("Válido!");
        } else {
           System.out.println("Inválido!");
        }
         */
    }
}
