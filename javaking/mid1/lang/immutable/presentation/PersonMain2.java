package javaking.mid1.lang.immutable.presentation;

public class PersonMain2 {

    public static void main(String[] args) {
        RGB green = new RGB(0,128,0);

        ImmutablePerson3 person = new ImmutablePerson3("messi", green);
        System.out.println(person.getRgb().g);

        green.g = 0;
        System.out.println(person.getRgb().g);

        System.out.println(green);
        System.out.println(person.getRgb());

    }

}
