package testSauceLab;

import genericMethods.Methods;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Interview {
    @Test
    public void swappingNumber(){
        int a=10, b=20;
        //System.out.println(a+ " " +b);
        /*
        // with 3rd variable
        int c=a;
        a=b;
        b=c;
        System.out.println(a+" "+b);
        */
        // without 3rd variable
        a=a*b;
        b=a/b;
        a=a/b;
        System.out.println(a+" "+b);
    }
    @Test
    public void reverse(){
        String text="Melih";
        String empty="";
        for (int i =text.length()-1; i>=0; i--) {
            empty+=text.charAt(i);

        }
        System.out.println(empty);
    }
    @Test
    public void findMax() {
        int []array={1,6,52,2,41,13};
        System.out.println(Methods.maxElement(array));

    }
    @Test
    public void findMin() {
        int []array={6,52,2,41,1,13};
        System.out.println(Methods.minElement(array));

    }
    @Test
    public void fibonacci() {
        int num = 15;
      //  Methods m=new Methods();  method static degilse(generic methodslarin oldugu yerde) object olusturarak metodu cagiririz
      // object olusturmak istemiyorum metodum da (generic methodslarin oldugu yerde) static degil ne yaparim extends yaparim
        System.out.println(Methods.fibonacci(num));
    }
    @Test
    public void factorial() {
        int fact=8;
        System.out.println(Methods.factorial(fact));
    }
    @Test
    public void isPrime() {
        int num=17;
        System.out.println(Methods.isPrime(num));
    }
    @Test
    public void reverseNum() {
        int num=123456789;
        System.out.println(Methods.numReverse(num));


    }



}
