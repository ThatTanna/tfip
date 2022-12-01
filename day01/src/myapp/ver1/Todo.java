package myapp.ver1;

public class Todo {

    public static void main(String[] args) {

        String[] tasks = new String[3];

        tasks[0] = "running";
        tasks[1] = "eating";
        tasks[2] = "sleeping";

        System.out.println(tasks);
        System.out.println(tasks[0]);
        System.out.println(tasks[1]);
        System.out.println(tasks[2]);
        System.out.println(tasks.length);

        // Use a while loop to print all the elements in the array

        int i = 0;

        while (i < tasks.length) {
            System.out.println(i + 1 + ": " + tasks[i]);
            i++;
        }
    }
    
}
