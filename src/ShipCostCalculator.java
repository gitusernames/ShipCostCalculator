import java.util.Scanner;

public class ShipCostCalculator {
    static void main() {
        double itemPrice;
        double shippingCost;
        double totalCost;
        String trash;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the price of the item: $");
        if(in.hasNextDouble()) {
            itemPrice = in.nextDouble();
            in.nextLine();
            if (itemPrice >= 100) {
                shippingCost = 0;
            } else {
                shippingCost = 0.02 * itemPrice;
            }
            totalCost = shippingCost + itemPrice;
            System.out.println("The shipping cost is $" + shippingCost + " and the total price is $" + totalCost);
        } else {
            trash = in.nextLine();
            System.out.println(trash + " is not a valid price. Run the program again and enter a valid value!");
        }
    }
}
