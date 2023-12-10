import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class MovieTime {
    public static void main(String[] args) {
        
        Scanner TeqSC = new Scanner(System.in);
        
        Queue<String> teqmovies = new LinkedList<>();
        Queue<String> teqsnacks = new LinkedList<>();

        for (int i = 1; i <= 3; i++) {
            
            System.out.print("Enter Movie " + i + " of 3: ");
            String movie = TeqSC.nextLine();
            teqmovies.offer(movie);
            
        }
        
        System.out.println();

        for (int i = 1; i <= 3; i++) {
            
            System.out.print("Enter Snack " + i + " of 3: ");
            String snack = TeqSC.nextLine();
            teqsnacks.offer(snack);
            
        }

        System.out.println();
        System.out.println("Movies to watch are: " + teqmovies);
        
        System.out.println("Snacks available are: " + teqsnacks);
        System.out.println();
        
        System.out.println("Press 'F' each time you finish a snack");

        while (!teqsnacks.isEmpty()) {
            
            String key = TeqSC.nextLine();
                        
            if (key.equalsIgnoreCase("F")) {
                
                teqsnacks.remove();
                System.out.println(teqsnacks);
                
            }
            
            else {
            
            System.out.println("Invalid Input. Try again: ");
            }
        }

        if (teqsnacks.isEmpty()) {
            
            System.out.println("There are no more snacks left");
        }
    }
}