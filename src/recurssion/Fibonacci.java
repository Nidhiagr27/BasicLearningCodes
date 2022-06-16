package recurssion;

public class Fibonacci {
    public static void main(String[] args){
        for(int i =1;i<=100;i++){
            System.out.println("fibonacci of "+i+" "+fibonacci(i));
        }
    }

    //function to calculate nth fibonacci number
    //time complexity is O(2^n) space complexity O(n)
    public static int fibonacci(int n){
        if(n==1 || n==2){
            return 1;
        }
        else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
}
