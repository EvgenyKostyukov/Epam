package by.strings_and_basics_of_text_processing.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String strings = reader.readLine();
            System.out.println(replaceSpaces(strings));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String replaceSpaces(String string) {
        StringBuilder strBuilder = new StringBuilder();
        String str = string.trim();
        boolean isSpace = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                if (!isSpace) {
                    strBuilder.append(" ");
                }
                isSpace = true;
            } else {
                strBuilder.append(str.charAt(i));
                isSpace = false;
            }
        }
        return strBuilder.toString();
    }
}
