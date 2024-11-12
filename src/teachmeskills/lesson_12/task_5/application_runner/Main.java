package teachmeskills.lesson_12.task_5.application_runner;

import teachmeskills.lesson_12.task_5.components.Bank;
import teachmeskills.lesson_12.task_5.reasoning.InputReader;

import java.util.ArrayList;
import java.util.List;

/** Банковский вклад.
 * Пользователь делает вклад в размере a рублей сроком на years лет под 10% годовых
 * (каждый год размер его вклада увеличивается на 10%.Эти деньги прибавляются к
 * сумме вклада, и на них в следующем году тоже будут проценты).
 * Написать программу bank, принимающая аргументы a и years, и возвращающую
 * сумму, которая будет на счету пользователя.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println(" *** Bank Deposit Calculator *** ");
        List<Bank> deposits = new ArrayList<>();

        while (true) {
            double initialAmount = InputReader.readAmount();
            int years = InputReader.readYears();
            double interestRate = InputReader.readRate();

            Bank bank = new Bank(initialAmount, interestRate, years);
            deposits.add(bank);

            double finalAmount = bank.calculateAmount();
            System.out.printf(" The total amount after in %d years: %.2f rubles'%n", years, finalAmount);

            System.out.print(" Do you want to add another contribution? (yes/no): ");
            String response = InputReader.getStringInput();
            if (!response.equalsIgnoreCase("yes")) {
                break;
            }
        }

        if (deposits.isEmpty()) {
        } else {
            System.out.println("----------------------");
            System.out.println(" History of deposits: ");
            for (int i = 0; i < deposits.size(); i++) {
                System.out.printf("Deposit %d:%n%sThe total amount: %.2f rubles'%n%n",
                        i + 1, deposits.get(i), deposits.get(i).calculateAmount());
            }
        }
    }
}