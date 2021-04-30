public class MilitaryOffice {
    private PersonRegistry personRegistry;

    public MilitaryOffice(PersonRegistry personRegistry) {//конструктор,
        this.personRegistry = personRegistry;
    }

    public int getCountPersonByName(String name) {//в этом методе должна содержаться логика? я не совсем понимаю какая и что на что должно ссылаться
        return personRegistry.nameAlexander(name);
    }


}
