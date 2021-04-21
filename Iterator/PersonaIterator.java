public class PersonaIterator implements Iterator {
    Persona[] people;
    int pos = 0;

    public PersonaIterator(Persona[] pPeople) {
        this.people = pPeople;
    }

    public Object next() {
        Persona myPerson = people[pos];
        pos++;

        return myPerson;
    }

    public Object First() {
        return people[0];
    }

    public Object itemActual() {
        return people[pos];
    }

    public boolean hasNext() {
        if (pos >= people.length ||
            people[pos] == null)
            return false;
        else
            return true;
    }
}