import java.util.Scanner;
import java.util.Stack;

public class FruitBasket { 
    public static void main(String[] args) {
        Stack<String> basket = new Stack<>();
        
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Enter number of Fruits to eat: ");
        
        int num_fruits = sc.nextInt();
        
        for (int i = 1; i <= num_fruits; i++) {
            
            System.out.println("Please select a fruit to eat: ");
            System.out.println("Enter A for Apple, O for Orange, M for Mango, G for Guava ");
            
        String fruit = sc.next().toUpperCase();
        
        if (fruit.equals("A")) {

            basket.push("Apple");

        } else if (fruit.equals("O")) {

            basket.push("Orange");

        } else if (fruit.equals("M")) {

            basket.push("Mango");

        } else if (fruit.equals("G")) {

            basket.push("Guava");

        } else {

            System.out.println("Invalid input. Please try again. ");

            i--;

        }

        }

        System.out.println("Your basket now has: " + basket);

        while (!basket.isEmpty()) {

            System.out.print("Press E to eat a fruit. ");

            String eat_fruit = sc.next().toUpperCase();

            if (eat_fruit.equals("E")) {

                basket.pop();

                System.out.println("Fruit(s) in the basket: " + basket);

            } else {

                System.out.println("Invalid input. Please try again. ");

            }

        }

        System.out.println("No more fruits");

    }

}