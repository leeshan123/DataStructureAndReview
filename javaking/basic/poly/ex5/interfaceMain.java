package javaking.basic.poly.ex5;

public class interfaceMain {
    public static void main(String[] args) {
        //추상클래스 생성 불가
//        AbstractAnimal animal = new AbstractAnimal();





        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);

        System.out.println();
        moveAnimal(dog);
        moveAnimal(cat);
        moveAnimal(caw);

    }

    private static void soundAnimal(InterfaceAnimal animal){
        System.out.println("소리 시작");
        animal.sound();
        System.out.println("소리 끝");
    }

    private static void moveAnimal(InterfaceAnimal animal){
        System.out.println("이동 시작");
        animal.move();
        System.out.println("이동 끝");
    }
}
