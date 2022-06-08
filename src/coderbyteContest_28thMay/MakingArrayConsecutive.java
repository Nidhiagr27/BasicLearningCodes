package coderbyteContest_28thMay;

import java.util.Arrays;

public class MakingArrayConsecutive {
    public static void main(String[] args){
        System.out.println(ArrayChallenge(new int[]{5,10,15}));
        System.out.println(ArrayChallenge(new int[]{-2,10,4}));
        System.out.println(ArrayChallenge(new int[]{4,8,6}));
    }
    public static int ArrayChallenge(int[] arr){
        Arrays.sort(arr);
        int count=0;
        for(int i=1;i< arr.length;i++){
            count+=arr[i]-arr[i-1]-1;
        }
        return count;
    }
}
