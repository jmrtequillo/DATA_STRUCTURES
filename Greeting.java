import java.util.Scanner;
import java.util.PriorityQueue;

public class Greeting {

    public static void main(String[] args) {
        
        
        PriorityQueue<String> queue  = new PriorityQueue<>();
        Scanner teqsc = new Scanner(System.in);
        
        System.out.println("Enter the nicknames of 4 of your classmates: ");
        
        for(int i = 1; i <= 4; i++){
        String myfnicknames = teqsc.nextLine();       
        queue.offer(myfnicknames);
        
        }
              
        System.out.println("Press H to say Hi to each of them.");
        while(!queue.isEmpty()){ 
            
            String greeThing = teqsc.next().toUpperCase();
            
            if (greeThing.equals("H")){
             
                System.out.println("Hi " + queue.poll());                          
            }                                                   
        }
                System.out.println();
                System.out.println("Done Saying Hi");
    }
}