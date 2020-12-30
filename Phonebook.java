package java2_lesson3;

import java.util.HashMap;
import java.util.HashSet;


public class Phonebook {

    private HashMap<String, HashSet<String>> phonebook;

    public Phonebook() {
        this.phonebook = new HashMap<>();
    }

    public void addEntry(String surname, String phoneNumber) {
        HashSet<String> setPhoneDirect = phonebook.getOrDefault(surname, new HashSet<>());
        setPhoneDirect.add(phoneNumber);
        phonebook.put(surname, setPhoneDirect);
    }

    public void getSearch(String surname) {
        System.out.println("По фамилии '" + surname + "' номер телефона: " + phonebook.getOrDefault(surname, new HashSet<>()));
    }


}

