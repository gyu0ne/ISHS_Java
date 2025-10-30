import java.util.Scanner;

public class ExceptionTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Numerator");
        int numerator = scanner.nextInt();
        System.out.println();
        System.out.print("Input Denominator");
        int denominator = scanner.nextInt();

        System.out.println(numerator/denominator);
    }
}
