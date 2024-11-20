import java.util.Scanner;

public class IT24400067Lab3Q4 {

         public static void main(String[] args) {

              // Declare variables
              int number , digit1 , digit2 , digit3 , digit4 , digit5;
 
              // Create a Scanner object to read input
              Scanner input = new Scanner(System.in);

              // Prompt the user to enter a five-digit number
              System.out.print("Enter a five-digit number: ");
              number = input.nextInt();    //if amount entered is 52348

              // Extract the highest place value digit (ten thousand)
              digit1 = number / 10000;     // digit1 = 5 (52348 / 10000 = 5.2348 =>5)
              number = number % 10000;     // number = 2348 (52348 % 10000 remainder => 2348)
                                           // Now the number variable is updated to 2348 no longer 52348

              // Extract the next place value digit (thousand)
              digit2 = number / 1000;      // digit2 = 2 (2348 / 1000 = 2.348 => 2)
              number = number % 1000;      // number = 348 (2348 % 1000 remainder => 348)
                                           // Now the number variable is updated to 348 no longer 2348

             // Extract the next place value digit (hundred)
              digit3 = number / 100;       // digit3 = 3 (348 / 100 = 3.48 => 3)
              number = number % 100;       // number = 48 (348 % 100 remainder => 48)
                                           // Now the number variable is updated to 48 no longer 348


             // Extract the next place value digit (ten)
              digit4 = number / 10;        // digit4 = 4 (48 / 10 = 4.8 => 4)
              number = number % 10;        // number = 8 (48 % 10 remainder => 8)
                                           // Now the number variable is updated to 8 no longer 48

             // The last digit (unit)
             digit5 = number;              // digit5 = 8

                    // Print each digit seperated by space
                    System.out.println();
             System.out.print(digit1 + " ");
             System.out.print(digit2 + " ");
             System.out.print(digit3 + " ");
             System.out.print(digit4 + " ");
             System.out.print(digit5 + " ");
             System.out.println();
   
        }
}

              

                 
