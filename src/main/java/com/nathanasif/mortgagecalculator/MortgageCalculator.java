package com.nathanasif.mortgagecalculator;

import java.util.Scanner;
import java.text.NumberFormat;

/**
 *
 * @author nathan
 */
public class MortgageCalculator {

    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        
        System.out.println("Mortgage Calculator");
        
        // Inputs
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Principal: ");
        int principal = scanner.nextInt();
        
        System.out.print("Anual Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        
        System.out.print("Period (Years): ");
        int years = scanner.nextInt();
        int numberOfPayments = years * 12;
        
        // Calculate Mortgage
        float m;
        
        m = principal * monthlyInterest * (float)(Math.pow((1 + monthlyInterest), numberOfPayments)) / (float)(Math.pow((1 + monthlyInterest), numberOfPayments) -            1);
        
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String mortgage = currency.format(m);
        
        System.out.println("Monthly Payment: " + mortgage);
    }
}
