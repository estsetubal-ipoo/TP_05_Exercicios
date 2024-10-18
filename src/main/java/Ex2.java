import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        int value, doubleValue;

        System.out.print("Valor?: ");

        Scanner scanner = new Scanner(System.in);
        value = scanner.nextInt();

        doubleValue = value * 2;

        System.out.println(value + " * 2 = " + doubleValue);
    }
}
