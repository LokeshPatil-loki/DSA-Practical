package DAY_01.factorial;

import Utils.Input;

public class Main {

    public static int factorial(int num){
        if(num < 0){
            throw new RuntimeException("Cannot find factorial of negative number");
        }
        if(num == 0){
            return 1;
        }
        int fact = 1;
        for(int i=2;i<=num;i++){
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Input input = new Input();
        int num = input.readInt("Enter a number: ");
        try {
            System.out.printf("Factorial of %d is %d", num, factorial(num));
        }catch (Exception exception){
            System.err.println(exception.getMessage());
        }
    }
}
