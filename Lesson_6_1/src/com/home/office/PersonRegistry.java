package com.home.office;

public class PersonRegistry {
    private Person[] persons;

    public PersonRegistry(Person[] persons) {
        this.persons = persons;
    }

    public Person[] getPersons() {
        return persons;
    }

    public void setPersons(Person[] persons) {
        this.persons = persons;
    }
}
