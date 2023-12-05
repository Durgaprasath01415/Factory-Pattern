package org.designpattern;

import org.designpattern.dto.Plan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        GetPlanFactory getPlanFactory = new GetPlanFactory();
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the name of plan for which the bill will be generated: ");
        String billPlan = input.next();
        System.out.printf("Enter the number of units for bill will be calculated: ");
        int units = Integer.parseInt(input.next());
        Plan p = getPlanFactory.getPlan(billPlan);
        System.out.printf("Bill amount for " + billPlan + " of " + units + " units is: ");
        p.getRate();
        p.calculateBill(units);
    }
}