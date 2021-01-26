package by.programming_with_classes.the_simplest_classes.task8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Comparator;

public class Runner {

    public static void main(String[] args) {
        CustomerStorage vipClient = new CustomerStorage("VIP clients", new ArrayList<>());

        vipClient.addCustomer("Zakhno", "Eugene", "Sergeevich",
                "Gomel", new BigInteger("1111111111111111"), 12345678);
        vipClient.addCustomer("Tereshchenko", "Anastasia", "Vladislavovna",
                "Minsk", new BigInteger("2222222222222222"), 23456789);
        vipClient.addCustomer("Solovei", "Yegor", "Vasilievich",
                "Moskou", new BigInteger("3333333333333333"), 34567891);
        vipClient.addCustomer("Kovalec", "Svetlana", "Konstantinovna",
                "Warsaw", new BigInteger("4444444444444444"), 45678912);
        vipClient.addCustomer("Saiko", "Dmitry", "Antonovich",
                "Kiev", new BigInteger("5555555555555555"), 56789123);

        System.out.println("Список покупателей в алфавитном порядке:");
        vipClient.sortName();
        for (int i = 0; i < vipClient.getBase().size(); i++) {
            System.out.println(vipClient.getBase().get(i));
        }

        System.out.println("\nСписок покупателей, у которых номер кредитной карточки находится в заданном интервале:");
        ArrayList<Customer> list = vipClient.getCustomerByCreditCardRange("2000000000000000", "5000000000000000");
        list.sort(Comparator.comparing(Customer::getCardNumber));
        if (list.size() == 0) {
            System.out.println("банковские карты не найдены");
        } else {
            for (Customer customer : list) {
                System.out.println(customer);
            }
        }
    }
}