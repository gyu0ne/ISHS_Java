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
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if(isPrime(num)){
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}