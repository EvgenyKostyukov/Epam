package by.programming_with_classes.aggregation_and_composition.task1;

class Word {

    private String word;

    Word(String word) {
        this.word = word;
    }

    @Override
    public String toString() {
        return word;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

}
