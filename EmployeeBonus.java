import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter current year: ");
        int currentYear = scanner.nextInt();

        System.out.print("Enter year of joind: ");
        int joindYear = scanner.nextInt();

        int yearsOfService = currentYear - joindYear;

        int bonusAmount = 0;
        if (yearsOfService > 5) {
            System.out.println("Bonus awarded: Rs. 5000/-");
        } else if (yearsOfService >= 3 && yearsOfService <= 5) {
            System.out.println("Bonus awarded: Rs. 3000/-");
        }
        else {
            System.out.println("No bonus awarded.");
        }

        scanner.close();
    }
}
