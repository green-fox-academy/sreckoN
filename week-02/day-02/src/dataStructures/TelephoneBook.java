package dataStructures;

import java.util.HashMap;
import java.util.Map;

public class TelephoneBook {

    public static void main(String[] args) {

        Map<String, String> phonebook = new HashMap<>();

        phonebook.put("William A. Lathan", "405-709-1865");
        phonebook.put("John K. Miller", "402-247-8568");
        phonebook.put("Hortensia E. Foster", "606-481-6467");
        phonebook.put("Amanda D. Newland", "319-243-5613");
        phonebook.put("Brooke P. Askew", "307-687-2982");

        System.out.println(findPhoneNumber(phonebook, "John K. Miller"));
        System.out.println(findPerson(phonebook, "307-687-2982"));
        System.out.println(findPhoneNumber(phonebook,"Chris E. Myers"));

    }

    public static String findPhoneNumber(Map<String, String> phones, String name) {
        return phones.get(name);
    }

    public static String findPerson(Map<String, String> phones, String phone) {
        if (!phones.containsValue(phone)) return null;
        for (String key : phones.keySet()) {
            if (phones.get(key).equalsIgnoreCase(phone)) return key;
        }
        return null;
    }

}
