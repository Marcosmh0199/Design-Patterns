public class PersonList implements Aggregate {
    static final int MAX = 10;
    int itemsCount = 0;
    Persona[] people;

    public PersonList (){
        people = new Persona[MAX];
    }

    public void addPerson(Persona pPerson) {
        if(itemsCount >= MAX) {
            System.out.println("La lista esta llena.");
        } else {
            people[itemsCount] = pPerson;
            itemsCount++;
        }
    }

    public PersonaIterator createIterator() {
        return new PersonaIterator(people);
    }
}