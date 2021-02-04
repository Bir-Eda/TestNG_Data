package genericMethods;

import org.testng.annotations.Test;

public class Methods {
    public static int maxElement(int[] arr) {
        int max = 0;
        for (int num : arr) {
            if (num > max) {
                max = num;

            }

        }
        return max;
    }

    public static int minElement(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;

            }

        }
        return min;
    }

    @Test
    public static int fibonacci(int number) {
        //fib number 1,1,2,3,5,8,13,21,...
        if (number <= 1) {
            return number;
        }
        return fibonacci(number - 1) + fibonacci(number - 2);
    }

    @Test
    public static int factorial(int num) {
        // 5!  5*4*3*2*1
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;

        }
        return fact;
    }

    @Test
    public static boolean isPrime(int num) {

        if (num <= 1) {  //num<2 de yazabiliriz
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {     // asal sayilar 2 den baslar o yuzden i=2 ile baslar

            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Test
    public static int numReverse(int num) {
        int reverseNum = 0;
            while (num != 0) {  // yada while(num>0)
                reverseNum = reverseNum * 10 + num % 10;
                num = num / 10;
            }
        return reverseNum;
    }
}
