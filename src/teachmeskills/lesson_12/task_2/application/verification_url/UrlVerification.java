package teachmeskills.lesson_12.task_2.application.verification_url;

import java.util.regex.Pattern;

import static teachmeskills.lesson_12.constants.ConstantsRegex.URL_REGEX;
import static teachmeskills.lesson_12.constants.ConstantsRegex.URL_REGEX_FULL;

public class UrlVerification {
    private String url;

    public UrlVerification(String url) {
        this.url = url;
    }

    public boolean isValidUrl(String url) {
        Pattern pattern = Pattern.compile(URL_REGEX);
        Pattern anotherPattern = Pattern.compile(URL_REGEX_FULL);
        return pattern.matcher(url).matches() || anotherPattern.matcher(url).matches();
    }
}