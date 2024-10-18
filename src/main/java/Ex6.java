import java.util.Scanner;
public class Ex6 {
    public static void main(String[] args) {
        int value;

        Scanner keyboard = new Scanner(System.in);
        do {
            System.out.print("Número natural (>0)?: ");
            value = keyboard.nextInt();
        } while( value <= 0 );

        if(value % 2 == 0) {
            System.out.println("Número par.");
        } else {
            System.out.println("Número ímpar.");
        }
    }
}
