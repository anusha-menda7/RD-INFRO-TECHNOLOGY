import java.util.*;
public class Calci{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Simple Calculator");
        System.out.print("Enter 1st number : ");
        double x=sc.nextDouble();
        System.out.print("Enter 2nd number : ");
        double y=sc.nextDouble();
        System.out.println("Select your choice :");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.print("Enter your choice (1-4): ");
        int ch=sc.nextInt();
        double r=0.0;
        boolean valid=true;
        switch(ch) {
            case 1:
                r=x+y;
                System.out.println("Operation: Addition");
                break;
            case 2:
                r=x-y;
                System.out.println("Operation: Subtraction");
                break;
            case 3:
                r=x*y;
                System.out.println("Operation: Multiplication");
                break;
            case 4:
                if(y!=0) {
                    r=x/y;
                    System.out.println("Operation: Division");
                }
                else {
                    System.out.println("Error: Division by zero is not allowed.");
                    valid=false;
                }
                break;
            default:
                System.out.println("Invalid choice. Please select a valid operation.");
                valid=false;
        }
        if (valid) 
            System.out.println("Result: "+r);
    }
}
