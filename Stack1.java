import java.util.Scanner;
import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;

public class Stack1 {

    public static void main(String[] args) {
        Scanner teq = new Scanner(System.in);

        Stack<String> TeqStackBook = new Stack<>();
        Queue<String> TeqQueueBook = new LinkedList<>();
        
        System.out.println("Enter 4 book titles.");
        System.out.println();

        for (int i = 1; i <= 4; i++) {
            
            
            System.out.print("Title " + i + " of 4 Books: ");
            String titleBooks = teq.nextLine();
            TeqStackBook.push(titleBooks);
            
        }

        while (!TeqStackBook.isEmpty()) {
            
            String titles = TeqStackBook.pop();
            TeqQueueBook.add(titles);
        }

        System.out.println();
        System.out.println("New order list of the books: ");
        System.out.print("[");
        while (!TeqQueueBook.isEmpty()) {
            
            System.out.print(TeqQueueBook.poll());
            
            if (!TeqQueueBook.isEmpty()) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}