import java.util.Scanner;
public class W04_02_ifElse_compareNumber {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        int result = 0;

        if(num1>num2) {
            result = num1-num2;
            System.out.println("The number 1 is greater than the namber 2 ");
        } else {
            result = num1+num2;
            System.out.println("The number 1 is less than ro equal to the namber 2 ");
        }
        System.out.println("the result is: "+ result);
    }
}