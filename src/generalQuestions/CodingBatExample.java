package generalQuestions;// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class CodingBatExample {
    public static void main(String[] args) {
        System.out.println("Hello, World!"); 
        String[] op = abc(new String[]{"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"});
        for(int i=0; i<op.length; i++) {
            System.out.print(", ");
            System.out.print(op[i]);
        }
        System.out.println();
    }
    public static String[] abc(String[] strings) {
        Map<Character, Integer> lu = new HashMap<>();
        
        for(int i=0; i<strings.length; i++) {

            Character currentChar = strings[i].charAt(0);
            if(lu.containsKey(currentChar)) {
                String temp = strings[i];
                strings[i] = strings[lu.get(currentChar)];
                strings[lu.get(currentChar)] =  temp;
                lu.remove(currentChar);
            } else {
                lu.put(currentChar, i);
            }
        }
        
        return strings;
    }
}
