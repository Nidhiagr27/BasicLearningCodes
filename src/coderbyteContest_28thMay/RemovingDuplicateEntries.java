package coderbyteContest_28thMay;

import java.util.HashSet;
import java.util.Set;

public class RemovingDuplicateEntries {
    public static void main(String[] args){
        System.out.println(ArrayChallenge(new int[]{1,2,2,2,3}));
        System.out.println(ArrayChallenge(new int[]{0,-2,-2,5,5,5}));
        System.out.println(ArrayChallenge(new int[]{100,2,101,4}));
    }
    public static int ArrayChallenge(int[] arr){
        Set<Integer> set=new HashSet<>();
        for(Integer i:arr){
            set.add(i);
        }
        return arr.length- set.size();
    }
}
