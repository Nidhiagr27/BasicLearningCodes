package resizableArrayImplementation;

import java.lang.reflect.GenericArrayType;

public class ResizableArray {
    private Integer[] arr;
    private  int capacity;
    private int size;

    public ResizableArray(){
        this.arr=new Integer[2];
        this.capacity=2;
        this.size=0;
    }

    public void push(int elementToPush){
        if(size<capacity) {
            arr[size] = elementToPush;
            size++;
        }
        else{
            Integer[] newArr=new Integer[2*capacity];
            for(int i=0;i<size;i++){
                newArr[i]=arr[i];
            }
            capacity=capacity*2;
            newArr[size] =elementToPush;
            size++;
            this.arr=newArr;
        }
    }

    public void printArray(){
      for(int i=0;i<size;i++){
          System.out.println(arr[i]+" ");
      }
        System.out.println();
    }
}
