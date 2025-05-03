package Basics;

public class PrintAlphabetsAndDigits {
    public static void main(String[] args) {
        uppercase();
        lowercase();
        digits();

    }

    public static void uppercase(){
        char ch;
        int i;
        System.out.println("Uppercase A to Z:");
        for(ch='A';ch<='Z';ch++){
            i=ch;
            System.out.println(ch+"="+i);
        }
    }

    public static void lowercase(){
        char ch;
        int i;
        System.out.println("Lowercase a to z:");
        for(ch='a';ch<='z';ch++){
            i=ch;
            System.out.println(ch+"="+i);
        }
    }
    public static void digits(){
        char ch;
        int i;
        System.out.println("Digits from 0 to 9:");
        for (ch='0';ch<='9';ch++){
            i=ch;
            System.out.println(ch+"="+i);
        }
    }


}
