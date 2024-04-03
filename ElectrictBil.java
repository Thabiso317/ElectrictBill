import java.util.Scanner;

public class ElectrictBil{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of units consumed: ");
        int unitsConsumed = scanner.nextInt();

        double billAmount = calculateElectricityBill(unitsConsumed);
        System.out.println("Electricity bill for " + unitsConsumed + " units: R" + billAmount);

        scanner.close();
    }
        public static double calculateElectricityBill(int unitsConsumed) {
            double billAmount;
            if (unitsConsumed <= 100) {
                billAmount = unitsConsumed * 1.20;
            } else if (unitsConsumed <= 300) {
                billAmount = 100 * 1.20 + (unitsConsumed - 100) * 2.00;
            } else if (unitsConsumed <= 500) {
                billAmount = 100 * 1.20 + 200 * 2.00 + (unitsConsumed - 300) * 3.00;
            } else {
                billAmount = 100 * 1.20 + 200 * 2.00 + 200 * 3.00 + (unitsConsumed - 500) * 4.00;
            }
            return billAmount;
    }
}