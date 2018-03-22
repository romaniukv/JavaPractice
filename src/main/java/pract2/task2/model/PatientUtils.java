package pract2.task2.model;

import pract2.task2.model.entities.Patient;

import java.util.ArrayList;
import java.util.Comparator;

public class PatientUtils {
    private ArrayList<Patient> patients = new ArrayList<>();
    private static ArrayList<Patient> defaultPatientsList = new ArrayList<>();


    public PatientUtils() {
       generatePatientList();
    }

    public void generatePatientList() {
        patients.clear();
        for(int i = 0; i < 8; i++) {
            Patient patient = defaultPatientsList.get((int) (Math.random() * 15));
            if (!patients.contains(patient))
                patients.add(patient);
            else
                i--;
        }
    }

    public ArrayList<Patient> searchByDiagnosis(String diagnosis) {
        ArrayList<Patient> result = new ArrayList<>();
        for(Patient patient: patients) {
            if (patient.getDiagnosis().compareTo(diagnosis) == 0)
                result.add(patient);
        }
        return result;
    }

    public ArrayList<Patient> searchByMedicalCardNumber(int card1, int card2) {
        ArrayList<Patient> result = new ArrayList<>();
        for(Patient patient: patients) {
            if ( patient.getMedicalCardNumber() >= card1 && patient.getMedicalCardNumber() <= card2)
                result.add(patient);
        }
        return result;
    }

    public void sortPatients() {
        patients.sort(new PatientCompare());
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public class PatientCompare implements Comparator<Patient> {
        @Override
        public int compare(Patient o1, Patient o2) {
            return o1.getLastName().compareTo(o2.getLastName());
        }
    }

    static {
        defaultPatientsList.add(new Patient("Анна", "Парникова", "Ивановна",
                "ул. Звездная", "0971235467", 100, "Волчанка"));

        defaultPatientsList.add(new Patient("Виктор", "Фирсик", "Александрович",
                "ул. Семафорная", "0971545477", 101, "Васкулит"));

        defaultPatientsList.add(new Patient("Виталий", "Иванов", "Степанович",
                "ул. Звездная", "0971235467", 102, "Аллергия"));

        defaultPatientsList.add(new Patient("Иван", "Голуб", "Витальевич",
                "ул. Звездная", "0971235467", 103, "Галлюцинации"));

        defaultPatientsList.add(new Patient("Виктория", "Коломиец", "Ивановна",
                "ул. Звездная", "0971235467", 104, "Астма"));

        defaultPatientsList.add(new Patient("Анастасия", "Варинкова", "Викторовна",
                "ул. Звездная", "0971235467", 105, "Вирусная инфекция"));

        defaultPatientsList.add(new Patient("Мария", "Новикова", "Ивановна",
                "ул. Звездная", "0971235467", 106, "Волчанка"));

        defaultPatientsList.add(new Patient("Лилия", "Ребрик", "Игоревна",
                "ул. Звездная", "0971235467", 107, "Волчанка"));

        defaultPatientsList.add(new Patient("Евгения", "Данилова", "Александровна",
                "ул. Звездная", "0971235467", 108, "Вирусная инфекция"));

        defaultPatientsList.add(new Patient("Дмитрий", "Турутин", "Романович",
                "ул. Звездная", "0971235467", 109, "Бластомикоз"));

        defaultPatientsList.add(new Patient("Николай", "Нечаев", "Николаевич",
                "ул. Звездная", "0971235467", 110, "Волчанка"));

        defaultPatientsList.add(new Patient("Александр", "Фесс", "Дмитриевич",
                "ул. Звездная", "0971235467", 111, "Гистоплазмоз"));

        defaultPatientsList.add(new Patient("Роман", "Ринов", "Иванович",
                "ул. Звездная", "0971235467", 112, "Иглы в мозгу"));

        defaultPatientsList.add(new Patient("Анна", "Клочкова", "Петровна",
                "ул. Звездная", "0971235467", 113, "Беременность"));

        defaultPatientsList.add(new Patient("Анастасия", "Волочкова", "Игоревна",
                "ул. Звездная", "0971235467", 114, "Волчанка"));
    }
}
