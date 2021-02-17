package by.basics_of_oop.task5.java.builder;

import by.basics_of_oop.task5.java.entity.Present;

abstract class PresentBuilder {
    Present present;

    void createPresent() {
        present = new Present();
    }

    abstract void buildName();

    abstract void buildPrice();

    abstract void buildWrap();

    abstract void buildProducts();

    Present getPresent() {
        return present;
    }
}
