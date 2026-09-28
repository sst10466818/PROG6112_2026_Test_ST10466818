/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.progtest;

/**
 *
 * @author emeris
 *Question 1
 */
public class Main {

 public static void main(String[] args) {

        String[] cityNames = {"Cape Town", "Port Elizabeth", "Pretoria"};

        // Rows = names of cities, Columns = different gaming consoles
        double[][] numberOfSales = {
                {1000 , 2000, 3000}, // Cape Town
                {2000 , 3000, 4000}, // Port Elizabeth
                {1500 , 1100, 1200}  // Pretoria
        };
        GamingConsole gamingConsole = new GamingConsole();

        System.out.println("--------------------------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT\n");
        System.out.printf("%-15s%-15s%-15s%-15s%n", "", "PS5", "XBOX", "SWITCH");
        System.out.println("--------------------------------------------------------------");

        for (int i = 0; i < numberOfSales.length; i++) {
            System.out.printf("%-15s%-15s%-15s%-15s%n",
                    cityNames[i],
                    "R " + numberOfSales[i][0],
                    "R " + numberOfSales[i][1],
                    "R " + numberOfSales[i][2]);
        }
        
        System.out.println("--------------------------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY\n");
        System.out.println("--------------------------------------------------------------");
        
         double[] totalSales = new double[numberOfSales.length];
        System.out.println();
        for (int i = 0; i < numberOfSales.length; i++) {
            //totalSales[i] = gamingConsole.GamingConsoleSales(numberOfSales[i]);
            System.out.printf("Total sales of gaming consoles for %s = R %,.0f%n", cityNames[i], totalSales[i]);
            System.out.println("--------------------------------------------------------------");
        }
        // Most salest
        System.out.println();
        int topIndex = gamingConsole.GamingConsoleSales(totalSales[i]);
        System.out.println("CITY WITH THE MOST SALES: " + cityNames[topIndex]);
         System.out.println("--------------------------------------------------------------");
 
 }
 };
