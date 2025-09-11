import java.util.Scanner;

public class PrimeGame {
    // 숫자 하나를 받아서 해당 수가 소수면 true, 소수가 아니면 false return
    public static boolean isPrime(int n) {


        return  true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean isPrime = true;
        int num = scanner.nextInt();

        if(num <= 1) {
            isPrime = false;
        }
        else {
            for(int i=2; i<=Math.sqrt(num); i++){
                if(num%i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if(isPrime == true){
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}