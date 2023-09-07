package ru.netology.services;

public class FreelanceService {
    public int calculate(int income, int expenses, int threshold) {
        int bill = 0;
        int counter = 0;
        for (int i = 0; i < 12; i++) {
            if (bill >= threshold) {
                bill = bill - expenses;
                bill = bill / 3;
                counter++;
            } else {
                bill = bill + income;
                bill = bill - expenses;

            }
        }
        return counter;
    }
}