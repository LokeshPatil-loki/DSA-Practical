package DAY_01.arithmetic_operations;

import Utils.Input;

public class Main {
    public static void main(String[] args) {
        Input input = new Input();
        int choice = 0;
        do{
            showMenu();
            choice = input.readInt("Select: ");
            switch (choice){
                case 1:{
                    int a = input.readInt("A: ");
                    int b = input.readInt("B: ");
                    System.out.printf("%d + %d = %d", a, b, Arithmetic.add(a, b));
                    break;
                }
                case 2:{
                    double a = input.readDouble("A: ");
                    double b = input.readDouble("B: ");
                    System.out.printf("%.2f / %.2f = %.2f", a, b, Arithmetic.add(a, b));
                    break;
                }
                case 3:{
                    int a = input.readInt("A: ");
                    int b = input.readInt("B: ");
                    System.out.printf("%d - %d = %d", a, b, Arithmetic.subtract(a, b));
                    break;
                }
                case 4:{
                    double a = input.readDouble("A: ");
                    double b = input.readDouble("B: ");
                    System.out.printf("%.2f / %.2f = %.2f", a, b, Arithmetic.subtract(a, b));
                    break;
                }
                case 5:{
                    int a = input.readInt("A: ");
                    int b = input.readInt("B: ");
                    System.out.printf("%d * %d = %d", a, b, Arithmetic.multiply(a, b));
                    break;
                }
                case 6:{
                    double a = input.readDouble("A: ");
                    double b = input.readDouble("B: ");
                    System.out.printf("%.2f / %.2f = %.2f", a, b, Arithmetic.multiply(a, b));
                    break;
                }
                case 7:{
                    double a = input.readDouble("A: ");
                    double b = input.readDouble("B: ");
                    System.out.printf("%.2f / %.2f = %.2f", a, b, Arithmetic.divide(a, b));
                    break;
                }
                default:{
                    System.out.println("Exiting..........");
                }
            }
        }while (choice != 0);
    }

    public static void showMenu(){
        System.out.println("");
        System.out.println("-----------------------------------------------------------");
        System.out.println("1. Integer Addition");
        System.out.println("2. Double Addition");
        System.out.println("3. Integer Subtraction");
        System.out.println("4. Double Subtraction");
        System.out.println("5. Integer Multiplication");
        System.out.println("6. Double Multiplication");
        System.out.println("7. Division");
        System.out.println("0. Exit");
    }


}
