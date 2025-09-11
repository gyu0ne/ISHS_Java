import java.util.Scanner;

public class PrimeGame {
    // 숫자 하나를 받아서 해당 수가 소수면 true, 소수가 아니면 false return
    public static boolean isPrime(int n) {
        if(n <= 1) {
            return false;
        }
        else {
            for(int i=2; i<=Math.sqrt(n); i++){
                if(n%i == 0) {
                    return false;
                }
            }
        }
        return  true;
    }

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // int num = scanner.nextInt();

        int[] numbers = {111, 977, 1, 2, 53, 1200};

        for(int number : numbers) // range based for
        {
            if (isPrime(number)) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        }

//        for(int j=0; j<6; j++)
//        {
//            if (isPrime(numbers[j])) {
//                System.out.println(numbers[j] + " is a prime number.");
//            } else {
//                System.out.println(numbers[j] + " is not a prime number.");
//            }
//        }
    }
}