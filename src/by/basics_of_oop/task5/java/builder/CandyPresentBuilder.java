package by.basics_of_oop.task5.java.builder;

import by.basics_of_oop.task5.java.action.Client;
import by.basics_of_oop.task5.java.entity.Product;
import by.basics_of_oop.task5.java.entity.Wrap;

import java.util.ArrayList;

public class CandyPresentBuilder extends PresentBuilder {

    @Override
    void buildName() {
        String name = Client.checkInputName();
        present.setName(name);
    }

    @Override
    void buildPrice() {
        System.out.println("What price do you want to buy a gift for?");
        double price = Client.checkInputPrice();
        present.setPrice(price);
    }

    @Override
    void buildWrap() {
        Wrap wrap = Client.chooseWrap();
        present.setWrap(wrap);
    }

    @Override
    void buildProducts() {
        present.setProducts(new ArrayList<Product>());
    }
}
