package String;

public class CountNoOfWordsInString {
    public static void main(String[] args) {
        String str="This is my world";
        String[] arr=str.split(" ");
        System.out.println("Count = "+arr.length);
        for (String ele:arr){
            System.out.println(ele);
        }

    }
}
