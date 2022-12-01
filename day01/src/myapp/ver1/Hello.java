package myapp.ver1;

import java.io.Console;

public class Hello {
    public static void main(String[] args) {

        // Get system console
        Console cons = System.console();

        // Read from the console, the result is assigned to a variable
        String name = cons.readLine("What is your name? ");

        while (name.trim().length() < 1) {
            name = cons.readLine("What is your name? ");
        }
        
        if (name.trim().equals("Fred")) {
            System.out.println("Yabadabadoo!");
        } else if (name.trim().equals("Barney")) {
            System.out.println("Hello, Barney.");
        } else {
            // Send a greeting to the name
            System.out.println("Hello " + name + ", nice to meet you!");
            System.out.printf("Hello %s, \n\tnice to meet you!\n", name.toUpperCase());
        }
        
    }
    
}
