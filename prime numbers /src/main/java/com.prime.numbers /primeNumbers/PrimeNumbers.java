

public class PrimeNumbers {

    /*
    * print all the prime numbers from 2 up to 1000
    * checking by isPrime method
    */
    private static void printPrimesNumbers(){
        for (int num = 2; num <= 1000; num++) {
            if(isPrime(num)) {
                System.out.println(num);
            }
        }
    }

    /**
    * Checks if a number is prime.
    * num must start from 2 because anything less is not a prime number
    * @param num the integer to check
    * @return true if prime, false otherwise
    */
    private static boolean isPrime(int num){
        if(num < 2) return false;

        for(int i = 2; i * i <= num; i++){
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        printPrimesNumbers();
    }

}