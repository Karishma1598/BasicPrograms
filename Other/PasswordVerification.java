package Other;

import java.util.Scanner;

public class PasswordVerification {

    public static boolean isPasswordValid(String password){
        if(password.length()<8){
            return false;
        }
        boolean hasUpperCase=false;
        boolean hasDigit=false;
        for(int i=0;i<password.length();i++){
            char ch=password.charAt(i);
            if(Character.isUpperCase(ch)){
                hasUpperCase=true;
            }
            if(Character.isDigit(ch)){
                hasDigit=true;
            }
        }

        return hasUpperCase && hasDigit;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the password");
        String str=sc.next();

        if(isPasswordValid(str)){
            System.out.println("Valid Password");
        }else {
            System.out.println("Invalid Password");
        }
    }
}
