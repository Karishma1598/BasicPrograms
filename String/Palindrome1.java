package String;

public class Palindrome1 {
    public static void main(String[] args) {
        String str="Ngaman";
        String rstr="";
        char ch;
        for (int i=0;i<str.length();i++){
            ch=str.charAt(i);
            rstr=ch+rstr;
        }
        if(str.toLowerCase().equals(rstr.toLowerCase())){
            System.out.println("String is Palindrome");
        }else {
            System.out.println("String is not palindrome");
        }
    }

}
