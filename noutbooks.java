public class noutbooks {
    String brand;
    String model;
    String matrix;
    String os;
    String color;
    Integer ram;
    Integer hdd;
    Double diagonal;
    Double price;

    noutbooks(String input_brand, String input_model, String input_matrix, String input_os, String input_color,
            int input_ram, int input_hdd, double input_diagonal, double input_price) {
        brand = input_brand;
        model = input_model;
        matrix = input_matrix;
        os = input_os;
        color = input_color;
        ram = input_ram;
        hdd = input_hdd;
        diagonal = input_diagonal;
        price = input_price;

    }

    public String get_nout() {
        return ("Brand: " + brand + " model: " + model + " тип матрцы - " + matrix + " операционная сиситема - " + os
                + " Цвет - " + color + " оперативная память - " + ram + "Гб ПЗУ: " + hdd + "Гб диагональ экрана:"
                + diagonal
                + "'' цена " + price + " руб.");

    }

    public Integer get_ozu() {
        return (ram);

    }
}
