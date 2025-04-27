package String;

public class ReverseString {
    public static void reverse1(String str){
        //Using toCharArray() method
        char[] chArr=str.toCharArray();
        for (int i=chArr.length-1;i>=0;i--){
            System.out.print(chArr[i]);
        }
        System.out.println();

    }

    public static void reverse2(String str){
        //Using charAt(int index) method
        for (int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
        System.out.println();

    }
    public static void reverse3(String str){
        //Using StringBuffer method
        StringBuffer sb=new StringBuffer(str);
        System.out.println(sb.reverse());
      
    }
    public static void reverse4(String str){
        //Using StringBuffer method
        StringBuffer sb=new StringBuffer();
        for (int i=str.length()-1;i>=0;i--){
            sb.append(str.charAt(i));
        }
        System.out.println(sb);
    }
    public static void main(String[] args) {
        String str="Hello";
        reverse1(str);
        reverse2(str);
        reverse3(str);
        reverse4(str);
    }
}
