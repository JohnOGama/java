package javafundamentals;

import java.util.Scanner;

public class SummerJobCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Enter your hourly pay rate: ");
        double hourlyRate = scanner.nextDouble();

        System.out.print("Enter the number of hours worked each week: ");
        double hoursPerWeek = scanner.nextDouble();

      
        int weeks = 5; 
        double taxRate = 0.14;
        double clothesAndAccessoriesPercentage = 0.10;
        double schoolSuppliesPercentage = 0.01;
        double savingsBondsPercentage = 0.25;
        double parentsContributionPerDollar = 0.50;

        
        double totalIncome = hourlyRate * hoursPerWeek * weeks;

       
        double taxAmount = totalIncome * taxRate;
        double netIncome = totalIncome - taxAmount;

      
        double moneyForClothes = netIncome * clothesAndAccessoriesPercentage;
        double moneyForSchoolSupplies = netIncome * schoolSuppliesPercentage;

     
        double remainingMoney = netIncome - (moneyForClothes + moneyForSchoolSupplies);

   
        double moneyForSavingsBonds = remainingMoney * savingsBondsPercentage;
        double parentsContribution = moneyForSavingsBonds * parentsContributionPerDollar;

   
        System.out.printf("Your income before taxes: $%.2f%n", totalIncome);
        System.out.printf("Your income after taxes: $%.2f%n", netIncome);
        System.out.printf("Money spent on clothes and accessories: $%.2f%n", moneyForClothes);
        System.out.printf("Money spent on school supplies: $%.2f%n", moneyForSchoolSupplies);
        System.out.printf("Money spent on savings bonds: $%.2f%n", moneyForSavingsBonds);
        System.out.printf("Your parents' contribution to savings bonds: $%.2f%n", parentsContribution);

        scanner.close();
    }
}
