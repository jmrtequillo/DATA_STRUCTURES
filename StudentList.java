import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class StudentList{
    
    public static void main(String[] args){
        
        HashMap<String, String> students = new HashMap<>();
        Scanner redsc = new Scanner(System.in);
        
        for (int i = 1; i <=3; i++){
            
            System.out.print("Enter student number " + i +": ");
            
            String snumber = redsc.nextLine();           
                      
            System.out.print("Enter first name " + i + ": ");
            
            String fname = redsc.nextLine();
            
            System.out.println();
            
            students.put(snumber, fname);     
             
        }
        
        System.out.println("Student List: ");
        
        for (Map.Entry<String, String> entry : students.entrySet()){
            
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        
        students.remove (students.keySet().toArray());
        
        System.out.println();
        
        System.out.print("Enter your student number: ");
        
        String snumber = redsc.nextLine();
        
        System.out.print("Enter your first name: ");
        
        String fname = redsc.nextLine();
        
        students.put(snumber, fname);
        
        System.out.println();
        
        System.out.println("Student List: ");
        
        for (String key : students.keySet()){
            
        System.out.println(key + " " + students.get(key));   
        }
    }
}
