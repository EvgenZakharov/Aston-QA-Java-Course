package src.lesson_11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        //1. Задание
        List<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("apple");
        words.add("orange");
        words.add("banana");
        words.add("kiwi");
        words.add("grape");
        words.add("kiwi");
        words.add("peach");
        words.add("apple");

        Set<String> uniqueWords = new HashSet<>(words);

        System.out.println("Уникальные слова: " + uniqueWords);

        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println("Количество вхождений каждого слова:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


        //2. Задание
        PhoneDirectory phoneDirectory = new PhoneDirectory();

        phoneDirectory.add("Иванов", "+123456789");
        phoneDirectory.add("Петров", "+987654321");
        phoneDirectory.add("Иванов", "+111111111");

        System.out.println("Номера для Иванов: " + phoneDirectory.get("Иванов"));
        System.out.println("Номера для Петров: " + phoneDirectory.get("Петров"));
        System.out.println("Номера для Сидоров: " + phoneDirectory.get("Сидоров"));
    }
}
