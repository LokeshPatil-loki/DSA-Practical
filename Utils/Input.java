package Utils;

import java.util.Scanner;

// Made Input class public so it can be accessed out of this package
public class Input {
    public final Scanner scanner;

    public Input(){
        this.scanner = new Scanner(System.in);
    }

    public int readInt(String message){
        System.out.print(message);
        final int input = scanner.nextInt();
        scanner.nextLine(); // Consume remaining characters from previous input line
        return input;
    }

    public double readDouble(String message){
        System.out.print(message);
        final double input = scanner.nextDouble();
        scanner.nextLine(); // Consume remaining characters from previous input line
        return input;
    }

    public String readString(String message){
        System.out.print(message);
        return  scanner.nextLine();
    }

}
