package generalQuestions;

import java.util.HashMap;
import java.util.Map;

public class HashMapMethods {
    public static void main(String[] args) {
        HashMap map1=new HashMap(); //initial capacity 16
        map1.put("1","ab");
        map1.put("2","bc");
        map1.put("3","de");
        map1.put("4",null);
        map1.put(null,"abc");
        map1.put(null,null);
        HashMap copyMap1=new HashMap();

        System.out.println(map1.size()); //returns 5

        System.out.println(map1);//outputs {null=null, 1=ab, 2=bc, 3=de, 4=null}
        System.out.println(map1.entrySet()); //outputs [null=null, 1=ab, 2=bc, 3=de, 4=null]
        System.out.println(map1.get(null));
        copyMap1.putAll(map1);
        copyMap1.putIfAbsent("5","qwerty");
        System.out.println(copyMap1); //{null=null, 1=ab, 2=bc, 3=de, 4=null, 5=qwerty}

        for(Object s:copyMap1.values()){
            System.out.println(s);
        }

        System.out.println(copyMap1.remove(null));
        System.out.println(copyMap1);//{1=ab, 2=bc, 3=de, 4=null, 5=qwerty}
        copyMap1.remove("2","key"); //won't remove anything becoz specified key doesn't contains this value.
        copyMap1.replace("2","bc","java");
        System.out.println(copyMap1.values());// [ab, java, de, null, qwerty]
        System.out.println(copyMap1.keySet()); //[1, 2, 3, 4, 5]


        map1.clear();
        System.out.println(map1); //outputs {}
        System.out.println(map1.isEmpty()); //true





    }
}
