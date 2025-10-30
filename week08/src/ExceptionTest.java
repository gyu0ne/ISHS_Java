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

            System.out.println(numerator / denominator);

            int[] array = {99, -7, 33};
            System.out.println(array[1]);
//              System.out.println(array[3]);
        } catch (InputMismatchException err) {
            System.out.println("숫자로 입력하셈");
            System.out.println(err.getMessage());
        } catch (ArithmeticException err) {
            System.out.println("분모는 0이 될 수 없으셈");
            System.out.println(err.getMessage());
        } catch (ArrayIndexOutOfBoundsException err) {
            System.out.println("인덱스 범위를 벗어났으셈");
            System.out.println(err.getMessage());
        } catch (Exception err) {
            System.out.println("잘 모르겠는데 암튼 예외 발생했으셈");
            System.out.println(err.getMessage());
        } finally { // 예외 발생 영부에 관계 없이 실행
            System.out.println("프로그램을 종료하셈");
            // 자원 해제 등 필요 시 사용
        }
    }
}
