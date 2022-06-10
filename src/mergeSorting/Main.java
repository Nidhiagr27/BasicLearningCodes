package mergeSorting;

public class Main {
    public static void main(String[] args){
        int[] arr= {20,10,0,80,40,15};
        int n=arr.length;
        MergeSorting.mergeSort(arr,0,n-1);
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
