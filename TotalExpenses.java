import java.util.Scanner;

public class TotalExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the quantity purchased: ");
        int quantity = scanner.nextInt();

        System.out.print("Enter the price per item: ");
        double pricePerItem = scanner.nextDouble();

        double totalExpenses = quantity * pricePerItem;

        if (quantity > 50) {
            totalExpenses -= totalExpenses * 0.10;
        } 
        else if (quantity >= 25 && quantity <= 50) {
            totalExpenses -= totalExpenses * 0.05; 
        }
        else{
            System.out.println("No discount is offered.");
            System.out.println("Total expenses: Rs. " + totalExpenses);

            System.exit(0);
        }

        System.out.println("Total expenses: Rs. " + totalExpenses);

        scanner.close();
    }
}
