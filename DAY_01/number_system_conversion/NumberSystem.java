package DAY_01.number_system_conversion;

import Utils.Input;

public class NumberSystem {
    private static Input input = new Input();

    private static String decToBinOctHex(int num, int base){
        int quotient = 1;
        String bits = "";
        while (quotient > 0){
            quotient = num / base;
            int remainder = num % base;
            bits = (base == 16 ? mapToHex(remainder) : remainder) + bits;
            num = quotient;
        }
        return bits;
    }

    private static String mapToHex(int digit){
        String hexCodes = "0123456789ABCDEF";
        return hexCodes.charAt(digit) + "";
    }

    public static String decToBin(int num){
        return  decToBinOctHex(num, 2);
    }

    public static String decToHex(int num){
        return  decToBinOctHex(num, 16);
    }

    public static String decToOct(int num){
        return  decToBinOctHex(num, 8);
    }

    public static void main(String[] args) {
        int num = input.readInt("Enter a decimal number: ");
        System.out.println("To binary: " + decToBin(num));
        System.out.println("To Octal: " + decToOct(num));
        System.out.println("To Hexadecimal: " + decToHex(num));
    }
}
