package twoWayPartioningImplementation;

public class TwoWayPartitioning {
    public static  void main(String[] args){
        Integer[] arr=new Integer[]{2,5,1,6,7,8,4};
        int pivot=arr[arr.length-1];
        int f=0;
        for(int c=0;c< arr.length;c++){
            if(arr[c]<=pivot){
                int temp=arr[c];
                arr[c]=arr[f];
                arr[f]=temp;
                f++;
            }
        }
        for(f=0;f< arr.length;f++){
            System.out.print(arr[f]+" ");
        }
    }

}
