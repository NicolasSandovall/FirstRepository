import java.util.Scanner;
public class FirstRepository {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);

        System.out.println("\nThis program calculate the product of two numbers: \n");

        System.out.print("Enter the first factor: ");
        int factor_1 = scanner.nextInt();

        System.out.print("Enter the second factor: ");
        int factor_2 = scanner.nextInt();

        int product = factor_1*factor_2;

        System.out.println("The product of the two numbers is: "+ product);
    }
}
