class Main {
    public static void main(String args[]){
        Persona p1 = new Persona ("Antony Artavia", "306210753", 21);
        Persona p2 = new Persona ("Marcos Mendez",  "403210373", 21);
        Persona p3 = new Persona ("Andres Artavia", "306210752", 21);

        PersonList people = new PersonList();
        people.addPerson(p1);
        people.addPerson(p2);
        people.addPerson(p3);

        Iterator myIterator = people.createIterator();

        while (myIterator.hasNext()) {
            Persona p = (Persona)myIterator.next();
            System.out.println(p.getNombre());
        }
    }
}