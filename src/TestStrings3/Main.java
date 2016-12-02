package TestStrings3;

/**
 * Created by Lena on 02.12.2016.
 */
public class Main {
    public static void main(String[] args){
        System.out.println(uniqueChars("dasdasdasdasd2312dg"));
    }
    public static char[] uniqueChars(String str){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        StringBuilder replays = new StringBuilder();
        for(int i = 0; i < stringBuilder.length(); i++){
            for(int j = 0; j < stringBuilder.length(); j++){
                if(stringBuilder.charAt(i) == stringBuilder.charAt(j) && j != i){
                    stringBuilder.deleteCharAt(j);
                    j--;
                }
            }
        }
        char[] result = new char[stringBuilder.length()];
        for (int i = 0; i < result.length; i++){
            result[i] = stringBuilder.charAt(i);
        }
        return result;
    }
}