package mergeSorting;

public class MergeSorting {
    public static void mergeSort(int[] arr,int start,int end){
        if(start<end){
            int mid=(start+end)/2;
            mergeSort(arr,start,mid);
            mergeSort(arr,mid+1,end);
            combine(arr,start,mid,end);
        }
    }


    /*here we are implementing merge two sort arrays*/
    public static void combine(int[] arr,int start,int mid,int end){
        int totalLength=end-start+1;
        int[] c=new int[totalLength];

        int i=start,j=mid+1,k=0;
        while(i<=mid && j<=end){
            if(arr[i]<arr[j]){
                c[k]=arr[i];
                i++;
                k++;
            }
            else{
                c[k]=arr[j];
                j++;
                k++;
            }
        }
        while(i<=mid){
            c[k]=arr[i];
            k++;
            i++;
        }
        while(j<=end){
            c[k]=arr[j];
            k++;
            j++;
        }

        for(i=0;i<totalLength;i++){
            arr[start+i]=c[i];
        }
    }
}
