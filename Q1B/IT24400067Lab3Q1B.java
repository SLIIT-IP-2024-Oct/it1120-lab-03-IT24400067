import java.util.Scanner;

public class IT24400067Lab3Q1B {
       public static void main(String[] args) {
            
              Scanner input = new Scanner (System.in);
              //input price per Kg and number of Kg
              System.out.print("Enter price per Kg of rice: ");
              double pricePerKg = input.nextDouble();
              System.out.print("Enter number of Kg you want to buy: ");
              double numberOfKg = input.nextDouble();
              double totalCost = pricePerKg * numberOfKg;
                      
                      //Declare and Initialize variables 
                      double discount = 0.10;        // discount is 10%
              
                     //Calculate the discount (10% of the total amount)
                     double discountTotal = totalCost * discount;

                     //Calculate the amount to pay after discount
                     double finalCost = totalCost - discountTotal;

               // Display the total cost
               System.out.println();
               System.out.println("The final cost with the discount is: " + finalCost);
        }
} 
                     
              
        

