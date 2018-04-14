package pract8.task6;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;


public class PersonUtils {

    private List<Person> people;

    public PersonUtils() {
        fillPeopleList();
    }

    public List<Person> collectWarMans() {
        return people.stream()
                .filter(person -> person.getGender() == Gender.MALE && person.getAge() >= 20 && person.getAge() <= 60)
                .collect(Collectors.toList());
    }

    public double countAverageFemalesAge() {
        OptionalInt optionalInt = people.stream()
                .filter(person -> person.getGender() == Gender.FEMALE)
                .mapToInt(Person::getAge)
                .reduce((age1, age2) -> age1 + age2);
        int totalAge;
        if (optionalInt.isPresent()) {
            totalAge = optionalInt.getAsInt();
        }
        else {
            return 0;
        }

        int numOfFemales = (int) people.stream()
                .filter(person -> person.getGender() == Gender.FEMALE)
                .count();

        return (double) totalAge / numOfFemales;
    }

    private void fillPeopleList() {
        people = new ArrayList<>();
        people.add(new Person("Jack", 18, Gender.MALE));
        people.add(new Person("Masha", 19, Gender.FEMALE));
        people.add(new Person("Anna", 22, Gender.FEMALE));
        people.add(new Person("Paul", 25, Gender.MALE));
    }
}

