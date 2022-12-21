import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
public class lesson_5 {
    public static void main(String[] args) {

        HashMap<String, String> t_book = new HashMap<>();
        t_book.put("123", "Ivanov");
        t_book.put("223", "Petrov");
        t_book.put("423", "Ivanov");
        t_book.put("823", "Sidorov");
        t_book.put("173", "Mitin");
        t_book.put("163", "Putilov");
        t_book.put("133", "Sidorov");
        t_book.put("126", "Ivanov");

        search(t_book);

        ArrayList<String> p_book = new ArrayList<>();
        p_book.add("Иван Иванов");
        p_book.add("Светлана Петрова");
        p_book.add("Кристина Белова");
        p_book.add("Анна Мусина");
        p_book.add("Анна Крутова");
        p_book.add("Иван Юрин");
        p_book.add("Петр Лыков");
        p_book.add("Павел Чернов");
        p_book.add("Петр Чернышов");
        p_book.add("Мария Федорова");
        p_book.add("Марина Светлова");
        p_book.add("Мария Савина");
        p_book.add("Мария Рыкова");
        p_book.add("Марина Лугова");
        p_book.add("Анна Владимирова");
        p_book.add("Иван Мечников");
        p_book.add("Петр Петин");
        p_book.add("Иван Ежов");

        sortName(p_book);

    }
    // Пусть дан список сотрудников. Написать программу, которая найдет и выведет
    // повторяющиеся имена с количеством повторений Отсортировать по убыванию
    // популярности.

    private static void sortName(ArrayList p_book) {
        ArrayList<String[]> pm_book = new ArrayList<>();
        for (int index = 0; index < p_book.size(); index++) {
            pm_book.add(((String) p_book.get(index)).split(" "));
            // System.out.println(pm_book.get(index)[0]);
        }

        HashMap<String, Integer> person_book = new HashMap<>();
        for (int index = 0; index < pm_book.size(); index++) {
            if (person_book.containsKey(pm_book.get(index)[0])) {
                int new_count = person_book.get(pm_book.get(index)[0]) + 1;
                person_book.put(pm_book.get(index)[0], new_count);
            } else {
                person_book.put(pm_book.get(index)[0], 1);
            }
        }
        System.out.println(person_book.toString());

        List<Integer> mapV = new ArrayList<>(person_book.values());
        Collections.sort(mapV);
        Collections.reverse(mapV);
        // System.out.println(mapV);

        ArrayList<String[]> pms_book = new ArrayList<>();
        for (int index = 0; index < mapV.size(); index++) {
            for (int jindex = 0; jindex < pm_book.size(); jindex++) {
                if (person_book.get(pm_book.get(jindex)[0]) == mapV.get(index)) {
                    for (int triindex = jindex; triindex < pm_book.size(); triindex++) {
                        if (pm_book.get(triindex)[0].contains(pm_book.get(jindex)[0])) {
                            pms_book.add(pm_book.get(triindex));
                        }

                    }
                    person_book.put(pm_book.get(jindex)[0], 0);
                }
            }
        }
        for (int i = 0; i < pms_book.size(); i++) {
            System.out.println(pms_book.get(i)[0] + " " + pms_book.get(i)[1]);
        }
    }

    private static void search(HashMap t_book) {
        System.out.println("Для поиска номеров введите фамилию на английском:");
        Scanner scan = new Scanner(System.in);
        String surname = scan.nextLine();

        ArrayList<String> values_t_book = new ArrayList<>(t_book.values());
        ArrayList<String> keys_t_book = new ArrayList<>(t_book.keySet());
        int count = 0;

        for (int index = 0; index < values_t_book.size(); index++) {
            if (surname.equals(values_t_book.get(index))) {
                count += 1;
                System.out.println(keys_t_book.get(index));
            } else {
                continue;
            }
        }
        if (count == 0) {
            System.out.println("Такого контакта нет");
        }
    }

}