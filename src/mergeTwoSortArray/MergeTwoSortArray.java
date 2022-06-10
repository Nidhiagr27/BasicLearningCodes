package mergeTwoSortArray;

public class MergeTwoSortArray {
    public static void main(String[] args){
        Integer[] a=new Integer[]{2,5,8,9,10};
        Integer[] b=new Integer[]{2,4,7,18};
        Integer[] c=new Integer[a.length+b.length];
        mergeTwoArrays(a,b,c);
        for(Integer num:c){
            System.out.println(num);
        }
    }
    public static void mergeTwoArrays(Integer[] a,Integer[] b,Integer[] c){
        int i=0,j=0,k=0;
        while(i<a.length || j<b.length){
            if(i<a.length && j<b.length) {
                if (a[i] < b[j]) {
                    c[k] = a[i];
                    i++;
                } else {
                    c[k] = b[j];
                    j++;
                }
            }
            else if(i<a.length){
                c[k]=a[i];
                i++;
            }
            else{
                c[k]=b[j];
                j++;
            }
            k++;
        }
        }
    }

