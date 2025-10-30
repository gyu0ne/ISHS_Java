import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numerator = 0;
        int denominator = 0;

        try {
            System.out.print("Input Numerator : ");
//        double numerator = scanner.nextDouble();
            numerator = scanner.nextInt();
            System.out.println();
            System.out.print("Input Denominator : ");
//        double denominator = scanner.nextDouble();
            denominator = scanner.nextInt();

            System.out.println(numerator/denominator);
        } catch (InputMismatchException err) {
            System.out.println("숫자로 입력하셈");
        }

        if (denominator == 0) {
            System.out.println("분모는 0이 될 수 없으셈");
        } else {
            System.out.println(numerator/denominator);
        }
    }
}
