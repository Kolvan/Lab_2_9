package TestStrings2;

/**
 * Created by Lena on 02.12.2016.
 */
public class Main {
    public static void main(String[] args){
        String myStr1 = "Cartoon";
        String myStr2 = "Tomcat";
        char[] array2 = myStr2.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(myStr1);
        for(char element2: array2){
            for(int i = 0; i < stringBuilder.length(); i++){
                if(element2 == stringBuilder.charAt(i)){
                    stringBuilder.deleteCharAt(i);
                }
            }
        }
        System.out.println(stringBuilder);
    }
}