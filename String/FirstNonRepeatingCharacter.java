package String;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public static void nonRepeatingCharacter(String str){
        Map<Character,Integer> map=new HashMap<>();
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else {
                map.put(ch,1);
            }
        }
        System.out.println(map);
        for(Map.Entry<Character,Integer> entrySet:map.entrySet()){
            if(entrySet.getValue()==1){
                System.out.println(entrySet.getKey());
                break;
            }
        }
    }
    public static void main(String[] args) {
        String str="AABBCCDEEF";
        nonRepeatingCharacter(str);

    }
}
