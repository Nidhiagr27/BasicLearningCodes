package timeComplexity;

public class logNExample2 {
    //time complexity log2N
    public static void main(String[] args){
        int i=10000;
        while(i>0){
            System.out.println(i); //this will run 14 times
            i=i/2;
        }
    }
}
