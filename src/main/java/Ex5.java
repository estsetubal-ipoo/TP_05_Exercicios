import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        int a, b, c, smallest;

        System.out.println("Dá-me 3 valores e du digo-te qual o menor!");

        Scanner sc = new Scanner(System.in);

        System.out.print("a?:");
        a = sc.nextInt();

        System.out.print("b?:");
        b = sc.nextInt();

        System.out.print("c?:");
        c = sc.nextInt();

        smallest = a;

        if(b < smallest) {
            smallest = b;
        }

        if(c < smallest) {
            smallest = c;
        }

        System.out.println("O menor valor é " + smallest);
    }
}
