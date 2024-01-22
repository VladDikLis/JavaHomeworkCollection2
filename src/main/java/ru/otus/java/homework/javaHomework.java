package ru.otus.java.homework;

import java.util.HashMap;
import java.util.Map;

public class javaHomework {
    public static void main(String[] args) {
        PhoneBook book1 = new PhoneBook();

        book1.add("Иванов", "89964753456");
        book1.add("Петров", "89964847664");
        book1.add("Кравченко", "89673423567");
        book1.add("Иванов", "89938368257");
        book1.add("Серышев", "88567347678");
        book1.add("Полуцкий", "67845657845");
        book1.add("Волков", "67945656867");

        String name = "Иванов";

        if(book1.containsPhoneNumber(name)) {
            book1.find("Иванов");
        }

}
}
