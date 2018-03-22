package pract2.task1.view;

import pract2.task1.model.entities.Shape;

public class Viewer {

    public static final String MENU = "1. Показать набор данных.\n" +
            "2. Вычислить суммарную площадь всех фигур набора данных.\n" +
            "3. Вычислить суммарную площадь фигур заданного вида.\n" +
            "4. Упорядочить набор данных по увеличению площади фигур.\n" +
            "5. Упорядочить набор данных по цвету фигур.\n" +
            "6. Выход";

    public static final String INPUT_SHAPE_TYPE = "Введите вид фигуры для поиска:";

    public static final String TOTAL_AREA_RESULT = "Суммарная площадь всех фигур набора данных:";

    public static final String TOTAL_AREA_BY_TYPE_RESULT = "Суммарная площадь фигур заданного вида:";

    public static final String SORTED_BY_AREA= "Упорядоченный набор по увеличению площади фигур:";

    public static final String SORTED_BY_COLOR= "Упорядоченный набор по цвету фигур:";

    public static final String ERROR_INPUT = "Ошибка ввода.";


    public void showShapeArray(Shape[] shapes) {
        for(Shape shape: shapes)
            System.out.println(shape);
    }

}
