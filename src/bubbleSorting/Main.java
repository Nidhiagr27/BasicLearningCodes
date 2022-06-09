package bubbleSorting;

public class Main {
    public static void main(String[] args){
        Integer[] arr=new Integer[]{2,5,1,0,4};
        bubbleSort(arr);
        for(Integer num:arr){
            System.out.println(num+" ");
        }
        System.out.println();
    }
    public static void bubbleSort(Integer[] arr){
        int n= arr.length;
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }
    }
}
