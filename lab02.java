import java.util.Scanner; // Import the Scanner class

public class lab02 {
    // Q1 
    static void weight() {
        // cost per pound and sales tax
        float cost_per_pound = 5.99f;
        float sales_tax = 0.0725f;

        // get user input for unit weight
        Scanner unit_Weight = new Scanner(System.in);
        System.out.println("Enter Unit Weight: ");
        float unitWeight = unit_Weight.nextFloat(); // Read user input

        // get user input for number of units
        Scanner num_unit = new Scanner(System.in);
        System.out.println("Enter number of units: ");
        float numberOfUnits = num_unit.nextFloat(); // Read user input

        // total price 
        float totalPrice = (unitWeight * numberOfUnits * cost_per_pound);

        // total price with tax 
        float totalPriceWithTax = (totalPrice + totalPrice * sales_tax);

        System.out.printf("Number of bags sold: " + numberOfUnits);
        System.out.printf("Weight per bag: " + unitWeight);
        System.out.printf("Price per pound: $" + cost_per_pound);
        System.out.printf("Sales tax: " + (sales_tax * 100));
        System.out.printf("Total Price: $" + totalPriceWithTax);
    }
    
    // Q2 Perfect number
    static void perfectNum() {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter a number between 20 and 30: ");
        float number = num.nextFloat(); // Read user input

        int sum = 1; // Proper divisor sum initialized to 1 as 1 is a proper divisor for all numbers
        System.out.print("Proper divisors of " + num + ": 1 "); // Displaying 1 as first proper divisor for all numbers
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
                System.out.print(i + " ");
            }
        }
        if (sum == number) {
            System.out.println("\n" + num + " is a perfect number.");
        } else {
            System.out.println("\n" + num + " is not a perfect number.");
        }
    } 
    // Q3 Grades
    static void Grades() {
        // get user input for unit weight
        Scanner numStudents = new Scanner(System.in);
        System.out.println("Enter number of students: ");
        int students = numStudents.nextInt(); // Read user input

        for (int i = 0; i < students; i++) {
            // input name
            // get user input for unit weight
            
            Scanner studentName = new Scanner(System.in); 
            System.out.println("Enter student name: ");
            String name = studentName.nextLine(); // Read user input
            

            // input grade
            // get user input for unit weight
            Scanner grade = new Scanner(System.in);
            System.out.println("Enter marks achieved: ");
            float marks = grade.nextFloat(); // Read user input

            // determine grade
            System.out.printf("Name: " +name);
            if (marks > 80) {
                System.out.println("Grade: A");
            }
            else if (marks > 60) {
                System.out.println("Grade: B");
            }
            else if (marks > 40) {
                System.out.println("Grade: C");
            }
            else {
                System.out.println("Grade: D");
            }    
        }
    }
    // Q4 pattern #1
    static void pattern1() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Q5 pattern #2
    static void pattern2() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Q6 pattern #3
    static void pattern3() {
        // input number of rows
        
        Scanner numRows = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int rows = numRows.nextInt(); 

        int middleRow = (rows / 2) + 1;

        // Upper half of the diamond
        for (int i = 1; i <= middleRow; i++) {
            for (int j = middleRow; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (i * 2) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half of the diamond
        for (int i = middleRow + 1; i <= rows; i++) {
            for (int j = middleRow; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= ((rows - i + 1) * 2) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {

        // perfectNum();
        // pattern3();
        // pattern2();
        // pattern1();
        // weight();
        // Grades();
    }
}