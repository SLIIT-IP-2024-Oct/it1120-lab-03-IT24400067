import java.util.Scanner;

public class IT24400067Lab3Q3 {

     public static void main(String[] args) {

            // Declare and initialize variables
            int amount = 0;
            int count5000 = 0;
            int count1000 = 0;
            int count500 = 0;
            int count200 = 0;
            int count100 = 0;
            int count50 = 0;
            int count20 = 0;
            int count10 = 0;
            int count5 = 0;
            int count2 = 0;
            int count1 = 0;

                    // Create a Scanner object to read input
            Scanner input = new Scanner(System.in);

            // Input the rupee amount
            System.out.print("Enter the Rupee amount: ");
            amount = input.nextInt();   // if amount entered is 2754

            // Calculate the number of 5000 rupee notes
            count5000 = amount / 5000;  // count5000 = (2754 / 5000 = 0)
            amount = amount % 5000;     // amount = 2754 (In Modulus Operation if Dividend [2754] is smaller than the Divisor [5000], then remainder is the original dividend number)

            // Calculate the number of 1000 rupee notes
            count1000 = amount / 1000;  // count1000 = 2 (2754 / 1000 = 2.754 = 2)
            amount = amount % 1000;     // amount = 754 (2754 % 1000 = remainder => 754)
                                        // Now the amount variable is updated to 754 no longer 2754

            // Calculate the amount of 500 rupee notes
            count500 = amount / 500;    // count500 = 2 (754 / 500 = 1.754 => 1)
            amount = amount % 500;      // amount = 254 (754 % 500 = remainder => 254)
                                        // Now the amount variable is updated to 254 no longer 754

            // Calculate the amount of 200 rupee notes
            count200 = amount / 200;
            amount = amount % 200;


            // Calculate the amount of 100 rupee notes
            count100 = amount / 100;
            amount = amount % 100;


            // Calculate the amount of 50 rupee notes
            count50 = amount / 50;
            amount = amount % 50;


            // Calculate the amount of 20 rupee notes
            count20 = amount / 20;
            amount = amount % 20;


            // Calculate the amount of 10 rupee notes
            count10 = amount / 10;
            amount = amount % 10;


            // Calculate the amount of 5 rupee notes
            count5 = amount / 5;
            amount = amount % 5;

            // Calculate the amount of 2 rupee notes
            count2 = amount / 2;
            amount = amount % 2;


            // Calculate the amount of 1 rupee notes
            count1 = amount / 1;
            amount = amount % 1;

            // Print the results
            System.out.println("5000 Rupee notes: " + count5000);
            System.out.println("1000 Rupee notes: " + count1000);
            System.out.println("500 Rupee notes: " + count500);
            System.out.println("200 Rupee notes: " + count200);
            System.out.println("100 Rupee notes: " + count100);
            System.out.println("50 Rupee notes: " + count50);
            System.out.println("20 Rupee notes: " + count20);
            System.out.println("10 Rupee notes: " + count10);
            System.out.println("5 Rupee notes: " + count5);
            System.out.println("2 Rupee notes: " + count2);
            System.out.println("1 Rupee notes: " + count1);

    }
}






            
            

      