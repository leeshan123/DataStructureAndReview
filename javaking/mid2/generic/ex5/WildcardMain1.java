package javaking.mid2.generic.ex5;

import javaking.mid2.generic.animal.Animal;
import javaking.mid2.generic.animal.Cat;
import javaking.mid2.generic.animal.Dog;

public class WildcardMain1 {

    public static void main(String[] args) {
        Box<Object> objectBox = new Box<>();
        Box<Dog> dogBox = new Box<Dog>();
        Box<Cat> catBox = new Box<Cat>();

        dogBox.set(new Dog("멍멍이",100));

        WildcardEx.<Dog>printGenericV1(dogBox);
        WildcardEx.printWildCardV1(dogBox);

        WildcardEx.printGenericV2(dogBox);
        WildcardEx.printWildCardV2(dogBox);

        Dog dog = WildcardEx.printAndReturnGeneric(dogBox);

        catBox.set(new Cat("냐옹이",200));
        WildcardEx.printAndReturnWildcard(catBox);

        Animal animal = WildcardEx.printAndReturnWildcard(dogBox);

    }

}
