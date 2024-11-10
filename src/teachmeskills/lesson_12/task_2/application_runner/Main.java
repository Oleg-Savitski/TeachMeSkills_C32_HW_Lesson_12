package teachmeskills.lesson_12.task_2.application_runner;

import teachmeskills.lesson_12.task_2.verification_url.UrlVerification;

import java.util.Scanner;


/** Написать программу, которая будет проверять, что введенная ссылка валидная.
 * Например, при анализе вот такой ссылки:
 * https://teachmeskills.by/kursy/programmirovaniya-online - программа должна
 * вернуть, что ссылка валидна.
 * А при вводе tcp://teachmeskills.by/kursy/programmirovaniya-online - программа должна
 * вернуть, что ссылка не валидна (ссылка начинается ни с http, ни с https).
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputUrl;

        while (true) {
            System.out.println(" Enter the link: ");
            inputUrl = scanner.nextLine();

            if (inputUrl.trim().isEmpty()) {
                System.out.println(" Error: an empty value was entered, try again. ");
                continue;
            }

            UrlVerification urlVerification = new UrlVerification(inputUrl);

            if(urlVerification.isValidUrl(inputUrl)) {
                System.out.println(" The link is valid. ");
                break;
            } else {
                System.out.println(" The link is not valid, try again. ");
            }
        }

        scanner.close();
    }
}