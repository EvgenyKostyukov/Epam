package by.basics_of_oop.task4;

public class Runner {
    public static Cave snakeGorynychcave = new Cave("Snake Gorynych");

    public static void main(String[] args) {
        ConsoleMenu consoleMenu = new ConsoleMenu();
        snakeGorynychcave.setNumberOfTreasure(100);
        consoleMenu.startConsoleMenu();
    }
}
