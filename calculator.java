import java.util.Scanner;

public class calculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  numbers 1  : ");
        int num1 = sc.nextInt();
        System.err.print("Enter  numbers 2  : ");
        int num2 = sc.nextInt();
        System.err.print("Enter an operator (+, -, *, /): ");
        char op = sc.next().charAt(0);
        int result=0;
        switch(op){
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if(num2 != 0){
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero");
                    return;
                }
                break;
            default:
                System.out.println("Error: Invalid operator");
                return;
        }
        System.out.println("Result: " + result);
    }

}