package timeComplexity;

public class logExample3 {
    public static void main(String[] args){
        int[] arr=new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int start=0;
        int end=20; //(n-1)
        while(start<=end){ //this loop runs 4 times
            int mid=(start+end)/2;
            System.out.println(mid);
            end=mid-1;
        }


    }
}
