package DAY_01.multiplication_table;

import Utils.Helper;
import Utils.Input;

public class Main {

    public static void multiplicationTable(int num){
        for(int i = 1; i <= 10; i++ ){
            System.out.printf("%d * %d = %d\n", num , i, (num * i));
        }
        System.out.println(Helper.multiplyString("*",50));;
    }

    public static void main(String[] args) {
        Input input = new Input();
        int num = input.readInt("Which numbers multiplication Table you want?: ");
        multiplicationTable(num);
    }
}
