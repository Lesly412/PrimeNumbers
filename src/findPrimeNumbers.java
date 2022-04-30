import java.util.ArrayList;
import java.util.Scanner;

public class findPrimeNumbers {
    public static void main(String[] args) {
        System.out.println(" Enter the Start number: ");
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        System.out.println(" Enter the End number: ");
        int end = scanner.nextInt();

        System.out.println("The Prime numbers between " + start + " and " + end + " is(are) : ");
        System.out.println(findPrime(start, end));
    }

    public static ArrayList<Integer> findPrime (int start, int end){
        ArrayList<Integer> primes = new ArrayList<Integer>();

        for (int n = start; n<end; n++){
            boolean primecheck = true;

            int i=2;
            while (i<= n/2){
                if (n % i == 0){
                    primecheck = false;
                    break;
                }
                i++;
            }
            if(primecheck){
                primes.add(n);
            }
        }
        return primes;
    }
}
