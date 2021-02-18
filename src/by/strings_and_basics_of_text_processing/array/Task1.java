package by.strings_and_basics_of_text_processing.array;

public class Task1 {
    public static void main(String[] args) {
        String[] camelCaseArray = {"cameCase", "thatWasAwesome", "itIsTheFinalCountDown", "getPermit"};
        String[] snakeCase = convertingToSnakeCase(camelCaseArray);
        System.out.println(String.join(", ", camelCaseArray));
        System.out.println(String.join(", ", snakeCase));
    }

    private static String[] convertingToSnakeCase(String[] array) {
        String[] snakeCase = new String[array.length];
        for (int i = 0; i < snakeCase.length; i++) {
            StringBuilder strBuilder = new StringBuilder();
            for (int j = 0; j < array[i].length(); j++) {
                char letter = array[i].toCharArray()[j];

                if (Character.isLowerCase(letter)) {
                    strBuilder.append(letter);
                } else {
                    strBuilder.append("_");
                    strBuilder.append(Character.toLowerCase(letter));
                }
            }
            snakeCase[i] = strBuilder.toString();
        }
        return snakeCase;
    }
}
