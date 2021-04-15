public class PersonRegistry {
    private Person[] citizens;

    public PersonRegistry(Person[] citizens) {
        this.citizens = citizens;
    }

    public int countPeople(String sex, int age) {//Количество призывников от 18 до 27
        int count = 0;
        for (Person person : citizens) {
            if (sex = MALE && age >= 18 && age <= 27) {
                count++;
            }
        }
        return count;
    }

    public int countPeopleCity(String sex, int age, String city) {//Количество призывников в городе Минск
        int count = 0;
        for (Person person : citizens) {
            Address personsAdress = person.getAddress();
            if (sex = MALE && age >= 18 && age <= 27) {
                personsAdress.getCity().equals(city);
                count++;
            }
        }
        return count;
    }

    public int countPeopleOld(String sex, int age) {//Количество призывников от 25 до 27
        int count = 0;
        for (Person person : citizens) {
            Address personsAdress = person.getAddress();
            if (sex = MALE && age >= 25 && age <= 27) {
                personsAdress.getCity().equals(city);
                count++;
            }
        }
        return count;
    }

    public String nameAlexander(String name) {//Количество призывников с именем Александр
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
