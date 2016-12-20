// Basic Java Program - Calculator
// Made on 16.12.01
// Creator: Trevor Svec
		
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        double curr = 0.0, res = 0.0;
        int choice = 0;
        Scanner scan = new Scanner(System.in);
		
        do {
            System.out.print("\n---------------------------------------\n");
            System.out.print("Current result = " + res);
            System.out.print("\n---------------------------------------\n");
            System.out.print("1. Addition\n");
            System.out.print("2. Subtraction\n");
            System.out.print("3. Multiplication\n");
            System.out.print("4. Division\n");
            System.out.print("5. Clear\n");
            System.out.print("6. Exit\n\n");
            System.out.print("Enter Your Choice: ");
            choice = scan.nextInt();
            
            if(choice > 6 || choice < 1) { choice = 7; res = 0;}
            else if(choice != 5 && choice != 6) {System.out.print("\nEnter number: "); curr = scan.nextDouble();
            }
            System.out.print("\n");
            
            switch(choice) {
                case 1 : res += curr; break;
                case 2 : res -= curr; break;
                case 3 : res *= curr; break;
                case 4 : res /= curr; 
                  if(curr == 0) {res = 0; System.out.print("\n---------------------------------------\nCannot divide by zero.");
                  }
                  break;
                case 5 : System.out.print("\n---------------------------------------\nCleared."); res = 0; break;
                case 6 : System.exit(0); break;
                default : System.out.print("\n---------------------------------------\nError: Please try again.");
            }
        } while(choice != 6);       
    }
}