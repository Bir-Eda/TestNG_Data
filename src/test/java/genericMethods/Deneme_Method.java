package genericMethods;

public class Deneme_Method {
    public static void main(String[] args) {
      int [] number={1,2,3,9,5,12,0};
      //  System.out.println("max num is : " +findMax(number));
      //  System.out.println("min number is : " +findMin(number));
        int num=6;
        System.out.println(fibonacci(num));   // 112358
        System.out.println(factorial(num));   // 6*5*4*3*2*1
    }
    public static int findMax(int []arr){
        int max=0;

            for(int num:arr){
                if(num>max){
                    max=num;
                }
            }
        return max;
    }
    public static int findMin(int []arr){
        int min=0;

        for(int num:arr){
            if(num<min){
                min=num;
            }
        }
        return min;
    }
   public static int fibonacci(int num){
        if(num<=1){
            return num;
        }
        return fibonacci(num-1)+fibonacci(num-2);
   }


    public static int factorial(int num){
        int fact=1;
        for (int i = 1; i<=num ; i++) {
            fact=fact*i;

        }
        return fact;
    }
}
