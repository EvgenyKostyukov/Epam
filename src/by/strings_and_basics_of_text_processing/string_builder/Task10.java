package by.strings_and_basics_of_text_processing.string_builder;

import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {

        //Test
        String s = "I like you 100 times, and you? I'm not sure about number 1.2345.";
        String[] parts = (s + " ").split("\\p{P}?[ \\t\\n\\r]+");
        System.out.println(Arrays.toString(parts));
    }
}
