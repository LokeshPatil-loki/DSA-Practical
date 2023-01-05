package Utils;

public class Helper {
    public static String multiplyString(String string, int count){
        String temp = "";
        for(int i = 0; i < count; i++){
            temp += string;
        }
        return temp;
    }
}
