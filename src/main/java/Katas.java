import java.util.Locale;

public class Katas {

    public String reverseString(String str) {

        StringBuilder builder = new StringBuilder(str);
        builder.reverse();
        return builder.toString();
    }


    public String stringToUpperCase(String str) {

        return str.toUpperCase();
    }

    public String stringToLowerCase(String str) {

        return str.toLowerCase();
    }
}
