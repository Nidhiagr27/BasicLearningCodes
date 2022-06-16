package recurssion;

import java.math.BigInteger;

public class Factorial {
    //time and space complexity O(n)
    public static void main(String[] args){
        for(int i=1;i<=100;i++){
            System.out.println("factorial of "+i+" "+factorial(i));
        }

    }
    public static BigInteger factorial(int n){
        if(n==1){
            return  BigInteger.ONE;
        }
        else{
            return  BigInteger.valueOf(n).multiply(factorial(n-1));
        }
    }
}
