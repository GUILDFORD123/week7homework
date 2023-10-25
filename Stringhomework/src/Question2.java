public class Question_2 {
    public static void main(String[] args) {
        String input = " I love java ";
        String trimmedString = removeExtraSpaces(input);

        System.out.println("Original String: \"" + input + "\"");
        System.out.println("String with extra spaces removed: \"" + trimmedString + "\"");
    }

    public static String removeExtraSpaces(String str) {
        return str.trim();
    }
}
