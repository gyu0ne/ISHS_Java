import java.util.Scanner;

public class ExceptionTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Numerator : ");
//        double numerator = scanner.nextDouble();
        int numerator = scanner.nextInt();
        System.out.println();
        System.out.print("Input Denominator : ");
//        double denominator = scanner.nextDouble();
        int denominator = scanner.nextInt();

        if (denominator == 0) {
            System.out.println("분모는 0이 될 수 없으셈");
        } else {
            System.out.println(numerator/denominator);
        }
    }
}
