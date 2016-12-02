package TestStrings1;

/**
 * Created by Lena on 02.12.2016.
 */
public class Main {
    public static void main(String[] args){
        String myStr = "balabao";
        System.out.println(myStr.indexOf("ao"));
        System.out.println(myStr.lastIndexOf("ao"));
        System.out.println(myStr.substring(3,4));
        System.out.println(reverseString("bala"));
    }
    public static String reverseString(String str){
        char[] array = str.toCharArray();
        char[] array2 = new char[array.length];
        for (int i = 0; i < array.length; i++){
            array2[array2.length - 1 - i] = array[i];
        }
        return new String(array2);
    }
}