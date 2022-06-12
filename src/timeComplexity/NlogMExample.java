package timeComplexity;

public class NlogMExample {
    public static void main(String[] args){
        //time complexity NlogM
        int N=1000;
        int M=1000;
        for(int i=0;i<N;i++){ //for outer loop N.
            int j=1;
            while(j<M){
                System.out.print(i+j+" "); // for inner loop log M
                j=j*2;
            }
        }
    }


}
