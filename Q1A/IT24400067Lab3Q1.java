import java.util.Scanner;

public class IT24400067Lab3Q1 {
       public static void main(String[] args) {
            
              Scanner input = new Scanner (System.in);
              //input price per Kg and number of Kg
              System.out.print("Enter price per Kg of rice: ");
              double pricePerKg = input.nextDouble();
              System.out.print("Enter number of Kg you want to buy: ");
              double numberOfKg = input.nextDouble();
              double totalCost = pricePerKg * numberOfKg;
              System.out.println("The total amount to pay is: " + totalCost);
              
        }
}
