
public class Main {

    public static void main(String[] args) {
        // write test code here
        System.out.println(clockTime("23:00:00"));

    }

    public static boolean isAWeekDay(String string) {
        return (string.matches("mon|tue|wed|thu|fri|sat|sun"));
    }

    public static boolean allVowels(String string) {
        return (string.matches("(a|e|i|o|u|ä|ö)*"));
    }

    public static boolean clockTime(String string) {
        if (!string.matches("[0-2][0-9]:[0-5][0-9]:[0-5][0-9]")) {
            return false;
        }

        if (string.startsWith("2") && Character.getNumericValue(string.charAt(1)) > 3) {
            return false;
        }

        return true;
    }

}
