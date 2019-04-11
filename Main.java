package com.company;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Period Gestation = Period.of(0, 10, 0);
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the month of your last period: ");
        int lmpM = sc.nextInt();
        System.out.print("Please enter the date of your last period: ");
        int lmpD = sc.nextInt();
        System.out.print("Please enter the year of your last period: ");
        int lmpY = sc.nextInt();
        LocalDate lmp = LocalDate.of(lmpY, lmpM, lmpD);
        LocalDate edd = lmp.plus(Gestation);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String eddString = edd.format(dtf);
        System.out.print("Your due date will be: " + eddString);
    }
}
