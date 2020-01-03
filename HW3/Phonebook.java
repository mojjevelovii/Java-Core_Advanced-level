package HW3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Phonebook {
    private Map<String, ArrayList<String>> phonebook = new HashMap<>();

    public void add(String name, String number) {

        if (phonebook.containsKey(name)) {
            ArrayList<String> numbers;
            numbers = phonebook.get(name);
            numbers.add(number);

        } else {
            ArrayList<String> numbers = new ArrayList<>();
            numbers.add(number);
            phonebook.put(name, numbers);
        }
    }

    public String get(String name) {
        ArrayList numbers = phonebook.get(name);
        if (numbers == null) {
            return name + ": not found.";
        } else {
            return name + ": " + Arrays.toString(numbers.toArray());
        }
    }
}
