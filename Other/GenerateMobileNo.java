package Other;

import java.util.Random;

public class GenerateMobileNo {
    public static String generateMobileNumber() {
        Random random = new Random();
        int[] validStartDigits = {6, 7, 8, 9};
        int firstDigit = validStartDigits[random.nextInt(validStartDigits.length)];
        StringBuilder mobileNo = new StringBuilder("+91-");
        mobileNo.append(firstDigit);
        for (int i = 0; i < 9; i++) {
            mobileNo.append(random.nextInt(10));
        }
        return mobileNo.toString();
    }
    public static void main(String[] args) {
        System.out.println("Mobile number is :"+generateMobileNumber());
    }
}
