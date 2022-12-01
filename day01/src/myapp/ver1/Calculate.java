package myapp.ver1;

import java.io.Console;

public class Calculate {
    public static void main(String[] args) {

        Console cons = System.console();

        int sum = 0;
        int count = 0;

        while (true) {
            String input = cons.readLine("Enter a number: ").trim();

            if (input.equals("stop")) {
                break;
            } else {
                int num = Integer.parseInt(input);
                sum += num;
            }

            count++;

        }

        System.out.printf("The total of adding %d numbers is %d\n", count, sum);
    }
    
}
