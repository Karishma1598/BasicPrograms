package Basics;

public class SwapThreeNumbers {
    public static void swapThreeNumbers(int a,int b,int c){
        a=a+b+c;
        b=a-(b+c);
        c=a-(b+c);
        a=a-(b+c);
        System.out.println("After swapping ");
        System.out.println("a= "+a+" b= "+b+" c="+c);

    }
    public static void swapUsingThirdVar(int a,int b,int c){
        int temp1,temp2;
        temp1=a;
        temp2=b;
        a=c;
        b=temp1;
        c=temp2;
        System.out.println("After swapping ");
        System.out.println("a= "+a+" b= "+b+" c="+c);


    }
    public static void main(String[] args) {
        System.out.println("Before Swapping");
        int a=10,b=20,c=30;
        System.out.println("a= "+a+" b= "+b+" c="+c);
        swapThreeNumbers(a,b,c);
        swapUsingThirdVar(a,b,c);

    }
}
