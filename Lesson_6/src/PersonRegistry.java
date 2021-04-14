public class PersonRegistry {
    private Person[] citizens;

    public PersonRegistry(Person[] citizens) {
        this.citizens = citizens;
    }

    public int countPeople(String sex, int age) {
        for (Person person : citizens) {
            if (sex = MALE)
        }
    }

    public String nameAlexander(String name) {
        int count = 0;
        for (Person person : citizens) {
            Person personsName = person.getName();
            if (personsName.setName().equals(name)) {
                count++;
            }
        }
        return count;
    }

}
