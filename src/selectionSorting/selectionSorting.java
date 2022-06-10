package selectionSorting;

public class selectionSorting {
    public static void main(String[] args){
        Integer[] arr=new Integer[]{67,89,43,92,103,959};
        selectionSort(arr);
        for(Integer num:arr){
            System.out.println(num+" ");
        }

    }

    public static void selectionSort(Integer[] arr){
       for(int i=0;i< arr.length;i++){
           int smallestElementIndex=i;
           for(int j=i;j< arr.length-1;j++){
               if(arr[j+1]<arr[j]){
                   smallestElementIndex=j+1;
               }
           }
           int temp=arr[i];
           arr[i]=arr[smallestElementIndex];
           arr[smallestElementIndex]=temp;

       }

    }
}
