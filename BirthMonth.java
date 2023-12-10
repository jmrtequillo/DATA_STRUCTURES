import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;

public class BirthMonth {
    public static void main(String[] args) {
        
        Set<String> group1 = new HashSet<>();
        Set<String> group2 = new HashSet<>();
        Set<String> self = new HashSet<>();
        
        Scanner scanner = new Scanner(System.in);
        
        
        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter birth month " + i + ": ");
            String month = scanner.nextLine();
            group1.add(month);
        }
        
        System.out.println();
       
        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter birth month " + i + ": ");
            String month = scanner.nextLine();
            group2.add(month);
        }
        
        System.out.println();
        
        System.out.println("Group 1: " + group1);
        System.out.println("Group 2: " + group2);  
        
        System.out.println();
        
        System.out.print("Enter your birth month: ");
        String myBirthMonth = scanner.nextLine();
        self.add(myBirthMonth);   
        
        Set<String> union = new HashSet<>(group1);
        union.addAll(group2);
        
        Set<String> intersection = new HashSet<>(group1);
        intersection.retainAll(group2);
        
        Set<String> difference = new HashSet<>(group1);
        difference.removeAll(group2);
        
        System.out.println("Union: " + union);
        System.out.println("Intersection: " + intersection);
        System.out.println("Difference: " + difference);
        
        System.out.println();
        
         if (Collections.disjoint(self, group1) && Collections.disjoint(self, group2)) {
            System.out.println("You don't have the same birth month with any of your classmates.");
        } else {
            System.out.println("You have the same birth month with one of your classmates.");
        }
        
        scanner.close();
    }
}