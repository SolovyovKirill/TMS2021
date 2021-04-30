package com.home.office;

public class Main {
    public static void main(String[] args) {
        Address address1 = new Address("Belarus", "Minsk");
        Address address2 = new Address("Belarus", "Vitebs");
        Address address3 = new Address("Belarus", "Minsk");
        Address address4 = new Address("Belarus", "Grodno");
        Person person1 = new Person("Alex", 18, "male", address1);
        Person person2 = new Person("Nikolay", 26, "male", address2);
        Person person3 = new Person("Katya", 23, "female", address3);
        Person person4 = new Person("Kirill", 27, "male", address4);
        Person[] persons = {person1, person2, person3, person4};
        PersonRegistry personRegistry = new PersonRegistry(persons);
        MilitaryOffice militaryOffice = new MilitaryOffice(personRegistry);
        int countNameAlex = militaryOffice.getCountOfPersonWithNameAlex("Alex");
        System.out.println("Призывников с именем Alex " + countNameAlex);//в методе ошибка
        int countPeopleByMinsk = militaryOffice.countPeopleByMinsk("Minsk");
        System.out.println("Призывников в городе " + countPeopleByMinsk);
        int countPeople25_27 = militaryOffice.countPeople25_27();
        System.out.println("Призывников в возрасте от 25 до 27 лет " + countPeople25_27);
        int countPeople = militaryOffice.countPeople();
        System.out.println("Призывники " + countPeople);
        militaryOffice.countPeopleName();
    }
}
