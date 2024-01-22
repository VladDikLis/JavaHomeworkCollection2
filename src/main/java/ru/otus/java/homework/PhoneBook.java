package ru.otus.java.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    Map<String, ArrayList<String>> telephone;

    public PhoneBook() {
        telephone = new HashMap<>();
    }
    public void add(String Name, String Phone) {
        ArrayList<String> list = new ArrayList<>();
        if (telephone.containsKey(Name)) {
            list = telephone.get(Name);
            list.add(Phone);
            telephone.put(Name, list);
            return;
        }
        list.add(Phone);
        telephone.put(Name, list);
    }

    public void find(String Name) {
        System.out.println(telephone.get(Name));
    }

    public Boolean containsPhoneNumber(String Name) {
        return telephone.containsKey(Name);
    }
}
