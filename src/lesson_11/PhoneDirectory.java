package src.lesson_11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneDirectory {
    private Map<String, List<String>> directory;

    public PhoneDirectory() {
        directory = new HashMap<>();
    }

    public void add(String surname, String phoneNumber) {
        // Получаем список номеров по фамилии, если его нет, создаем новый
        List<String> phoneNumbers = directory.getOrDefault(surname, new ArrayList<>());
        phoneNumbers.add(phoneNumber);
        directory.put(surname, phoneNumbers);
    }

    public List<String> get(String surname) {
        return directory.getOrDefault(surname, new ArrayList<>());
    }
}
