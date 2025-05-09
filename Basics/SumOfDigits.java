package Basics;

public class SumOfDigits {
    public static void sum(){
        int num=1221;
        int sum=0;
        while (num>0){
            int rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
        System.out.println("sum="+sum);
    }
    public static void main(String[] args) {
        sum();
    }
}
