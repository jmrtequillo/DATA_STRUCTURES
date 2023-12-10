import java.util.Arrays;

public class MyArrays {
    public static void main(String[] args) {
       
        int arrayko[] = {1, 2, 3, 4, 5};
        int MyarrLen = arrayko.length;
        int MNArrLen = MyarrLen + 1;
        int nae = 1;
        int newArr[] = new int[MNArrLen];
        
        System.out.println("Original Length: " + MyarrLen);
        System.out.print("Added Elemet: " + nae);
        System.out.println("");
        
        System.out.println("New Length: " + MNArrLen);
        System.out.println("");
        
        for (int jem = 0; jem < MyarrLen; jem++) {
            newArr[jem] = arrayko[jem];
        }
        
        newArr[MNArrLen - 1] = 6;
        
        for (int jem = 0; jem < MNArrLen; jem++) {
            System.out.println(newArr[jem]);
        }
    }
}