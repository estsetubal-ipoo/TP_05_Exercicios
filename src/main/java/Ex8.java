import java.util.Scanner;
import java.util.Random;

public class Ex8 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int number;

        Random rand = new Random();
        for(int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10);
            System.out.println("arr[" + i + "] = " + arr[i]);
        }

        System.out.println("Número a pesquisar?: ");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();

        boolean found = false;

        for(int i = 0; i < arr.length; i++) {
            if( arr[i] == number ) {
                found = true;
            }
        }

        if( found ) {
            System.out.println("Valor existe!");
        } else {
            System.out.println("Valor não existe!");
        }
    }
}
