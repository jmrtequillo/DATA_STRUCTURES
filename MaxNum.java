import java.util.Scanner;

public class MaxNum {
    
    public static void main(String[] args) {
        
        Scanner TequilloScanner = new Scanner(System.in);
        System.out.print("Enter max numbers to display: ");
        int teqmaxnum = TequilloScanner.nextInt();
        display_num(teqmaxnum);
    }
    public static void display_num(int teq) {
        
        if (teq > 0) {
            display_num(teq - 1);
            System.out.print(teq);
            if (teq >= 1) {
                System.out.print(",");
            }
        }
    }
}