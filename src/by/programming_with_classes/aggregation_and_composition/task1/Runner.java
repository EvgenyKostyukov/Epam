package by.programming_with_classes.aggregation_and_composition.task1;

public class Runner {

    public static void main(String[] args) {
        Word heading = new Word("Head of text.");
        String line1 = "Lorem Ipsum is simply dummy text of the printing and typesetting" +
                " industry. Lorem Ipsum has been the industry's standard dummy" +
                " text ever since the 1500s, when an unknown printer took a galley" +
                " of type and scrambled it to make a type specimen book. .\n";
        Sentence sentence = new Sentence(line1);
        Text poem = new Text(heading, sentence);

        String line2 = "Contrary to popular belief, Lorem Ipsum is not simply random text. " +
                "It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old." +
                " Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia.\n";
        String line3 = "Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for" +
                " government management of industry and enterprise. Some, I think, see" +
                " socialism as a tool to break down the ideologies of injustice that " +
                "Various versions have evolved over the years, sometimes by accident.\n";
        poem.addSentence(new Sentence(line2));
        poem.addSentence(new Sentence(line3));

        poem.printText();
        poem.printHeading();
    }
}