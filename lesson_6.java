import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class lesson_6 {

    public static void main(String[] args) { // Создаем обьекты класса Noutbooks
        noutbooks nout_1 = new noutbooks("Lenovo", "yoga", "ips", "win10", "black", 2, 256, 15, 52000);
        noutbooks nout_2 = new noutbooks("Lenovo", "tab10", "ips", "android12", "grey", 4, 128, 10.7, 30000);
        noutbooks nout_3 = new noutbooks("Asser", "transformer", "tft", "win10", "grey", 6, 128, 13, 48000);
        noutbooks nout_4 = new noutbooks("Asser", "transformer", "tft", "none", "grey", 6, 128, 13, 40000);
        noutbooks nout_5 = new noutbooks("Asus", "eeе15", "let", "win10", "white", 8, 512, 15, 70000);

        HashSet<noutbooks> nouts = new HashSet<>(); //Создаем Set из ноутбуков
        nouts.add(nout_1);
        nouts.add(nout_2);
        nouts.add(nout_3);
        nouts.add(nout_4);
        nouts.add(nout_5);

        HashMap<Integer, String> criteria = new HashMap<>(); // Map критериев фильтрации ноутбуков
        criteria.put(1, "Бренд");
        criteria.put(2, "Модель");
        criteria.put(3, "Тип матрицы");
        criteria.put(4, "Операционная система");
        criteria.put(5, "Цвет");
        criteria.put(6, "ОЗУ");
        criteria.put(7, "ПЗУ");
        criteria.put(8, "Диагональ");
        criteria.put(9, "Цена");

        System.out.println(
                "Введите критерий фильтрации ноутбуков: "); // Запрашиваем критерий фильтрации у пользователя
        System.out.println(criteria);

        Scanner scan = new Scanner(System.in);
        int param = scan.nextInt();
        // System.out.println(param);
        input_parameter(param, nouts);
        scan.close();
    }

    public static void input_parameter(int param, HashSet<noutbooks> nouts) { // Выбираем метод в зависимости от
                                                                              // критерия фильтрации
        if (param == 6) {
            ozu(nouts);
        }
        // else if (param == 1) {
        // brend(nouts);
        // }
    }

    // private static void brend(HashSet<noutbooks> nouts) {
    // System.out.println("Выберите бренд ноутбука: ");
    // Scanner scan = new Scanner(System.in);
    // int min_ozu = scan.nextInt();
    // for (noutbooks item : nouts) {
    // if (item.ram >= min_ozu) {
    // System.out.println(item.get_nout());
    // }
    // }
    // scan.close();
    // }

    public static void ozu(HashSet<noutbooks> nouts) { // Метод фильтрации по минимальной ОЗУ

        System.out.println("Введите минимальный ОЗУ: ");
        Scanner scan = new Scanner(System.in);
        int min_ozu = scan.nextInt();
        for (noutbooks item : nouts) {
            if (item.ram >= min_ozu) {
                System.out.println(item.get_nout());
                System.out.println();
            }
        }
        scan.close();

    }

}
