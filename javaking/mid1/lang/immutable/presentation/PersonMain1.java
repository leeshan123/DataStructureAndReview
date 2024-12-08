package javaking.mid1.lang.immutable.presentation;

public class PersonMain1 {

    public static void main(String[] args) {
        ImmutablePerson1 person = new NewPerson("messi");
        System.out.println(person.getName());

        NewPerson newPerson = (NewPerson) person;
        newPerson.setName("wow");

        System.out.println(person.getName());
    }

}
