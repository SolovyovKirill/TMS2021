package com.home.office;

public class MilitaryOffice {
    private PersonRegistry personRegistry;

    public MilitaryOffice(PersonRegistry personRegistry) {

        this.personRegistry = personRegistry;
    }

    public PersonRegistry getPersonRegistry() {

        return personRegistry;
    }

    public void setPersonRegistry(PersonRegistry personRegistry) {

        this.personRegistry = personRegistry;
    }

    public int getCountOfPersonWithNameAlex(String name) {//вывод призывников с именем Alex
        Person[] persons = personRegistry.getPersons();
        int count = 0;
        personRegistry.getPersons();
        for (Person person : persons) {
            if (person.getName().equals(name)) {
                count++;
            }
        }
        return count;
    }

    public int countPeople() {//Количество призывников от 18 до 27
        Person[] persons = personRegistry.getPersons();
        int count = 0;
        personRegistry.getPersons();
        for (Person person : persons) {
            if (person.getSex().equals("male") && person.getAge() >= 18 && person.getAge() <= 27) {
                count++;
            }
        }
        return count;
    }

    public int countPeopleByMinsk(String city) {//Количество призывников в городе Минск
        Person[] persons = personRegistry.getPersons();
        int count = 0;
        personRegistry.getPersons();
        for (Person person : persons) {
            if (person.getSex().equals("male") && person.getAge() >= 18 && person.getAge() <= 27 && person.getAddress().getCity().equals(city)) {
                count++;
            }
        }
        return count;
    }

    public int countPeople25_27() {//Количество призывников от 25 до 27
        Person[] persons = personRegistry.getPersons();
        int count = 0;
        personRegistry.getPersons();
        for (Person person : persons) {
            if (person.getSex().equals("male") && person.getAge() >= 25 && person.getAge() <= 27) {
                count++;
            }
        }
        return count;
    }

    public void countPeopleName() {//имена призывников от 18 до 27
        Person[] persons = personRegistry.getPersons();
        personRegistry.getPersons();
        for (Person person : persons) {
            if (person.getSex().equals("male") && person.getAge() >= 18 && person.getAge() <= 27) {
                System.out.println(person.getName());
            }
        }
    }
}