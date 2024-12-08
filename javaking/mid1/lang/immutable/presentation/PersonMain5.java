package javaking.mid1.lang.immutable.presentation;

public class PersonMain5 {

    public static void main(String[] args) {
        RGB green = new RGB(0,128,0);

        ImmutablePerson5 person = new ImmutablePerson5("messi", green);
        System.out.println(person.getRgb().g);

        RGB myRGB = person.getRgb();
        myRGB.g = 0;
        System.out.println(person.getRgb().g);


    }

}
