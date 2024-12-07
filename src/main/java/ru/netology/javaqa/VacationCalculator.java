package ru.netology.javaqa;

public class VacationCalculator {

    public int calculate(int income, int expenses, int threshold) {
        int monthsVacation = 0;
        int savings = 0;
        for (int month = 0; month < 12; month++) {
            if (savings >= threshold) {
                monthsVacation++;
                savings -= expenses;
                savings -= savings / 3;  // траты на отдых
            } else {
                savings += income;
                savings -= expenses;
            }
        }
        return monthsVacation;
    }

    public int calcBonus(int initialBalance, int monthlyIncome, int monthlyExpense) {
        int months = 0;
        int balance = initialBalance;
        while (balance >= monthlyExpense) {
            balance -= monthlyExpense;
            balance += monthlyIncome;
            months++;
        }
        return months;
    }
}