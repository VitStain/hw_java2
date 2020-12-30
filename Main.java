package java2_lesson3;


import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> kitWords = Arrays.asList(
                "java", "kotlin", "go", "php", "ruby",
                "javascript", "java", "perl", "kotlin", "php",
                "cobol", "c", "go", "kotlin", "java", "python",
                "swift", "python", "scala", "assembler", "java");

//      Если нужно отдельно найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем):
        Set<String> inimitable = new HashSet<>(kitWords);
        System.out.println(inimitable);

//      Посчитать, сколько раз встречается каждое слово:
        HashMap<String, Integer> setUnique = new HashMap<>();

        for (String unique : kitWords) {
            setUnique.put(unique, setUnique.getOrDefault(unique, 0) + 1);
        }
        System.out.println(setUnique);

//      2-е задание:
        Phonebook phonebook = new Phonebook();
        phonebook.addEntry("Пупкин", "9209208888");
        phonebook.addEntry("Любкин", "9259257777");
        phonebook.addEntry("Сюткин", "9099099999");
        phonebook.addEntry("Добролюбова", "9909909090");
        phonebook.addEntry("Сюськин", "9119119191");
        phonebook.addEntry("Скворцова", "9159151515");
        phonebook.addEntry("Добродеева", "9109101010");
        phonebook.addEntry("Добролюбова", "9009009090");
        phonebook.addEntry("Пупкин", "9129121212");

        phonebook.getSearch("Добродеева");
        phonebook.getSearch("Сюткин");
        phonebook.getSearch("Добролюбова");
        phonebook.getSearch("Пупкин");
        phonebook.getSearch("Любкин");



    }
}


