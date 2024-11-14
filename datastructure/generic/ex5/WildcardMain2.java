package datastructure.generic.ex5;

import datastructure.generic.animal.Animal;
import datastructure.generic.animal.Cat;
import datastructure.generic.animal.Dog;

public class WildcardMain2 {
    public static void main(String[] args) {
        Box<Object> objectBox = new Box<>();
        Box<Animal> animalBox = new Box<>();
        Box<Dog> dogBox = new Box<Dog>();
        Box<Cat> catBox = new Box<Cat>();

        //Animal 포함 상위 타입 전달 가능
//        writeBox(catBox);
//        writeBox(dogBox);
        writeBox(objectBox);
        writeBox(animalBox);
    }

    static void writeBox(Box<? super Animal> box){
        box.set(new Dog("멍멍이",100));
    }


}
