package ex29;

public class InputValidator {
    public static boolean isNumeric(String rate) {
        try {
            Integer.parseInt(rate);
        }
        catch(NumberFormatException e) {
            return false;
        }
        return true;
    }
    public static boolean isNonZero(String rate) {
        if(Integer.parseInt(rate) != 0)
            return true;
        return false;
    }
}
