package homework4core;


import java.util.HashMap;

import java.util.Map;

public class Work4 {
    public static void main(String[] args) {
        decision1();
        decision2();
    }
    private static void decision1() {
        Map<String, Integer> hm = new HashMap<>();
        String[] words = {
                "Cat", "Pig", "Apple",
                "Watch", "Watch", "Horse",
                "Dog", "Cat", "Shark","Dog",
                "Horse", "Fish", "Coffee",
                "Dog", "Fish", "Forest",
                "Cat", "Shark", "Home",
                "Horse", "Fish", "Coffee"
        };

        for (int i = 0; i < words.length; i++) {
            if (hm.containsKey(words[i]))
                hm.put(words[i], hm.get(words[i]) + 1);
            else
                hm.put(words[i], 1);
        }
        System.out.println(hm);
    }
    private static void decision2() {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Any", "89057612213");
        phoneBook.add("Ivan", "89092345671");
        phoneBook.add("Any", "89153109876");
        phoneBook.add("IvanHome", "84957756534");
        phoneBook.add("Tim", "89037378909");
        phoneBook.add("IvanHome", "84956788990");
        phoneBook.add("Smirnov", "89267856789");
        phoneBook.add("Smirnov", "89775673211");
        phoneBook.add("Ivan", "89037378734");
        phoneBook.add("Tim", "89037376609");
        phoneBook.add("IvanHome", "84956789086");
        phoneBook.add("Smirnov", "89269996789");
        phoneBook.add("Smirnov", "89097853211");
        phoneBook.add("Ivan", "89038908734");

        System.out.println(phoneBook.get("Any"));
        System.out.println(phoneBook.get("Ivan"));
        System.out.println(phoneBook.get("Tim"));
        System.out.println(phoneBook.get("Smirnov"));
        System.out.println(phoneBook.get("IvanHome"));
    }
}


