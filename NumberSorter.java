package javafundamentals;

import java.util.Arrays;
import java.util.Scanner;

public class NumberSorter {

    public static void main(String[] args) {
   
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 3 integers separated by spaces: ");


        int[] numbers = new int[3];
        for (int i = 0; i < 3; i++) {
            numbers[i] = scanner.nextInt();  
        }

      
        int[] sortedNumbers = numbers.clone();

      
        Arrays.sort(sortedNumbers);
        
        for (int i = 0; i < 3; i++) {
            System.out.print(numbers[i] + " ");
        }
        
        System.out.println();
        
        for (int i = 0; i < 3; i++) {
            System.out.print(sortedNumbers[i] + " ");
        }
   
        System.out.println();

    }
}
