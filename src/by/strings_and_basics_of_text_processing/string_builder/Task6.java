package by.strings_and_basics_of_text_processing.string_builder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task6 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String strings = reader.readLine();
            System.out.println(aditing(strings));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String aditing(String text) {
        StringBuilder stringBuilder = new StringBuilder();
        if (text != null) {
            char posSymbol;
            for (int i = 0; i < text.length(); i++) {
                posSymbol = text.charAt(i);
                stringBuilder.append(posSymbol).append(posSymbol);
            }
        }
        return stringBuilder.toString();
    }
}
