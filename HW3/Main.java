package HW3;

public class Main {
    public static void main(String[] args) {
        String[] words = {"cat", "dog", "cat", "mouse", "mole", "tiger", "badger", "mouse", "rat", "mole"};
        SetOfWords hw = new SetOfWords();
        hw.setOfWords(words);
        hw.quantity(words);

        Phonebook pb = new Phonebook();
        pb.add("Ivanov", "89269558182");
        pb.add("Ivanov", "89269563532");
        pb.add("Petrov", "89268995154");

        System.out.println(pb.get("Ivanov"));
        System.out.println(pb.get("Petrov"));
        System.out.println(pb.get("Sidorov"));
    }
}
