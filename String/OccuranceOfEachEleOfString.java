package String;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfEachEleOfString {
    public static void getOccurance(String str){
        Map<Character,Integer> mp=new HashMap<>();
        char[] chArr=str.toCharArray();
        for(char ch:chArr){
            if(!mp.containsKey(ch)){
                mp.put(ch,1);
            }else {
                int cnt=mp.get(ch);
                mp.put(ch,cnt+1);
            }
        }
        System.out.println(mp);
    }
    public static void main(String[] args) {
        String str="Hello";
        getOccurance(str);

    }
}
