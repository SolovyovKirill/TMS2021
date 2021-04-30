public class MainRegistry {
    public static void main(String[] args) {
        Address ivansAddress = new Address("Russia", "Moscow");
        Person ivan = new Person(ivansAddress, 19, "Ivan", Person.MALE);

        Address katyasAddress = new Address("Belarus", "Vitebsk");
        Person katya = new Person(katyasAddress, 27, "Katya", Person.FEMALE);

        Address alexandersAddress = new Address("Belarus", "Minsk");
        Person alexander = new Person(alexandersAddress, 25, "Alexander", Person.MALE);

        Address andreysAddress = new Address("Belarus", "Minsk");
        Person andrey = new Person(andreysAddress, 27, "Andrey", Person.MALE);

        Address kirillsAddress = new Address("Belarus", "Grodno");
        Person kirill = new Person(kirillsAddress, 21, "Kirill", Person.MALE);

        Address vasysAddress = new Address("Belarus", "Brest");
        Person vasya = new Person(vasysAddress, 32, "Vasya", Person.MALE);

        Address dianasAddress = new Address("Belarus", "Polotsk");
        Person diana = new Person(dianasAddress, 20, "Diana", Person.FEMALE);

        PersonRegistry registry = new PersonRegistry(new Person[]{ivan, alexander, andrey, kirill, vasya, diana});


    }
}
