package pract2.task2.view;

import pract2.task2.model.entities.Patient;

import java.util.ArrayList;
import java.util.List;

public class Viewer {

    public static String INPUT_DIAGNOSIS = "Введите диагноз:";
    public static String INPUT_START_INT = "Введите стартовый номер медкарты:";
    public static String INPUT_END_INT = "Введите конечный номер медкраты:";
    public static String INPUT_ERROR = "Ошибка ввода";
    public static String INPUT_FILE_NAME = "Введите имя и путь к файлу:";
    public static String FILE_NOT_FOUND = "Файл не найден!";
    public static String MENU = "1. Получить список пациентов, которые имеют указанный диагноз.\n" +
            "2. Получить список пациентов, у которых номер\n" +
            "медицинской карточки находится в заданном диапазоне.\n" +
            "3. Упорядочить пациентов в алфавитном порядке\n" +
            "согласно фамилии.\n" +
            "4. Вывести набор пациентов.\n" +
            "5. Сгенерировать новый набор пациентов.\n" +
            "6. Сохранить набор обьектов в файл.\n" +
            "7. Прочитать набор обьектов из файла.\n" +
            "8. Выход";



    public static void showPatientList(List<Patient> patientList) {
        System.out.println("Список пациентов:");
        if(patientList.isEmpty())
            System.out.println("Список пуст.");
        else {
            for (Patient patient : patientList) {
                System.out.println(patient);
            }
        }
    }
}
