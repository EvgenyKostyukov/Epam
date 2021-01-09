package by.strings_and_basics_of_text_processing.string_builder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task2 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String strings = reader.readLine();
            System.out.println("Easy way: " + putBAfterA(strings, "a", "b"));
            System.out.println("Hard way: " + replacement(strings, 'a', 'b'));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String putBAfterA(String text, String symbolBefore, String symbolAfter) {
        return text.replaceAll(symbolBefore, symbolBefore + symbolAfter);
    }

    private static String replacement(String text, char symbolBefore, char symbolAfter) {
        StringBuilder stringBuilder = new StringBuilder();
        if (text != null) {
            char posSymbol;
            for (int i = 0; i < text.length(); i++) {
                posSymbol = text.charAt(i);
                stringBuilder.append(posSymbol);
                if (posSymbol == symbolBefore) {
                    stringBuilder.append(symbolAfter);
                }
            }
        }
        return stringBuilder.toString();
    }
}
