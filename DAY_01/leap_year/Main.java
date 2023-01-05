package DAY_01.leap_year;

import Utils.Input;

public class Main {

    public static boolean isLeap(int year){
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    return  true;
                }
                return false;
            }
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Input input = new Input();
        int year = input.readInt("Enter a year: ");
        System.out.printf("%d is %s year", year, (isLeap(year) ? "a leap" : "not a leap" ) );
    }
}
