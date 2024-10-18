import java.util.Scanner;
public class Ex7 {
    public static void main(String[] args) {
        int value;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Valor [1, 10]?: ");
            value = sc.nextInt();
        } while(value < 1 || value > 10);

        for(int i = 1; i <= 10; i++) {
            int mult = value * i;
            System.out.println(value + " * " + i + " = " + mult);
        }
    }
}
