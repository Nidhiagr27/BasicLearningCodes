package timeComplexity;

public class logNExample {
    //time complexity log2N
    public static void main(String[] args){
        int i=1;
        while(i<10000){
            System.out.println(i);  //this will run 14 times
            i=i*2;
        }
    }
}
