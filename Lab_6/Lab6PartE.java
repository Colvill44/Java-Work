/* Practicing basic algorithms.  Part of Lab 6 */
/* Accepting multiple inputs                   */
import java.util.Scanner;

public class Lab6PartE
{
  public static void main(String [] args) 
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter the price of the item: ");
    double itemCost = keyboard.nextDouble();
    System.out.println("Enter the discount percentage: ");
    double discount = keyboard.nextDouble() / 100;
    double discountTotal = itemCost - (itemCost * discount);
    double tax = discountTotal * .06;
    double finalCost = discountTotal - tax;
    System.out.format("The final cost of the item is $%.2f", finalCost);

  }
}