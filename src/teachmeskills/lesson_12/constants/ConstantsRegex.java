package teachmeskills.lesson_12.constants;

public interface ConstantsRegex {

    String HEX_COLOR_REGEX = "^#[0-9a-fA-F]{6}$"; // task one

    String URL_REGEX = "^(http://|https://).*"; // task two

    String URL_REGEX_FULL = "^(https?:\\/\\/)?([a-zA-Z0-9\\-]+\\.[a-zA-Z]{2,})(\\/[^\\s]*)?$"; // task two

    String VALUE_REGEX = "\\d+"; // task three
}