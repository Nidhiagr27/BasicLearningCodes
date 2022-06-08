package coderbyteContest_28thMay;

import java.util.*;

public class LongestConsecutive {
    public static int ArrayChallenge(int[] arr){
        Set<Integer> set=new HashSet<>();
        for(Integer a:arr){
            set.add(a);
        }
        List<Integer> list=new ArrayList<>(set);
        Collections.sort(list);
        Set<Integer> set1=new HashSet<>();
        int count=1;
        for(int i=0;i< list.size()-1;i++){
            if(list.get(i+1)== list.get(i)+1){
                count+=1;
            }
            else{
                set1.add(count);
                count=1;
            }
        }
        set1.add(count);

        return Collections.max(set1);


    }
    public static void main(String[] args){
        System.out.println(ArrayChallenge(new int[]{2,1,5,4,3,8,9,6,12,15,26,16}));
        System.out.println(ArrayChallenge(new int[]{6,7,3,1,100,102,6,12}));
        System.out.println(ArrayChallenge(new int[]{5,6,1,2,8,9,7}));
        System.out.println(ArrayChallenge(new int[]{1,2,3,2,5,5,7,7}));

    }
}
