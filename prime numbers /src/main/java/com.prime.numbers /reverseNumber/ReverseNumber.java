

public class ReverseNumber {


    private static int reverseNum(int num){
        int reversed = 0;

        System.out.println("Original Number: " + num);

        /*
         * Why % 10 (modulus):
         * % gives me the remainder after dividing by 10. Since our number system is base 10,
         *  dividing by 10 and looking at the remainder always isolates the last (rightmost) digit.
         * 3956 % 10 = 6 -> that's the last digit.
         *
         * Why / 10 (integer division):
         * Integer division in Java truncates decimals. Dividing by 10 shifts everything one place to the right,
         *  effectively deleting the last digit.
         * 3956 / 10 = 395 -> the last digit is gone.
         *
         * Why reversed * 10 + digit:
         * This builds the new number digit by digit, but each time you add a new digit,
         *  you need to shift the existing digits one place to the left (multiply by 10) to make room,
         *  then drop the new digit into the now-empty last slot (+ digit).
         */

        // run loop until num becomes 0
        while(num != 0) {

            // get last digit from num
            int digit = num % 10;               // peel off the last digit
            reversed = reversed * 10 + digit;  // push it into the reversed number

            // remove the last digit from num
            num /= 10;
        }

            System.out.println("Reversed Number: " + reversed);
            return reversed;
    }


    public static void main(String[] args){
        reverseNum(3956);
    }

}