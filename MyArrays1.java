import java.util.Arrays;
import java.util.ArrayList;

public class MyArrays1 {
    public static void main(String[] args) {
        
        Integer arrayTeq[] = {0,1,2,3,4,5};
        int arrLen = arrayTeq.length;
              
        
        ArrayList<Integer> TEQ = new ArrayList <Integer>(Arrays.asList(arrayTeq));
        TEQ.add(6);
        
        for (int i = 0; i < TEQ.size(); i++) {
            System.out.println(TEQ.get(i));
        }
    }
}