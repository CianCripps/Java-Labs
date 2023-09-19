import java.util.Scanner; // Import the Scanner class
import java.util.Arrays; // Import the Arrays class


public class lab03 {
    
    // Q1 even and odd numbers
    static void evenOdd() {
        // input from user
        Scanner numbers = new Scanner(System.in);
        System.out.println("Enter 10 numbers: ");
        

        // counts for even and odd 
        int even = 0; 
        int odd = 0;

        for (int i = 1; i <= 10; i++) {
            int tenNumbers = numbers.nextInt();
            if (tenNumbers % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Number of even integers: " + even);
        System.out.println("Number of odd integers: " + odd);
    }

    // Q2 Standard deviation 
    static void StandardDeviation() {
       
        // input for N 
        Scanner n = new Scanner(System.in);
        System.out.println("Enter the number of input values: ");
        int N = n.nextInt();

        // initialize array 
        float[] numbers = new float[N];
        // initialize sum
        double sum = 0.0;

        // add values to array and sum 
        for (int i = 0; i < N; i++) {
            System.out.print("Enter value to add to list: ");
            sum += numbers[i];
        }
        // average of N input values x1 through xN
        double x_bar = sum / N;

        // intialize variance 
        double variance = 0.0;

        // determine variance and execute standard deviation equation 
        for (int i = 0; i < N; i++) {
            variance += Math.pow(numbers[i] - x_bar, 2);
        }
        double standardDev = Math.sqrt(variance / N);

        System.out.println("The standard deviation is: " + standardDev);
    }
    
    // Q3 alphabetical 
    static void alphabetically() {
        
        // create list of strings of size 10
        String[] names = new String[10];

        // input for names from user
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter a name: ");
            names[i] = input.nextLine();
        }

        // Sort the names in alphabetical order
        Arrays.sort(names);

        // Print the sorted names
        System.out.println("Sorted names:");
        System.out.println(names);
    }

    // Q4 Matrices
    static void Matrices() {

        // create the matrices 
        int[][] matrix1 = new int[3][3];
        int[][] matrix2 = new int[3][3];
        int[][] resultMatrix = new int[3][3];

        // input value from user for matrix content
        Scanner input = new Scanner(System.in);
        // first matrix
        System.out.println("Enter the elements of the first matrix: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix1[i][j] = input.nextInt();
            }
        }
        // second matrix 
        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix2[i][j] = input.nextInt();
            }
        }
        // add the matrices 
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("The sum of the two matrices is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Q5 transpose 
    static void transpose() {

        // determine the 2D matrices

        Scanner input = new Scanner(System.in);

        // Input the number of rows and columns of the matrix
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = input.nextInt();

        // initialize the matrix 
        int[][] matrix = new int[rows][cols];

        // Input the elements of the matrix
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        // Display the original matrix
        System.out.println("Original Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        System.out.println();
        }
      
        // Transpose the matrix
        int[][] transpose = new int[cols][rows];
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
            transpose[i][j] = matrix[j][i];
            }
        }

        // Display the transposed matrix
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
            System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Q6 3D array
    static void array() {
        
        // Create the 3D array 
        int[][][] array = {{{1, 2, 3}, {4, 5, 6}}, {{7, 8, 9}, {10, 11, 12}}};

        // Display the array 
        System.out.println("3D Array:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    System.out.print(array[i][j][k] + " ");
                }
            System.out.println();
            }
        System.out.println();
        }

        // number from user to search for
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        // Checking whether the number is present in the array or not
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    if (array[i][j][k] == num) {
                        found = true;
                        break;
                    }
                }
            }
        }

        // Displaying the result of the search
        if (found) {
            System.out.println(num + " is present in the array.");
        } else {
            System.out.println(num + " is not present in the array.");
        }
    }

    public static void main(String[] args) {

       // evenOdd();
       // StandardDeviation();
       // alphabetically();
       // Matrices();
       // transpose();
       array();
    }
}