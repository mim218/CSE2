//Michaela Martines
//CSE 002, Section 112
//Homework 2
//Arithmetic Java Program

//  first compile the program
//      javac Arithmetic.java
//  run the program
//      java Arithmetic//

//  define a class
    public class Arithmetic{
        
//  add main method
    public static void main(String[] args) {
        
//  input your variables from shopping:
   
//      Number of pairs of socks
        int nSocks=3;
//      Cost per pair of socks
//      (‘$’ is part of the variable name)
        double sockCost$=2.58;
    
//      Number of drinking glasses
        int nGlasses=6;
//      Cost per glass
        double glassCost$=2.29;
    
//      Number of boxes of envelopes
        int nEnvelopes=1;
//      cost per box of envelopes
        double envelopeCost$=3.25;
        double taxPercent=0.06;
        
        
//  declare variables and sales tax separately

//      total cost of socks
        double totalSockCost$=sockCost$ * nSocks;
//      sales tax of total cost of socks
        double SockTax$= totalSockCost$ * taxPercent;
        int SockTax1$=(int)(SockTax$ * 100);
        double SockTaxFixed$= SockTax1$ / 100.0;
        
        
//      total cost of drinking glasses
        double totalGlassCost$=glassCost$ * nGlasses;
//      sales tax of total cost of glasses
        double GlassTax$= totalGlassCost$ * taxPercent;
        int GlassTax1$=(int) (GlassTax$ * 100);
        double GlassTaxFixed$=GlassTax1$ / 100.0;
        
//      total cost of boxes of envelopes
        double totalEnvelopeCost$=envelopeCost$ * nEnvelopes;
//      sales tax of total cost of envelopes
        double EnvelopeTax$= totalEnvelopeCost$ * taxPercent;
        int EnvelopeTax1$=(int) (EnvelopeTax$ * 100);
        double EnvelopeTaxFixed$=EnvelopeTax1$ / 100.0;
        

//  total cost of all purchases

//      add all prices together, excluding sales tax
        double totalCost$=totalSockCost$ + totalGlassCost$ + totalEnvelopeCost$;
        
        
//  total cost including sales tax

//      compute sales tax for all items
        double totalCostTax$=totalCost$ * taxPercent;
        int totalCostTax1$=(int)totalCostTax$ * 100;
        double totalCostTaxFixed$=totalCostTax1$ / 100.0;
        
//      add total cost without sales tax to the sales tax
        double totalCostTaxIncluded$=totalCost$ + totalCostTaxFixed$;
        
//  explain output and print
        System.out.println("There are "+nSocks+" socks, "+nGlasses+" glasses, and "+nEnvelopes+" envelopes.");
        System.out.println("The respective costs per unit are "+sockCost$+", "+glassCost$+", and "+envelopeCost$+".");
        System.out.println("The respective total costs are "+totalSockCost$+", "+totalGlassCost$+", and "+totalEnvelopeCost$+".");
        System.out.println("The respective sales taxes are "+SockTaxFixed$+", "+GlassTaxFixed$+", and "+EnvelopeTaxFixed$+".");
        System.out.println("The total cost of all purchases without tax is "+totalCost$+".");
        System.out.println("The total sales tax for all items is "+totalCostTax$+".");
        System.out.println("The total amount to be paid is "+totalCostTaxIncluded$+".");
        
//test the program
        
        
    }
    }