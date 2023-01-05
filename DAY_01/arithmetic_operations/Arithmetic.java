package DAY_01.arithmetic_operations;

public class Arithmetic {
    // Add two integers
    public static int add(int a, int b){
        return a+b;
    }

    // Method Overload of add for adding two doubles
    public static double add(double a, double b){
        return a+b;
    }

    // Subtract two integers
    public static int subtract(int a, int b){
        return a-b;
    }

    // Method Overload of subtract for subtracting two doubles
    public static double subtract(double a, double b){
        return a-b;
    }

    // Multiply two integers
    public static int multiply(int a, int b){
        return a*b;
    }

    // Method Overload multiply to Multiply two integers
    public static double multiply(double a, double b){
        return a*b;
    }


    // Divide two integers
    public static double divide(int a, int b){
        return (double) a/b;
    }

    public static double divide(double a, int b){
        return a/b;
    }

    public static double divide(int a, double b){
        return a/b;
    }

    public static double divide(double a, double b){
        return a/b;
    }

}
