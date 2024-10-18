import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        int number;
        System.out.print("Número?: ");

        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();

        if(number % 2 == 0) {
            System.out.println("Par.");
        } else {
            System.out.println("Ímpar.");
        }
    }
}
