import java.util.Scanner;

public class PrimeGame {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int num = scanner.nextInt();

        for(int i=1; i<=num; i++){
            if(num%i == 0) {
                counter++;
            }
        }
        if(counter==2){
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}
