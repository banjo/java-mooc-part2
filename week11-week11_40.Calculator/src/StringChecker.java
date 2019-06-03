public class StringChecker {

    public boolean CheckIfNumber(String string) {
        try {
            Integer.parseInt(string);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
