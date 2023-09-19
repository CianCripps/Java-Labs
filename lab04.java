import java.util.Scanner; // Import the Scanner class
import java.util.ArrayList; // Import the Scanner class
import java.util.Collections;
import java.util.HashMap;


public class lab04 {
    
    // Q1 CS Subjects
    static void subjects() {

        // Create an empty ArrayList to store the computer science subjects
        ArrayList<String> subjects = new ArrayList<String>();
        
        // Get input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the subjects
        System.out.println("Enter the computer science subjects:");

        // While another line exists
        while(input.hasNextLine()) {

            // Go to next line 
            String subject = input.nextLine();

            // If no more input exists
            if(subject.isEmpty()) {
                break; 
            }
            // Add subject to subjects ArrayList
            subjects.add(subject);
        }

        // Remove Networking from the ArrayList
        subjects.remove("Networking");
        
        // Sort the ArrayList in reverse alphabetical order
        Collections.sort(subjects, Collections.reverseOrder());
        
        // Print subjects in reverse alphabetical order
        System.out.println("Remaining computer science subjects:");

        // Iterate through the subjects in subjects ArrayList
        for(String subject : subjects) {
            System.out.println(subject);
        }

    }

    // Q2 Jersey Numbers
    public static void jerseys() {

        // Create a HashMap to store jersey numbers and names of players
        HashMap<Integer, String> jerseyNumbers = new HashMap<>();
        jerseyNumbers.put(8, "Gerrard");
        jerseyNumbers.put(10, "Mane");
        jerseyNumbers.put(11, "Salah");
        jerseyNumbers.put(27, "Nunez");
        jerseyNumbers.put(1, "Alison");
        jerseyNumbers.put(66, "Alexander-Arnold");
        jerseyNumbers.put(17, "Jones");
        jerseyNumbers.put(23, "Jordan");
        jerseyNumbers.put(9, "Firmino");

        // User input for jersey number
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a jersey number: ");
        int jerseyNumber = scanner.nextInt();

        // Search for player name in the HashMap
        String name = jerseyNumbers.get(jerseyNumber);

        // Output the player name
        if (name != null) {
            System.out.println("The player with jersey number " + jerseyNumber + " is " + name);
        } else {
            System.out.println("Jersey number " + jerseyNumber + " not in this team.");
        }
    }

    // Q4 two string inputs
    public static void twoInputs() {

        // Get user input for two strings
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        // (i) Concatenate the strings
        String concatenated = firstString + secondString;
        System.out.println("Concatenated string: " + concatenated);

        // (ii) Print the number of characters present in the strings (this will exclude the blank spaces)

        // Replace all spaces with empty string
        int firstStringLength = firstString.replaceAll("\\s", "").length();
        int secondStringLength = secondString.replaceAll("\\s", "").length();

        System.out.println("Number of characters in the first string: " + firstStringLength);
        System.out.println("Number of characters in the second string: " + secondStringLength);

        // (iii) Print the concatenated string in the reverse order
        String reversedString = new StringBuilder(concatenated).reverse().toString();
        System.out.println("Reversed string: " + reversedString);
    }


public static void main(String[] args) {
        
    // subjects();
    // jerseys();
    // twoInputs();
    
    }
}
