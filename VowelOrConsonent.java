import java.util.Scanner;

class VowelOrConsonent {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the character: ");
        char ch = input.nextLine().toLowerCase().charAt(0); // Convert to lowercase to handle uppercase characters

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("Vowel"); // Fixed typo: "VOwel" to "Vowel"
        } else {
            System.out.println("Consonant"); // Fixed typo: "consonent" to "Consonant"
        }
        
        input.close(); // Close the scanner object at the end of the program
    }
}
