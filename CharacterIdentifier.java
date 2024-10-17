package javafundamentals;

import java.util.Scanner;

public class CharacterIdentifier {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character:");
        char input = scanner.next().charAt(0);  

        System.out.println(input);

        if (Character.isDigit(input)) {
            System.out.println("Numeric");
        } else if (Character.isLetter(input)) {
            System.out.println("Letter");
        } else if (Character.isWhitespace(input)) {
            System.out.println("Space");
        } else {
            System.out.println("Punctuation Mark");
        }
    }
}
