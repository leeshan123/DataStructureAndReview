package javaking.basic.poly.ex6;

import java.sql.SQLOutput;

public class SoundFlyMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();
        Chicken chicken = new Chicken();

        soundAnimal(dog);
        soundAnimal(bird);
        soundAnimal(chicken);

//        flyAnimal(dog);
        flyAnimal(bird);
        flyAnimal(chicken);

    }

    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    private static void flyAnimal(Fly flyAnimal) {
        System.out.println("동물 날기 테스트 시작");
        flyAnimal.fly();
        System.out.println("동물 날기 테스트 종료");
    }

}
