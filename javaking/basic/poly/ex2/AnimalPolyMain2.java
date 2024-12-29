package javaking.basic.poly.ex2;

public class AnimalPolyMain2 {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal caw = new Caw();
        Animal[] animalArr = {dog, cat, caw};

        for (Animal animal : animalArr) {
            System.out.println("동물 소리 테스트 시작");
            animal.sound();
            System.out.println("동물소리 테스트 종료");
        }

    }


}
