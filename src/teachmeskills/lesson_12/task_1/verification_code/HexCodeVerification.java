package teachmeskills.lesson_12.task_1.verification_code;

import java.util.regex.Pattern;

import static teachmeskills.lesson_12.constants.ConstantsRegex.HEX_COLOR_REGEX;

public class HexCodeVerification {
    private String colorCode;

    public HexCodeVerification(String colorCode) {
        this.colorCode = colorCode;
    }

    public boolean isValidCode() {
        Pattern pattern = Pattern.compile(HEX_COLOR_REGEX);
        return pattern.matcher(colorCode).matches();
    }
}