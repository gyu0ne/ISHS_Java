import java.util.Scanner;

public class PrimeGame {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int num = scanner.nextInt();

        for(int i=2; i<num; i++){
            if(num%i == 0) {
                counter++;
                break;
            }
            System.out.print(i+" ");
        }
        if(counter==0){
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}
