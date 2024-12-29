package javaking.mid1.immutable.presentation;

public class PersonMain3 {

    public static void main(String[] args) {
        RGB green = new RGB(0,128,0);

        ImmutablePerson4 person = new ImmutablePerson4("messi", green);
        System.out.println(person.getRgb().g);

        green.g = 0;
        System.out.println(person.getRgb().g);

        System.out.println(green);
        System.out.println(person.getRgb());

    }

}
