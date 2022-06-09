package generalQuestions;

public class StringMethods {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String s="NidhiAgrawalPreparingJava";
        System.out.println(s.hashCode());
        System.out.println(s.indexOf("a",9));
        System.out.println(s.codePointAt(4));
        System.out.println(s.codePointCount(0,s.length()));

       ///////////////////////////////////////////////////////////////////////////
        //contains method and replace
        String newStr=null;
        if(s.contains("Ag")){
            System.out.println("Yes it contains given string");
             newStr=s.replace("Nidhi","Nid");
        }
        else{
            System.out.println("It do not contains");

        }
        System.out.println(newStr);
      ///////////////////////////////////////////////////////////////////////////

        System.out.println(s.length());
        System.out.println(s.lastIndexOf("a"));

       //split method
        String str="I am learning java";
        String[] strArray=str.split(" ");
        for(String st:strArray){
            System.out.println(st);
        }
    //////////////////////////////////////////////////////////////////////////////////

        char[] charArray= str.toCharArray();
        for(char c:charArray){
            System.out.println(c);
        }
        System.out.println(str.trim());
    /////////////////////////////////////////////////////////////////////////////////
        System.out.println(str.repeat(5));
        System.out.println(str.valueOf(charArray,1,2));//returns a string value of object //outputs space a
        System.out.println(str.valueOf(charArray,1,4));//outputs space am
        
    }
}