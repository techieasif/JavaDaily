/**
 * Created by @techieasif on February, 2020
 */
public class PrimeRange {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("PRIME NUMBERS");
        for(int i = 0; i<=100; i++){
            if(isPrime(i)){
                count++;
                System.out.println(i + " is a prime number");
            }
        }
        System.out.println("TOTAL prime Number Found between 1 & 100 are " + count);
    }

    public static boolean isPrime(int num){
        if(num == 1){
            return false;
        }
        for(int i = 2; i <= num/2; i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
}
